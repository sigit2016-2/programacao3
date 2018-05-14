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
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 *
 * @author leonardo
 */
@Controller
@Path("usuario")
public class UserController {
  
    
    @Inject
    private Result result;
    
//    @Inject
    private HttpSession session;
    
    @Get("novo")
    public void registerView(){
    
    }
    
    @Post("salvar")
    public void save(User user){
        List<User> userList = new ArrayList<>();
        userList.add(user);
       result.include("userList", userList);
       result.redirectTo(this).registerView();
    }
    
}
