<%-- 
    Document   : _TAMPLATE
    Created on : 29 mai 2017, 14:29:22
    Author     : Administrateur
--%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix ="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="cheminAjout">
      <spring:url value="/hotel/ajouter"/>
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
        
         <h1>Ajout hotel</h1>
    <form:form modelAttribute="hotel" action="${cheminAjout}">
        <label> Nom Hotel </label>
        <form:input path="nom"/> 
        <br>
        <label> Adresse:</label>
        <label> Numero de rue:</label>
        <form:input path="adresse.num"/>
        <br>
        <label> Nom de Rue </label>
        <form:input path="adresse.rue"/>
        <br>
        <label> Localité </label>
        <form:input path="adresse.localite"/>
        <br>
        <label> Code Postale </label>
        <form:input path="adresse.zip"/>
        <br>
        <label> Pays </label>
        <form:input path="adresse.pays"/>
        <br>
        <input type="Submit"/>
        
    </form:form>
    </contenu>
        <c:import url="../_PIED.jsp"></c:import>
    </body>
</html>
