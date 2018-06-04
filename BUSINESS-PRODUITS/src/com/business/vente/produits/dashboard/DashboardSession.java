package com.business.vente.produits.dashboard;

import java.io.Serializable;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.dashboard.dao.IDashboardSessionDao;
import com.business.vente.produits.dashboard.dao.impl.IDashboardSessionDaoImpl;
import com.business.vente.produits.users.UserBean;
import com.sun.org.apache.xml.internal.security.Init;

public class DashboardSession implements Serializable {

	private static final long serialVersionUID = -6466914384208108949L;
	
	private String usernameSession;
	private String pwdSession;
	
	private UserBean userBean;
	private ProduitStock produitsStock;
	private ProduitVendu produitsVendu;
	
	public UserBean DashboardInformations(String username, String pwd){
		IDashboardSessionDao dashboardSessionDao = new IDashboardSessionDaoImpl();
		
		//Connection Db et vérification de l'usager
		UserBean userBeanDetails = new UserBean();
		userBeanDetails = dashboardSessionDao.detailsUser(usernameSession, pwdSession);
				
		//Informations utiles pour Produits Stock
		ProduitStock detailStock = dashboardSessionDao.detailsProduitStock();
		userBeanDetails.setProduitsStock(detailStock);
				
		//Informations utiles pour Produits Vendus
		ProduitVendu pVendus = dashboardSessionDao.detailsProduisVendus();
		userBeanDetails.setProduitsVendus(pVendus);
		return userBeanDetails;
	}
	
	public DashboardSession() {
		super();
	}

	/**
	 * @param userBean
	 * @param produitsStock
	 * @param produitsVendu
	 */
	public DashboardSession(UserBean userBean, ProduitStock produitsStock,
			ProduitVendu produitsVendu) {
		super();
		this.userBean = userBean;
		this.produitsStock = produitsStock;
		this.produitsVendu = produitsVendu;
	}

	/**
	 * @return the usernameSession
	 */
	public String getUsernameSession() {
		return usernameSession;
	}

	/**
	 * @param usernameSession the usernameSession to set
	 */
	public void setUsernameSession(String usernameSession) {
		this.usernameSession = usernameSession;
	}

	/**
	 * @return the pwdSession
	 */
	public String getPwdSession() {
		return pwdSession;
	}

	/**
	 * @param pwdSession the pwdSession to set
	 */
	public void setPwdSession(String pwdSession) {
		this.pwdSession = pwdSession;
	}

	/**
	 * @return the userBean
	 */
	public UserBean getUserBean() {
		return userBean;
	}

	/**
	 * @param userBean the userBean to set
	 */
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
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
	 * @return the produitsVendu
	 */
	public ProduitVendu getProduitsVendu() {
		return produitsVendu;
	}

	/**
	 * @param produitsVendu the produitsVendu to set
	 */
	public void setProduitsVendu(ProduitVendu produitsVendu) {
		this.produitsVendu = produitsVendu;
	}
	
}
