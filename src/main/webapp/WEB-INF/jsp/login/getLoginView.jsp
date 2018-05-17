<%-- 
    Document   : getLoginView
    Created on : May 17, 2018, 6:54:49 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>${msgLoginError}</p>
        <form action="${pageContext.request.contextPath}/autenticar" method="post">
            <input type="text" name="user.name" value="" />
            <input type="password" name="user.password" value="" />
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>
