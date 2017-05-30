<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>

<%@taglib prefix="spring" uri= "http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="cheminModif">
    <spring:url value="/hotel/modifier"/>
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
            <h1>Modification hotel</h1>
            
         
        <form:form modelAttribute="hotel" action="${cheminModif}">
            <form:hidden path="id"/>
            <label>Nom hotel:</label>
            <form:input path="nom"/>
            <br>
            <label>Rue:</label>
            <form:textarea path="adresse.rue"/>
            <br>
            <input type="Submit"/>
        </form:form>
        </contenu>
        <c:import url="../_PIED.jsp"></c:import>
</body>
</html>