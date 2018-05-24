/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.edu.progIII.vraptor.annotations.Private;

/**
 *
 * @author leonardo
 */
@Controller
@Private
public class IndexController {
    
    @Get("/")
    public void index(){
        
    }
    
}
