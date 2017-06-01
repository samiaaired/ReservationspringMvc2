<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="cheminModif">
    <spring:url value="/chambre/modifier"/>
</c:set>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="../_MENU.jsp"></c:import>
    <contenu>
       <h1>Modification chambre</h1>
            
         
        <form:form modelAttribute="chambre" action="${cheminModif}">
            <form:hidden path="id"/>
            <label>Nom hotel:</label>
            <form:select items="${hotels}" itemLabel="nom" itemValue="id" path="hotel.id"/>
            <br>
            <br>
            
            <label>Nom Chambre:</label>
            <form:input path="nom"/>
            <br><br>
            <label>Numero chambre:</label>
            <form:input path="num"/>
            <br><br>
            <label>Prix:</label>
            <form:input path="prix"/>
            <br><br>
            <input type="Submit"/>
        </form:form>
        </contenu>
       
    </body>
</html>