<%-- 
    Document   : index
    Created on : May 9, 2018, 9:08:51 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciador de Usuários</title>
    </head>
    <body>
        <h1>Ações</h1>
        <a href="${pageContext.request.contextPath}/usuario/novo">Novo Usuário</a>
        <a href="${pageContext.request.contextPath}/usuario/pesquisar">Pesquisar Usuário</a>
    </body>
</html>
