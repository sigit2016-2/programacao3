/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.progIII.vraptor.intercept;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.edu.progIII.vraptor.annotations.Private;
import br.edu.progIII.vraptor.components.UserSession;
import br.edu.progIII.vraptor.controllers.LoginController;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Intercepts
public class AuthenticationIntercept implements Interceptor{

    @Inject
    private Result result;
    @Inject
    private UserSession userSession;
    
    @Override // Você executa a ação quando for interceptado
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) throws InterceptionException {
        if(!userSession.isUserLogged()){
            //Não há usuário logado, então vai logar!
            result.redirectTo(LoginController.class).getLoginView();
        }else{
            //Tem usuário logado, então vai para onde tu iria mesmo. 
            is.next(cm, o);
        }
    }

    @Override //Define se vai interceptar ou não
    public boolean accepts(ControllerMethod cm) {
        //Se a classe estiver anotada com o Private, então será interceptada e método intercept será executado
        return cm.getController().getType().isAnnotationPresent(Private.class);
        
    }
    
}
