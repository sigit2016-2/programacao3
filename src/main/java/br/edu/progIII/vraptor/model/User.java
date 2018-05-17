/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.model;

import java.util.Objects;

/**
 *
 * @author leonardo
 */

public class User {
   
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        User objUser = (User) obj;
        boolean result = false;
        if (this.name.equalsIgnoreCase(objUser.getName()) &&
                this.password.equalsIgnoreCase(objUser.getPassword())){
           result= true;
        }
        return result;
    }

   

    

    
    
    
}
