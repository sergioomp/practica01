/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.Controller;

import com.practica01.Service.ArbolesService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/arbol")
public class ArbolesController {
    
    
    @Autowired
    private ArbolesService arbolesService;
    
     @GetMapping("/listado")
    public String listado(Model model){
        var listado = arbolesService.getArboles(false);
        
        //pasar info de un java class a interface
        model.addAttribute("arboles",listado);
        model.addAttribute("totalArboles", listado.size());
   
        return "/arbol/listado";
    } 
        
}
