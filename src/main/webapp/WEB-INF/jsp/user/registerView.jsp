<%-- 
    Document   : registerView
    Created on : May 9, 2018, 9:41:44 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Usuário</title>
    </head>
    <body>
        <h1>Novo Usuário</h1>
        <form method="post" action="${pageContext.request.contextPath}/usuario/salvar">
            <input type="text" name="user.name">
            <input type="password" name="user.password">
            <button type="submit">Salvar</button>      
        </form>
        <c:choose>
            <c:when test="${userSession.users.size() eq 0}"> 
                <p>Não há usuários cadastrados!</p>
            </c:when>
            <c:otherwise>
                <a  href="${pageContext.request.contextPath}/usuario/apagar">Apagar</a>
                <table border="1" style="margin-top: 10px;">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Senha</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${userSession.users}" var="user">
                            <tr>
                                <td>${user.name}</td> 
                                <td>${user.password}</td> 
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>    
            </c:otherwise>    
        </c:choose>    
    </body>
</html>
