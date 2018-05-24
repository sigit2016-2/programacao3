<%-- 
    Document   : usersView
    Created on : May 24, 2018, 7:14:05 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <label for="inputField">Pesquisar</label>
            <input id="inputField" type="text" name="query">
            <button type="submit">Pesquisar</button>
        </form>
         <c:choose>
            <c:when test="${userList.size() eq 0}"> 
                <p>Não há usuários cadastrados!</p>
            </c:when>
            <c:otherwise>
                <table border="1" style="margin-top: 10px;">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Senha</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${userList}" var="user">
                            <tr>
                                <td>${user.name}</td> 
                                <td>${user.password}</td> 
                                <td>
                                    <a href="${pageContext.request.contextPath}/usuario/editar/${user.name}">Editar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>    
            </c:otherwise>    
        </c:choose>    
    </body>
</html>
