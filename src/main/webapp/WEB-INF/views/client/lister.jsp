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
        
        <a href='<spring:url value="/client/ajouter/${c.id}"/>'>Ajouter un Client </a>   
    <contenue>
        <table border="">
            <tr>
                <th> Nom: </th>
                <th> Prenom: </th>
                <th> Numéro de Rue </th>
                <th> Nom de Rue </th>
                <th> Localité </th>
                <th> Code Postale</th>
                <th> Pays </th>
                <th> Action </th>
                
               
            </tr>
        <c:forEach items="${listeClients}" var="c">
            <tr>
                <td>${c.nom}</td>
                <td>${c.prenom}</td>
                <td>${c.adresse.num}</td>
                <td>${c.adresse.rue}</td>
                <td>${c.adresse.localite}</td>
                <td>${c.adresse.zip}</td>
                <td>${c.adresse.pays}</td>
                
                
                
                <td>
                       <a href='<spring:url value="/client/supprimer/${c.id}"/>'>Supprimer</a>   
                
                       <a href='<spring:url value="/client/modifier/${c.id}"/>'>Modifier</a>
                </td>
            </tr>
        </c:forEach>
            
        </table>
        
    </contenue>
        <c:import url="../_PIED.jsp"></c:import>
</html>
