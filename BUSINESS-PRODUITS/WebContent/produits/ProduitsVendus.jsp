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
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-2.1.0.min.js" ></script>
	<link rel="stylesheet" type="text/css" href="css/produits.css"/>
	<title>Business Stock Produits</title>
</head>
<body>
<%@include file="Header.jsp"%>
	<div class="container col-md-10 col-md-offset-1" style="padding-top: 50px;">
		<div class="panel panel-primary">
			<div class="panel-heading"><h4><strong><i class="fa fa-shopping-basket"></i> Produits Vendus</strong><strong style="float: right;">Montant Vendu : ${produitMBeans.montantTotalProduitsVendus} Fcfa</strong></h4></div>
			<div class="panel-body">
			<h3><strong>Dans cette section, vous trouverez les produits déjà vendus.</strong></h3><br>
			<form action="rechercherProduitsVendus.php" method="get">
				<br>
					<div class="form-group">
						<label class="control-label col-md-2">Mot de Clè :</label>
						<div class="col-md-8">
							<input type="text" name="motCle" value="${produitMBeans.motCle}" class="form-control" placeholder="&#xF002; Recherche produit ..." style="font-family:Arial, FontAwesome;"/>
						</div>
						<button type="submit" class="btn btn-danger"><strong><i class="fa fa-spinner fa-spin"></i> Recherche</strong></button>
					</div>
					<br>
					<div class="col-md-8">
						<c:if test="${produitMBeans.rechercheProduit}">
							<p id="incorrectAccess"><strong style="color:red;">${produitMBeans.nombreProduit} </strong> produit (s) trouvé (s)</p>
						</c:if>
					</div>
				</form>
				<br>
				<br>
				<br>
				<br>
				<table class="table table-striped table1">
					<tr>
						<th>ID Produit</th>
						<th>Description Produit</th>
						<th>Catègorie Produit</th>
						<th>Quantité Produit</th>
						<th>Prix Produit (Fcfa)</th>
						<th>Date de Vente Produit</th>
					</tr>
					<c:forEach items="${produitMBeans.produitVendu}" var="p">
						<tr>
							<td>${p.idProduit}</td>
							<td>${p.descriptionProduit}</td>
							<td>${p.categorieProduit}</td>
							<td>${p.quantiteProduit}</td>
							<td>${p.prixProduit}</td>
							<td>${p.dateDeVenteProduit}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<script src="js/login.js"></script>
</body>
</html>