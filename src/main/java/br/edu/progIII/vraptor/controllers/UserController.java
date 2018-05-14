/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.progIII.vraptor.model.User;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
@Path("usuario")
public class UserController {
  
    
    @Inject
    private Result result;
    
    @Get("novo")
    public void registerView(){
    
    }
    
    @Post("salvar")
    public void save(User user){
       result.include("user", user);
       result.redirectTo(this).registerView();
    }
    
}
