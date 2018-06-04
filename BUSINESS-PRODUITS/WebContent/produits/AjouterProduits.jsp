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
	<div class="container col-md-10 col-md-offset-1" style="padding-top: 50px;">
		<div class="panel panel-primary">
			<div class="panel-heading"><h4><strong><i class="fa fa-cart-arrow-down fa-lg"></i> Ajouter Produits</strong></h4></div>
			<div class="panel-body">
			<h3><strong>Dans cette section, vous pouvez ajouter des nouveaux produits.</strong></h3><br>
				<form action="saveProduitStock.php" method="post">
					<!-- Description Produit -->
					<div class="form-group">
						<label class="control-label">Description Produit :</label>
						<input type="text" name="descriptionProduit" value="${produit.descriptionProduit}" class="form-control" placeholder="Entrer une description ...."/>
						<span></span>
					</div>
					<!-- Categorie Produit -->
					<div class="form-group">
                    	<label for="control-label">Catègorie Produit :</label>
                        <select name="categorieProduit" id="categorieProduit" class="form-control" required="">
                      		<option value="Produit Mode et Fashion">Produit Mode et Fashion</option>
                        	<option value="Produit Alimentaire">Produit Alimentaire</option>
                        	<option value="Produit Technologique">Produit Technologique</option>
                        	<option value="Produit Santé et Beauté">Produit Santé et Beauté</option>
                        	<option value="Autres">Autres</option>
                       	</select>
                    </div>
					<!-- Prix Produit -->
					<div class="form-group">
						<label class="control-label">Prix Produit :</label>
						<input type="text" name="prixProduit" value="${produit.prixProduit}" class="form-control"/>
						<span></span>
					</div>
					<!-- Quantité Produit -->
					<div class="form-group">
						<label class="control-label">Quantité Produit :</label>
						<input type="text" name="quantiteProduit" value="${produit.quantiteProduit}" class="form-control"/>
						<span></span>
					</div>
					<br>
					<!-- Button Ajouter Produit -->
					<button type="submit" class="btn btn-success"><strong><i class="fa fa-cart-arrow-down"></i> Ajouter</strong></button>
					<!-- Button Abandonner Produit -->
					<a href="produitsStock.php" class="btn btn-danger"><strong><i class="fa fa-thumbs-o-down"></i> Abandonner</strong></a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>