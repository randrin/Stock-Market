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
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src='//production-assets.codepen.io/assets/common/stopExecutionOnTimeout-b2a7b3fe212eaa732349046d8416e00a9dec26eb7fd347590fbced3ab38af52e.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
	<script src='https://use.fontawesome.com/2188c74ac9.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>
	<link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css'><link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'><link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css'>
	<link rel="stylesheet" type="text/css" href="css/dashboard.css"/>
	<script src="js/dashboard.js"></script>
	<title>Dashboard - Business Stock Produits</title>
</head>
<body class="sidebar-is-reduced">
  <header class="l-header">
    <div class="l-header__inner clearfix">
      <div class="c-header-icon js-hamburger">
        <div class="hamburger-toggle"><span class="bar-top"></span><span class="bar-mid"></span><span class="bar-bot"></span></div>
      </div>
      <div class="c-header-icon has-dropdown"><span class="c-badge c-badge--header-icon animated shake">12</span><i class="fa fa-bell"></i>
        <div class="c-dropdown c-dropdown--notifications">
          <div class="c-dropdown__header"></div>
          <div class="c-dropdown__content"></div>
        </div>
      </div>
      <div class="c-search">
        <input class="c-search__input u-input" placeholder="Search..." type="text"/>
      </div>
      <div class="header-icons-group">
        <div class="c-header-icon logout"><i class="fa fa-power-off"></i></div>
      </div>
    </div>
  </header>
  <div class="l-sidebar">
    <div class="logo">
      <div class="logo__txt">O</div>
    </div>
    <div class="l-sidebar__content">
      <nav class="c-menu js-menu">
        <ul class="u-list">
          <li class="c-menu__item is-active" data-toggle="tooltip" title="Proposals">
            <div class="c-menu__item__inner"><i class="fa fa-file-text-o"></i>
              <div class="c-menu-item__title"><span>Proposals</span></div>
            </div>
          </li>
          <li class="c-menu__item has-submenu" data-toggle="tooltip" title="History">
            <div class="c-menu__item__inner"><i class="fa fa-history"></i>
              <div class="c-menu-item__title"><span>History</span></div>
            </div>
          </li>
          <li class="c-menu__item has-submenu" data-toggle="tooltip" title="Accounts">
            <div class="c-menu__item__inner"><i class="fa fa-address-book-o"></i>
              <div class="c-menu-item__title"><span>Accounts</span></div>
            </div>
          </li>
          <li class="c-menu__item has-submenu" data-toggle="tooltip" title="Settings">
            <div class="c-menu__item__inner"><i class="fa fa-cogs"></i>
              <div class="c-menu-item__title"><span>Settings</span></div>
            </div>
          </li>
        </ul>
      </nav>
    </div>
  </div>
<main class="l-main">
  <div class="content-wrapper content-wrapper--with-bg">
    
        <div class="list-group">
        <a href="#" class="list-group-item">
            <div class="media col-md-3">
                <figure class="pull-left">
                    <img class="media-object img-rounded img-responsive" src="http://placehold.it/140x100" alt="placehold.it/140x100" >
                </figure>
            </div>
            <div class="col-md-5">
                <h4 class="list-group-item-heading pb-3"> Olympic </h4>
                <p class="list-group-item-text"> Proposal to implement best in class enterprise permissioning system to manage signature accumulation and hierarchy management</p>
            </div>
            <div class="col-md-3 pull-left">
                <div class = "container col-md-12">
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> General Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> Project Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-square"></i> Tech Lead</div>
                    </div>
                </div>
            </div>
            <div class="col-md-1 text-center">
                <p> 2 <small> approvals </small></p>
                <button type="button" class="btn btn-primary btn-sm btn-block">Open</button>
            </div>
        </a>
        <a href="#" class="list-group-item">
            <div class="media col-md-3">
                <figure class="pull-left">
                    <img class="media-object img-rounded img-responsive" src="http://placehold.it/140x100" alt="placehold.it/140x100" >
                </figure>
            </div>
            <div class="col-md-5">
                <h4 class="list-group-item-heading pb-3"> Olympic </h4>
                <p class="list-group-item-text"> Proposal to implement best in class enterprise permissioning system to manage signature accumulation and hierarchy management</p>
            </div>
            <div class="col-md-3 pull-left">
                <div class = "container col-md-12">
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> General Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> Project Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-square"></i> Tech Lead</div>
                    </div>
                </div>
            </div>
            <div class="col-md-1 text-center">
                <p> 2 <small> approvals </small></p>
                <button type="button" class="btn btn-primary btn-sm btn-block">Open</button>
            </div>
        </a>
        <a href="#" class="list-group-item">
            <div class="media col-md-3">
                <figure class="pull-left">
                    <img class="media-object img-rounded img-responsive" src="http://placehold.it/140x100" alt="placehold.it/140x100" >
                </figure>
            </div>
            <div class="col-md-5">
                <h4 class="list-group-item-heading pb-3"> Olympic </h4>
                <p class="list-group-item-text"> Proposal to implement best in class enterprise permissioning system to manage signature accumulation and hierarchy management</p>
            </div>
            <div class="col-md-3 pull-left">
                <div class = "container col-md-12">
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> General Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-check-square"></i> Project Manager</div>
                    </div>
                    <div class = "row">
                        <div class="col-md-12 pull-left"><i class="fa fa-square"></i> Tech Lead</div>
                    </div>
                </div>
            </div>
            <div class="col-md-1 text-center">
                <p> 2 <small> approvals </small></p>
                <button type="button" class="btn btn-primary btn-sm btn-block">Open</button>
            </div>
        </a>
    </div>
    
  </div>
</main>
</body>
</html>