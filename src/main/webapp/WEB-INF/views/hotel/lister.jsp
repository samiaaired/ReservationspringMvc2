<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="../_MENU.jsp"></c:import>
        
        <a href='<spring:url value="/hotel/ajouter/${h.id}"/>'>Ajouter un hotel</a>   
    <contenue>
        <table>
        <c:forEach items="${ListeHotels}" var="h">
            <tr>
                <td>${h.nom}</td>
                <td>${h.adresse.rue}</td>
                <td>
                       <a href='<spring:url value="/hotel/supprimer/${h.id}"/>'>Supprimer</a>   
                </td>
                <td>
                       <a href='<spring:url value="/hotel/modifier/${h.id}"/>'>Modifier</a>
                </td>
            </tr>
        </c:forEach>
            
        </table>
        
    </contenue>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>