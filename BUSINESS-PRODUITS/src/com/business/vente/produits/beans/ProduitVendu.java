package com.business.vente.produits.beans;

import java.io.Serializable;
import java.util.Date;

public class ProduitVendu implements Serializable {

	private static final long serialVersionUID = -7845366698294524199L;

	private Long idProduit;
	private String descriptionProduit;
	private String categorieProduit;
	private double prixProduit;
	private int quantiteProduit;
	private String dateDeVenteProduit;

	private double montantTotalProduitsVendus;
	
	public ProduitVendu() {
		super();
	}

	/**
	 * @param descriptionProduit
	 * @param prixProduit
	 * @param quantiteProduit
	 * @param dateDeVenteProduit
	 */
	public ProduitVendu(String descriptionProduit, String categorieProduit, double prixProduit,
			int quantiteProduit, String dateDeVenteProduit) {
		super();
		this.descriptionProduit = descriptionProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
		this.dateDeVenteProduit = dateDeVenteProduit;
		this.categorieProduit = categorieProduit;
	}

	/**
	 * @return the idProduit
	 */
	public Long getIdProduit() {
		return idProduit;
	}

	/**
	 * @param idProduit the idProduit to set
	 */
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	/**
	 * @return the descriptionProduit
	 */
	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	/**
	 * @param descriptionProduit the descriptionProduit to set
	 */
	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	/**
	 * @return the prixProduit
	 */
	public double getPrixProduit() {
		return prixProduit;
	}

	/**
	 * @param prixProduit the prixProduit to set
	 */
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	/**
	 * @return the quantiteProduit
	 */
	public int getQuantiteProduit() {
		return quantiteProduit;
	}

	/**
	 * @param quantiteProduit the quantiteProduit to set
	 */
	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}

	/**
	 * @return the dateDeVenteProduit
	 */
	public String getDateDeVenteProduit() {
		return dateDeVenteProduit;
	}

	/**
	 * @param d the dateDeVenteProduit to set
	 */
	public void setDateDeVenteProduit(String dateDeVenteProduit) {
		this.dateDeVenteProduit = dateDeVenteProduit;
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
	 * @return the categorieProduit
	 */
	public String getCategorieProduit() {
		return categorieProduit;
	}

	/**
	 * @param categorieProduit the categorieProduit to set
	 */
	public void setCategorieProduit(String categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	
}
