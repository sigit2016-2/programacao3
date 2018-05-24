<%-- 
    Document   : editView
    Created on : May 24, 2018, 7:39:21 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/usuario/salvar">
            <input type="text" name="user.name" disabled value="${user.name}">
            <input type="password" name="user.password" value="${user.password}">
            <button type="submit">Salvar Alterações</button>      
        </form>
    </body>
</html>
