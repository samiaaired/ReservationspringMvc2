<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <contenue>
        <h1> Identification </h1>
    <form:form modelAttribute="utilDTO">
        <label> Identifiant</label>
        <form:input path="identifiant"/>
        <label> Mot de Passe</label>
        <form:input path="motDePasse"/>
        <input type="submit"/>
    </form:form>
    </contenue>
    <br>
    <br>
    <br>
        <c:import url="_PIED.jsp"></c:import>
    </body>
</html>
