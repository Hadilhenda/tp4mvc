<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="NP" class="modele.authen" scope="session"></jsp:useBean>
<html>
<head>
<meta charset="ISO-8859-1">
<title>authentification</title>
</head>
<body style="background: orange";>
<form action="authentification.html" method="post">
 <p> <h3>${ message }</h3></p>


<jsp:setProperty property="nom" name="NP"/>
<jsp:setProperty property="prenom" name="NP"/>
<p>
<h4>Prenom : <%= request.getAttribute("prenom") %></h4>
<h4>Nom : <%= request.getAttribute("nom") %></h4> <br>
</body>
</html>