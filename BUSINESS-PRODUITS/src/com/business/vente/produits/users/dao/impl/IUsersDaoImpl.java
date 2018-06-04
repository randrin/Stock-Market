package com.business.vente.produits.users.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.business.vente.produits.connection.SingletonConnection;
import com.business.vente.produits.queries.ProduitQuery;
import com.business.vente.produits.users.UserBean;
import com.business.vente.produits.users.dao.IUsersDao;

public class IUsersDaoImpl implements IUsersDao {

	@Override
	public UserBean loginCheck(String username, String password) {
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		UserBean userBean = new UserBean();

		Connection connection = SingletonConnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(ProduitQuery.USERS_LOGGED);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultset = preparedStatement.executeQuery();
			if (resultset.next()){
				userBean.setNomLogin(resultset.getString("NOM_USER"));
				userBean.setNomUsager(resultset.getString("NOM_USER"));
				userBean.setPrenomUsager(resultset.getString("PRENOM_USER"));
				userBean.setPwdLogin(resultset.getString("PWD_USER"));
				userBean.setDerniereConnectUser(resultset.getString("DERN_DATE_CONNECT_USER"));
				userBean.setActivation(resultset.getBoolean("ACTIVATION_USER"));
			} else {
				userBean.setActivation(false);
			}
			resultset.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " + e.getMessage());
			e.printStackTrace();
		}
		return userBean;
	}

	@Override
	public void updateDateConnectionUser(String username, String password) {
		PreparedStatement preparedStatement = null;

		Connection connection = SingletonConnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(ProduitQuery.USERS_UPDATE_DATE_CONNECTION);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
