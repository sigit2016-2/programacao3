/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.progIII.vraptor.annotations.Private;
import br.edu.progIII.vraptor.components.UserSession;
import br.edu.progIII.vraptor.model.User;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
public class LoginController {
    
    @Inject
    private UserSession userSession;
    @Inject
    private Result result;
    
    @Get("login")
    @Private
    public void getLoginView(){
                
    }
    
    @Post("autenticar")
    public void authenticate(User user){
        System.out.println("LoginController "  + user);
       if (userSession.getUsers().get(0).equals(user)){
          userSession.setUserLogged(user);
          result.redirectTo(UserController.class).registerView();
       }else{
           //Mandar de volta para view de login
           //Como mensagem de erro. 
          result.include("msgLoginError", "Usuário ou senha inválidos!");
          result.redirectTo(this).getLoginView();
       }
    }
}
