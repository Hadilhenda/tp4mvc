<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="client2" class="modele.client1" scope="session"></jsp:useBean>
<%! String titre=" " ; %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>client</title>
</head>
<body style="background: lightblue">
<form action="client.html" method="post">
        <p >${ message }</p>
        
        <p>Nom :<%= request.getAttribute("nom") %></p>
        <p>Prénom :<%= request.getAttribute("prenom") %></p>
        <p>Adresse : <%= request.getAttribute("adresse") %></p>
        <p>Numéro de téléphone :<%= request.getAttribute("telephone") %> </p>
        <p>Email :<%= request.getAttribute("email") %> </p>
</body>
</html>