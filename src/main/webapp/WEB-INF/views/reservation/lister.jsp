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
        <br><br>
    <contenue>
        <table border="1px">
       
            <tr>
                <th> Date Reservation</th>
                <th> Etat reservation </th>
                <th> Nom de Rue </th>
                <th> Localité </th>
                <th> Code Postale</th>
                <th> Pays </th>
                <th> Action </th>
                 <c:forEach items="${ListeHotels}" var="h">
            <tr>
                <td>${h.nom}</td>
                <td>${h.adresse.num}</td>
                <td>${h.adresse.rue}</td>
                <td>${h.adresse.localite}</td>
                <td>${h.adresse.zip}</td>
                <td>${h.adresse.pays}</td>
                
                
                <td>
                       <a href='<spring:url value="/hotel/supprimer/${h.id}"/>'>Supprimer</a>   
            
                       <a href='<spring:url value="/hotel/modifier/${h.id}"/>'>Modifier</a>
                </td>
            </tr>
                
            </tr>
        </c:forEach>
            
        </table>
        
    </contenue>
    <br><br><br><br>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>