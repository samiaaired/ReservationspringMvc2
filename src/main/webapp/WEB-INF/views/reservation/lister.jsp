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
        
        <a href='<spring:url value="/reservation/ajouter/${r.id}"/>'>Ajouter une reservation</a> 
        <br><br>
    <contenue>
        <table border="1px">
       
            <tr>
                <th> Date Reservation</th>
                <th> Etat reservation </th>
                <th> Date de Sortie </th>
                <th> Client </th>
                 <c:forEach items="${ListeReservations}" var="r">
                 
            <tr>
                <td>${r.dateReservation}</td>
                <td>${r.etatReservation}</td>
                <td>${r.dateSortie}</td>
                
                
                <td>
                       <a href='<spring:url value="/reservation/supprimer/${r.id}"/>'>Supprimer</a>   
            
                       <a href='<spring:url value="/reservation/modifier/${r.id}"/>'>Modifier</a>
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