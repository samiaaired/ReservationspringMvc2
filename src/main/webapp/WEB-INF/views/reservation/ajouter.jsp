<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <c:import url="../_MENU.jsp"></c:import>
    <contenu>
         <h1>Ajout d'une nouvelle  </h1>
    <form:form modelAttribute="reservation">
        <label>  Chambre </label>
        <form:checkboxes  items="${listechambres}" itemLabel="nom" itemValue="id" path="chambre.id"/>
        <label> Date reservation</label>
        <form:input  path="dateReservation"/>
        <br>
        <label> Date Sortie </label>
        <form:input  path="dateSortie"/>
        <br>
        <input type="submit"/>
    </form:form>
    </contenu>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>
