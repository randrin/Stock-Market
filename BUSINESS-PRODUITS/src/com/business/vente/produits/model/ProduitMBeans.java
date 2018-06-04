package com.business.vente.produits.model;

import java.util.List;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;

public class ProduitMBeans {
	
	private String motCle;
	private List<ProduitStock> produit;
	private List<ProduitVendu> produitVendu;
	
	private double montantTotalProduitsStock;
	private double montantTotalProduitsVendus;
	
	private int nombreProduit;
	private boolean rechercheProduit;
	
	
	/**
	 * @return the motCle
	 */
	public String getMotCle() {
		return motCle;
	}
	/**
	 * @param motCle the motCle to set
	 */
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	/**
	 * @return the produit
	 */
	public List<ProduitStock> getProduit() {
		return produit;
	}
	/**
	 * @param produit the produit to set
	 */
	public void setProduitStock(List<ProduitStock> produit) {
		this.produit = produit;
	}
	/**
	 * @return the montantTotalProduitsStock
	 */
	public double getMontantTotalProduitsStock() {
		return montantTotalProduitsStock;
	}
	/**
	 * @param montantTotalProduitsStock the montantTotalProduitsStock to set
	 */
	public void setMontantTotalProduitsStock(double montantTotalProduitsStock) {
		this.montantTotalProduitsStock = montantTotalProduitsStock;
	}
	/**
	 * @return the produitVendu
	 */
	public List<ProduitVendu> getProduitVendu() {
		return produitVendu;
	}
	/**
	 * @param produitVendu the produitVendu to set
	 */
	public void setProduitVendu(List<ProduitVendu> produitVendu) {
		this.produitVendu = produitVendu;
	}
	/**
	 * @return the montantTotalProduitsVendus
	 */
	public double getMontantTotalProduitsVendus() {
		return montantTotalProduitsVendus;
	}
	/**
	 * @param montantTotalProduitsVendus the montantTotalProduitsVendus to set
	 */
	public void setMontantTotalProduitsVendus(double montantTotalProduitsVendus) {
		this.montantTotalProduitsVendus = montantTotalProduitsVendus;
	}
	/**
	 * @return the nombreProduit
	 */
	public int getNombreProduit() {
		return nombreProduit;
	}
	/**
	 * @param nombreProduit the nombreProduit to set
	 */
	public void setNombreProduit(int nombreProduit) {
		this.nombreProduit = nombreProduit;
	}
	/**
	 * @return the rechercheProduit
	 */
	public boolean isRechercheProduit() {
		return rechercheProduit;
	}
	/**
	 * @param rechercheProduit the rechercheProduit to set
	 */
	public void setRechercheProduit(boolean rechercheProduit) {
		this.rechercheProduit = rechercheProduit;
	}
}
