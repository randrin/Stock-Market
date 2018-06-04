package com.business.vente.produits.dashboard.dao.impl;

import java.util.List;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.daoImpl.IProduitsDaoImpl;
import com.business.vente.produits.dashboard.dao.IDashboardSessionDao;
import com.business.vente.produits.users.UserBean;
import com.business.vente.produits.users.dao.impl.IUsersDaoImpl;

public class IDashboardSessionDaoImpl implements IDashboardSessionDao {

	IUsersDaoImpl userDaoImpl = new IUsersDaoImpl();
	IProduitsDaoImpl produitsDao = new IProduitsDaoImpl();
	
	@Override
	public UserBean detailsUser(String username, String password) {
		UserBean userBean = userDaoImpl.loginCheck(username, password);
		return userBean;
	}

	@Override
	public ProduitStock detailsProduitStock() {
		ProduitStock detailStock = produitsDao.getProduitsStockInformations();
		return detailStock;
	}

	@Override
	public ProduitVendu detailsProduisVendus() {
		List<ProduitVendu> listVendu = produitsDao.getProduitsVendus();
		ProduitVendu pVendus = new ProduitVendu();
		pVendus.setMontantTotalProduitsVendus(produitsDao.getMontantProduitVendus(listVendu));
		return pVendus;
	}
}
