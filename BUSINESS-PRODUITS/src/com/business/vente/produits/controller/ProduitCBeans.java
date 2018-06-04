package com.business.vente.produits.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.dao.IProduitsDao;
import com.business.vente.produits.daoImpl.IProduitsDaoImpl;
import com.business.vente.produits.dashboard.DashboardSession;
import com.business.vente.produits.dashboard.dao.IDashboardSessionDao;
import com.business.vente.produits.dashboard.dao.impl.IDashboardSessionDaoImpl;
import com.business.vente.produits.model.ProduitMBeans;
import com.business.vente.produits.users.UserBean;

public class ProduitCBeans extends HttpServlet {

	private static final long serialVersionUID = -1248691242842462816L;

	private DashboardSession dashboardSession;
	
	IProduitsDao produitsDao;
	IDashboardSessionDao dashboardSessionDao;
	
	@Override
	public void init() throws ServletException {
		produitsDao = new IProduitsDaoImpl();
		dashboardSessionDao = new IDashboardSessionDaoImpl();
		dashboardSession = new DashboardSession();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
	
		//################################### PRODUITS STOCK ###################################
		if(path.equals("/rechercherProduitsStock.php") || path.equals("/produitsStock.php")){
			String motRecherche;
			ProduitMBeans produitMBeans = new ProduitMBeans();
			if (path.equals("/produitsStock.php")){
				motRecherche = "";
			} else {
				motRecherche = request.getParameter("motCle");
				int nombreProduitsStockParRecherche = produitsDao.nombreProduitsStockRecherche("%" +motRecherche+ "%");
				produitMBeans.setNombreProduit(nombreProduitsStockParRecherche);
				produitMBeans.setRechercheProduit(Boolean.TRUE);
			}
			//Set mot recherche
			produitMBeans.setMotCle(motRecherche);
			//Retrieve list , number record and total montant total product stock
			List<ProduitStock> lisProduitStock = produitsDao.getProduitStockParRecherche("%" +motRecherche+ "%");
			double montantTotalProduitsStock = produitsDao.getMontantProduitStock(lisProduitStock);
			//Set montant total product stock
			produitMBeans.setMontantTotalProduitsStock(montantTotalProduitsStock);
			produitMBeans.setProduitStock(lisProduitStock);
			//Data to jsp page
			request.setAttribute("produitMBeans", produitMBeans);
			request.getRequestDispatcher("produits/ProduitsStock.jsp").forward(request, response);
		} else if (path.equals("/ajouterProduitsStock.php")) {
			request.setAttribute("produit", new ProduitStock());
			request.getRequestDispatcher("produits/AjouterProduits.jsp").forward(request, response);
		} else if (path.equals("/saveProduitStock.php") && request.getMethod().equals("POST")){
			//Take data request url
			String descProduit = request.getParameter("descriptionProduit");
			String catProduit = request.getParameter("categorieProduit");
			double prixProduit = Double.parseDouble(request.getParameter("prixProduit"));
			int qntProduit = Integer.parseInt(request.getParameter("quantiteProduit"));
			//Save produit stock in db
			ProduitStock produit = produitsDao.SaveProduitStock(new ProduitStock(descProduit, catProduit, prixProduit, qntProduit));
			request.setAttribute("produitAjouter", produit);
			request.getRequestDispatcher("produits/ConfirmationAjouterProduits.jsp").forward(request, response);
		} else if (path.equals("/editerProduitStock.php")) {
			//Take data request url
			Long idProduit = Long.parseLong(request.getParameter("id"));
			//Get produit with the specific id
			ProduitStock produitEditer = produitsDao.getProduit(idProduit);
			request.setAttribute("produitEditer", produitEditer);
			request.getRequestDispatcher("produits/EditerProduits.jsp").forward(request, response);
		} else if (path.equals("/updateProduitStock.php") && request.getMethod().equals("POST")) {
			//Take data request url
			Long idProduit = Long.parseLong(request.getParameter("idProduit"));
			String descProduit = request.getParameter("descriptionProduit");
			String catProduit = request.getParameter("categorieProduit");
			double prixProduit = Double.parseDouble(request.getParameter("prixProduit"));
			int qntProduit = Integer.parseInt(request.getParameter("quantiteProduit"));
			//Update produit stock in db
			ProduitStock produit = new ProduitStock(descProduit, catProduit, prixProduit, qntProduit);
			produit.setIdProduit(idProduit);
			produit = produitsDao.updateProduit(produit);
			//Data to jsp page
			request.setAttribute("produitAjouter", produit);
			request.getRequestDispatcher("produits/ConfirmationEditerProduits.jsp").forward(request, response);
		} else if (path.equals("/supprimerProduitStock.php")) {
			//Take data request url
			Long idProduit = Long.parseLong(request.getParameter("id"));
			//Delete produit stock in db
			produitsDao.deleteProduit(idProduit);
			response.sendRedirect("rechercherProduitsStock.php?motCle=");
		} else if (path.equals("/ConfirmationVendreProduitStock.php")) {
			//Take data request url
			Long idProduit = Long.parseLong(request.getParameter("id"));
			String motRecherche = request.getParameter("motCle");
			//Call action method to get and save product
			ProduitStock produitStockAVendre = produitsDao.getProduit(idProduit);
			ProduitVendu produitVendu = produitsDao.SaveProduitVendu(produitStockAVendre);
			//Call action method to get product sell and total montant
			ProduitMBeans produitMBeans = new ProduitMBeans();
			List<ProduitVendu> listVendu = produitsDao.getProduitsVendusByDateVente();
			double montantTotalProduitsVendus = produitsDao.getMontantProduitVendus(listVendu);
			//Set entities
			produitMBeans.setMontantTotalProduitsVendus(montantTotalProduitsVendus);
			produitMBeans.setProduitVendu(listVendu);
			produitMBeans.setMotCle(motRecherche);
			//Data to jsp page
			request.setAttribute("produitMBeans", produitMBeans);
			request.getRequestDispatcher("produits/ProduitsVendus.jsp").forward(request, response);
		} else if (path.equals("/vendreProduitStock.php")) {
			//Take data request url
			Long idProduit = Long.parseLong(request.getParameter("id"));
			ProduitStock produitAvendre = produitsDao.getProduit(idProduit);
			//Data to jsp page
			request.setAttribute("produitAvendre", produitAvendre);
			request.getRequestDispatcher("produits/ConfirmationVendreProduits.jsp").forward(request, response);
		
		//################################### PRODUITS VENDUS ###################################
		} else if (path.equals("/rechercherProduitsVendus.php")) {
			//Take data request url
			String motRecherche = request.getParameter("motCle");
			//Set entity
			ProduitMBeans produitMBeans = new ProduitMBeans();
			produitMBeans.setMotCle(motRecherche);
			//Call action method to get product sell and total montant
			List<ProduitVendu> lisProduitVendu = produitsDao.getProduitVenduParRecherche("%" +motRecherche+ "%");
			double montantTotalProduitsVendus = produitsDao.getMontantProduitVendus(lisProduitVendu);
			int nombreProduitsVendusParRecherche = produitsDao.nombreProduitsVendusRecherche("%" +motRecherche+ "%");
			//Set entities
			produitMBeans.setProduitVendu(lisProduitVendu);
			produitMBeans.setMontantTotalProduitsVendus(montantTotalProduitsVendus);
			produitMBeans.setNombreProduit(nombreProduitsVendusParRecherche);
			produitMBeans.setRechercheProduit(Boolean.TRUE);
			//Data to jsp page
			request.setAttribute("produitMBeans", produitMBeans);
			request.getRequestDispatcher("produits/ProduitsVendus.jsp").forward(request, response);
		} else if (path.equals("/produitsVendus.php")) {
			ProduitMBeans produitMBeans = new ProduitMBeans();
			//Call action method to get product sell and total montant
			List<ProduitVendu> listVendu = produitsDao.getProduitsVendusByDateVente();
			double montantTotalProduitsVendus = produitsDao.getMontantProduitVendus(listVendu);
			//Set entities
			produitMBeans.setMontantTotalProduitsVendus(montantTotalProduitsVendus);
			produitMBeans.setProduitVendu(listVendu);
			//Data to jsp page
			request.setAttribute("produitMBeans", produitMBeans);
			request.getRequestDispatcher("produits/ProduitsVendus.jsp").forward(request, response);
		} else {
			response.sendError(404, "Action non disponsible");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
