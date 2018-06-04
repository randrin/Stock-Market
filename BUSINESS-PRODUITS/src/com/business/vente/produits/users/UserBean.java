package com.business.vente.produits.users;

import java.io.Serializable;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.model.ProduitMBeans;

public class UserBean implements Serializable {


	private static final long serialVersionUID = -3336810277104105677L;

	private String nomUsager;
	private String prenomUsager;
	private String nomLogin;
	private String pwdLogin;
	private String dateConnectUser;
	private String derniereConnectUser;
	boolean activation;
	
	private ProduitVendu produitsVendus;
	private ProduitStock produitsStock;
	
	public UserBean() {
		super();
	}

	/**
	 * @param nomUsager
	 * @param prenomUsager
	 * @param nomLogin
	 * @param pwdLogin
	 * @param activation
	 */
	public UserBean(String nomUsager, String prenomUsager, String nomLogin,
			String pwdLogin, boolean activation) {
		super();
		this.nomUsager = nomUsager;
		this.prenomUsager = prenomUsager;
		this.nomLogin = nomLogin;
		this.pwdLogin = pwdLogin;
		this.activation = activation;
	}

	
	/**
	 * @param nomLogin
	 * @param pwdLogin
	 */
	public UserBean(String nomLogin, String pwdLogin) {
		super();
		this.nomLogin = nomLogin;
		this.pwdLogin = pwdLogin;
	}
	
	/**
	 * @return the produitsVendus
	 */
	public ProduitVendu getProduitsVendus() {
		return produitsVendus;
	}

	/**
	 * @param produitsVendus the produitsVendus to set
	 */
	public void setProduitsVendus(ProduitVendu produitsVendus) {
		this.produitsVendus = produitsVendus;
	}

	/**
	 * @return the produitsStock
	 */
	public ProduitStock getProduitsStock() {
		return produitsStock;
	}

	/**
	 * @param produitsStock the produitsStock to set
	 */
	public void setProduitsStock(ProduitStock produitsStock) {
		this.produitsStock = produitsStock;
	}

	/**
	 * @return the dateConnectUser
	 */
	public String getDateConnectUser() {
		return dateConnectUser;
	}

	/**
	 * @param dateConnectUser the dateConnectUser to set
	 */
	public void setDateConnectUser(String dateConnectUser) {
		this.dateConnectUser = dateConnectUser;
	}

	/**
	 * @return the derniereConnectUser
	 */
	public String getDerniereConnectUser() {
		return derniereConnectUser;
	}

	/**
	 * @param derniereConnectUser the derniereConnectUser to set
	 */
	public void setDerniereConnectUser(String derniereConnectUser) {
		this.derniereConnectUser = derniereConnectUser;
	}

	/**
	 * @return the nomUsager
	 */
	public String getNomUsager() {
		return nomUsager;
	}

	/**
	 * @param nomUsager the nomUsager to set
	 */
	public void setNomUsager(String nomUsager) {
		this.nomUsager = nomUsager;
	}

	/**
	 * @return the prenomUsager
	 */
	public String getPrenomUsager() {
		return prenomUsager;
	}

	/**
	 * @param prenomUsager the prenomUsager to set
	 */
	public void setPrenomUsager(String prenomUsager) {
		this.prenomUsager = prenomUsager;
	}

	/**
	 * @return the nomLogin
	 */
	public String getNomLogin() {
		return nomLogin;
	}

	/**
	 * @param nomLogin the nomLogin to set
	 */
	public void setNomLogin(String nomLogin) {
		this.nomLogin = nomLogin;
	}

	/**
	 * @return the pwdLogin
	 */
	public String getPwdLogin() {
		return pwdLogin;
	}

	/**
	 * @param pwdLogin the pwdLogin to set
	 */
	public void setPwdLogin(String pwdLogin) {
		this.pwdLogin = pwdLogin;
	}

	/**
	 * @return the activation
	 */
	public boolean isActivation() {
		return activation;
	}

	/**
	 * @param activation the activation to set
	 */
	public void setActivation(boolean activation) {
		this.activation = activation;
	}
	
}
