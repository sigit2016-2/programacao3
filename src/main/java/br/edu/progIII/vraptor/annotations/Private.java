/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author leonardo
 */
@Retention(RetentionPolicy.RUNTIME)//Informação (Metainformação) disponível em tempo de execução.
@Target({ElementType.TYPE, ElementType.METHOD}) //Anotação pode ser usada em atributos ou em classes
public @interface Private {
    
}
