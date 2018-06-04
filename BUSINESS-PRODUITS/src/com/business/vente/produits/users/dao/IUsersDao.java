package com.business.vente.produits.users.dao;

import com.business.vente.produits.users.UserBean;

public interface IUsersDao {

	public UserBean loginCheck(String username, String password);
	public void updateDateConnectionUser(String username, String password);
}
