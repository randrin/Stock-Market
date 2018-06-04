<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="icon" type="image/gif/png" href="img/Logo_Produits.png">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-2.1.0.min.js" ></script>
	<link rel="stylesheet" type="text/css" href="css/login.css"/>
	<title>Login - Business Stock Produits</title>
</head>
	<body>
		<form action="LoginController.asp" method="post">
			<div id="formWrapper">
	        	<div id="form">
	           		<div class="logo">
	                    <h1 class="text-center"><strong>Stock<span style="color: blue;">Market</span></strong></h1>
	               	</div>
	                <div class="form-item">
	                	<p class="formLabel"><strong><i class="fa fa-user-circle-o"></i> Identifiant</strong></p>
	                    <input type="text" name="nom" id="nom" class="form-style" autocomplete="off"/>
	               	</div>
	                <div class="form-item">
	                	<p class="formLabel"><strong><i class="fa fa-unlock-alt"></i> Mot de Passe</strong></p>
	                    <input type="password" name="pwd" id="pwd" class="form-style" />
	                    <br>
	                    <p><a href="#"><small><strong>Mot de Passe oublié ?</strong></small></a></p>
	                </div>
	                <div class="form-item">
	                	<p class="pull-left"><a href="#"><small><strong>Enregistrez-vous</strong></small></a></p>
	                    <button type="submit" class="login pull-right ">
	                    	<i class="fa fa-send-o"></i> Login
	                    </button>
	                    <br>
	                    <br>
	                   	<div class="clear-fix"></div>
	               	</div>
	               	<c:if test="${not empty errorMessage}">
	                	<p id="incorrectAccess"><strong style="color:red;">${errorMessage}</strong></p>
	              	</c:if>
	        	</div>
	        </div>
		</form>
	   	<script src="js/login.js"></script>
	</body>
</html>