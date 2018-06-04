package com.business.vente.produits.beans;

import java.io.Serializable;

public class ProduitStock implements Serializable {

	private static final long serialVersionUID = 7287579330538556992L;
	
	private Long idProduit;
	private String descriptionProduit;
	private String categorieProduit;
	private double prixProduit;
	private int quantiteProduit;

	private double montantTotalProduitsStock;
	
	public ProduitStock() {
		super();
	}

	/**
	 * @param descriptionProduit
	 * @param prixProduit
	 * @param quantiteProduit
	 */
	public ProduitStock(String descriptionProduit, String categorieProduit, double prixProduit,
			int quantiteProduit) {
		super();
		this.descriptionProduit = descriptionProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
		this.categorieProduit = categorieProduit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produits [idProduit=" + idProduit + ", descriptionProduit="
				+ descriptionProduit + ", prixProduit=" + prixProduit
				+ ", quantiteProduit=" + quantiteProduit + "]";
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
