/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.Service.impl;

import com.practica01.Service.ArbolesService;
import com.practica01.dao.ArbolesDao;
import com.practica01.domain.Arbol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolesServiceImpl  implements ArbolesService{
    
    @Autowired
    private ArbolesDao arbolesDao;

    @Transactional(readOnly=true)
    @Override
    public List<Arbol> getArboles(boolean activos) {
        var listado = arbolesDao.findAll();
        
        
        if (activos) {
            listado.removeIf(c -> !c.isActivo());
        }
        
        return listado;
        
    }
    
     @Transactional(readOnly=true)
    public Arbol getArboles(Arbol arboles) {
       return arbolesDao.findById(arboles.getIdArbol()).orElse(null);
    }
 
    @Override
     @Transactional
    public void delete(Arbol arboles) {
        arbolesDao.delete(arboles);
    }
 
    @Override
     @Transactional
    public void save(Arbol arboles) {
        arbolesDao.save(arboles);    
    
    }


    @Override
    public Arbol getArbol(Arbol arboles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
