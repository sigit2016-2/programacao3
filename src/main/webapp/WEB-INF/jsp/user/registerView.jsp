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
         ${user.name} - ${user.password}   
            <table>
                <tr></tr>
                <%--
                <c:forEach items="${userList}" var="user"> 
                    ${user.name}
                </c:forEach> --%>
            </table>    
    </body>
</html>
