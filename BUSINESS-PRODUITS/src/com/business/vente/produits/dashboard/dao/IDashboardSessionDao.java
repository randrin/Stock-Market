package com.business.vente.produits.dashboard.dao;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.users.UserBean;

public interface IDashboardSessionDao {

	public UserBean detailsUser(String username, String password);
	public ProduitStock detailsProduitStock();
	public ProduitVendu detailsProduisVendus();
}
