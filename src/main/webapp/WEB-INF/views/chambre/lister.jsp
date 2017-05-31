<%-- 
    Document   : lister
    Created on : 31 mai 2017, 15:26:18
    Author     : formation
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <c:import url="../_MENU.jsp"></c:import>
        
        <a href='<spring:url value="/chambre/ajouter/${c.id}"/>'>Ajouter une chambre</a>   
    <contenue>
        <table>
        <c:forEach items="${ListesChambre}" var="c">
            <tr>
                <td>${c.nom}</td>
                <td>${c.prix}</td>
                <td>
                       <a href='<spring:url value="/chambre/supprimer/${c.id}"/>'>Supprimer</a>   
                </td>
                <td>
                       <a href='<spring:url value="/chambre/modifier/${c.id}"/>'>Modifier</a>
                </td>
            </tr>
        </c:forEach>
            
        </table>
        
    </contenue>
        <c:import url="../_PIED.jsp"></c:import>
</html>
