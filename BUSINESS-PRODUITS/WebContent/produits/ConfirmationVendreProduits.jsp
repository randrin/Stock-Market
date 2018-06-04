<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" type="image/gif/png" href="img/Logo_Produits.png">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/produits.css"/>
<title>Business Stock Produits</title>
</head>
<body>
<%@include file="Header.jsp"%>
	<div class="container col-md-8 col-md-offset-2" style="padding-top: 50px;">
		<div class="panel panel-primary">
			<div class="panel-heading"><h4><strong><i class="fa fa-check-circle fa-lg"></i> Confirmation Vendre Produits</strong></h4></div>
			<div class="panel-body">
			<h3 style="color: red;"><strong>Voulez vous vendre ce produit?</strong></h3><br>
					<!-- ID Produit -->
					<div class="form-group">
						<label>ID Produit : </label>
						<label>${produitAvendre.idProduit}</label>
					</div>
					<!-- Description Produit -->
					<div class="form-group">
						<label>Description Produit : </label>
						<label>${produitAvendre.descriptionProduit}</label>
					</div>
					<!-- Description Produit -->
					<div class="form-group">
						<label>Description Produit : </label>
						<label>${produitAvendre.categorieProduit}</label>
					</div>
					<!-- Prix Produit -->
					<div class="form-group">
						<label>Prix Produit : </label>
						<label>${produitAvendre.prixProduit} Fcfa</label>
					</div>
					<!-- Quantité Produit -->
					<div class="form-group">
						<label>Quantité Produit : </label>
						<label>${produitAvendre.quantiteProduit}</label>
					</div>
					<br>
					<a href="ConfirmationVendreProduitStock.php?id=${produitAvendre.idProduit}" class="btn btn-success"><strong><i class="fa fa-thumbs-o-up"></i> Vendre</strong></a>
					<a href="produitsStock.php" class="btn btn-danger"><strong><i class="fa fa-thumbs-o-down"></i> Abandonner</strong></a>
			</div>
		</div>
	</div>
</body>
</html>