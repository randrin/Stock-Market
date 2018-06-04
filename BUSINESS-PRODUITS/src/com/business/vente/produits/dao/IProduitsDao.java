package com.business.vente.produits.dao;

import java.util.List;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;

public interface IProduitsDao {

	public ProduitStock SaveProduitStock (ProduitStock p);
	public ProduitVendu SaveProduitVendu (ProduitStock p);
	public void deleteProduit(Long idProduit);
	public ProduitVendu getVendreProduit (Long idProduit);
	public List<ProduitStock> getProduitStockParRecherche(String motCle);
	public List<ProduitVendu> getProduitVenduParRecherche(String motCle);
	public List<ProduitVendu> getProduitsVendus();
	public List<ProduitVendu> getProduitsVendusByDateVente();
	public ProduitStock getProduit(Long idProduit);
	public ProduitStock updateProduit(ProduitStock p);
	public double getMontantProduitStock(List<ProduitStock> p);
	public double getMontantProduitVendus(List<ProduitVendu> p);
	public int nombreProduitsStockRecherche(String motCle);
	public int nombreProduitsVendusRecherche(String motCle);
	
	//Pour le Dashboard -> Panel Produits Stock
	public ProduitStock getProduitsStockInformations();
	
	//Pour le Dashboard -> Panel Produits Vendus
	public ProduitVendu getProduitsVendusInformations();
}
