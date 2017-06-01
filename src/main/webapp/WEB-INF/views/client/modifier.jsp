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
    <spring:url value="/client/modifier"/>
</c:set>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="../_MENU.jsp"></c:import>
    <contenu >
            <h1>Modification Chambre</h1>
            
           
        <form:form modelAttribute="client" action="${cheminAjout}">
        <label> Nom Client</label>
        <form:input path="nom"/> 
        <br><br>
        <label> Prénom Client</label>
        <form:input path="prenom"/> 
        <br><br>
        
        <label> Adresse:</label>
        <br><br>
        <label> Numero de rue:</label>
        <form:input path="adresse.num"/>
        <br><br>
        <label> Nom de Rue </label>
        <form:input path="adresse.rue"/>
        <br><br>
        <label> Localité </label>
        <form:input path="adresse.localite"/>
        <br><br>
        <label> Code Postale </label>
        <form:input path="adresse.zip"/>
       <br><br>
        <label> Pays </label>
        <form:input path="adresse.pays"/>
       <br><br>
        <input type="Submit"/>
        
    </form:form>
        </contenu>
    <br><br><br><br>
        <c:import url="../_PIED.jsp"></c:import>
</body>
</html>