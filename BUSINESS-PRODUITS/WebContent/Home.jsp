<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="icon" type="image/gif/png" href="img/Logo_Produits.png">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/highcharts-more.js"></script>
	<script src="js/dashboard.js"></script>
	<link rel="stylesheet" type="text/css" href="css/produits.css"/>
	<title>Business Stock Produits</title>
</head>
<body>
<%@include file="produits/Header.jsp"%>
	<div class="container col-md-10 col-md-offset-1" style="padding-top: 50px;">
		<div class="row">
		<!-- Panel Welcome -->
		<div class="col-lg-12 col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="row">
		              <div class="col-xs-6">
		              	<h1>Welcome ${userBean.prenomUsager}</h1>
		              	<br>
		              	<p>Dernière connexion : ${userBean.derniereConnectUser}</p>
		              </div>
		            </div>
				</div>
			</div>
		</div>
		<!-- Panel Administrateur -->
	      <div class="col-lg-4 col-md-4">
	        <div class="panel panel-info">
	          <div class="panel-heading">
	            <div class="row">
	              <div class="col-xs-6">
	                <i class="fa fa-address-card-o fa-5x"></i>
	              </div>
	              <div class="col-xs-6 text-right">
	                <p class="announcement-heading"><strong>Administrateur</strong></p>
	                <p class="announcement-text"><strong>${userBean.prenomUsager}</strong></p>
	              </div>
	            </div>
	          </div>
	          <a href="#">
	            <div class="panel-footer">
	              <div class="row">
	                <div class="col-xs-6">
	                  <strong>Details</strong>
	                </div>
	                <div class="col-xs-6 text-right">
	                  <i class="fa fa-arrow-circle-right"></i>
	                </div>
	              </div>
	            </div>
	          </a>
	        </div>
	      </div>
	      <!-- Panel Produits Stock -->
	      <div class="col-lg-4 col-md-4">
	        <div class="panel panel-warning">
	          <div class="panel-heading">
	            <div class="row">
	              <div class="col-xs-6">
	                <i class="fa fa-barcode fa-5x"></i>
	              </div>
	              <div class="col-xs-6 text-right">
	                <p class="announcement-heading"><strong>Produits en Stock</strong></p>
	                <p class="announcement-text"><strong>${userBean.produitsStock.quantiteProduit}</strong></p>
	              </div>
	            </div>
	          </div>
	          <a href="#">
	            <div class="panel-footer">
	              <div class="row">
	                <div class="col-xs-6">
	                  <strong>Details</strong>
	                </div>
	                <div class="col-xs-6 text-right">
	                  <i class="fa fa-arrow-circle-right"></i>
	                </div>
	              </div>
	            </div>
	          </a>
	        </div>
	      </div>
	      <!-- Panel Produits Vendus -->
	      <div class="col-lg-4 col-md-4">
		    <div class="panel panel-success">
	          <div class="panel-heading">
	            <div class="row">
	              <div class="col-xs-6">
	                <i class="fa fa-money fa-5x"></i>
	              </div>
	              <div class="col-xs-6 text-right">
	                <p class="announcement-heading"><strong>Produits Vendus</strong></p>
	                <p class="announcement-text"><strong>${userBean.produitsVendus.montantTotalProduitsVendus} Fcfa</strong></p>
	              </div>
	            </div>
	          </div>
	          <a href="produits/ProduitsVendus.jsp">
	            <div class="panel-footer">
	              <div class="row">
	                <div class="col-xs-6">
	                  <strong>Details</strong>
	                </div>
	                <div class="col-xs-6 text-right">
	                  <i class="fa fa-arrow-circle-right"></i>
	                </div>
	              </div>
	            </div>
	          </a>
	        </div>
		</div>
	    </div>
	   <!-- Panel Produits Vendus -->
	    <div class="col-md-6">
	    	<div id='grafico1' class="grafico"></div>
		</div>
		<!-- Panel Produits Vendus -->
		<div class="col-md-6">
		    <div id='grafico2' class="grafico"></div>
		</div>
		<!-- Panel Produits Vendus -->
		<div class="col-md-6">
		    <div id='grafico3' class="grafico"></div>
		</div>
		<!-- Panel Produits Vendus -->
		<div class="col-md-6">
		    <div id='grafico4' class="grafico" style="height: 400px;"></div>
		</div>
	</div>
</body>
</html>