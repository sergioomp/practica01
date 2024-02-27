/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.Service;

import com.practica01.domain.Arbol;
import java.util.List;

/**
 *
 * @author andre
 */
public interface ArbolesService {
    
    //Recupera una ista de registros de la tabla arboles
    public List<Arbol> getArboles(boolean activos);
    
    
    //Recupera un registro de la tabla arboles, buscando
    //e; atributo idCategoria
    
    public Arbol getArbol(Arbol arboles);
    
    //elimina un registro de la tabla arboles si encuentra un regsityo con el id pasado
    
    public void delete (Arbol arboles);
    

    
    public void save (Arbol arboles);
}
