package com.business.vente.produits.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.connection.SingletonConnection;
import com.business.vente.produits.dao.IProduitsDao;
import com.business.vente.produits.daoImpl.IProduitsDaoImpl;
import com.business.vente.produits.dashboard.DashboardSession;
import com.business.vente.produits.dashboard.dao.IDashboardSessionDao;
import com.business.vente.produits.dashboard.dao.impl.IDashboardSessionDaoImpl;
import com.business.vente.produits.queries.ProduitQuery;
import com.business.vente.produits.users.UserBean;
import com.business.vente.produits.users.dao.IUsersDao;
import com.business.vente.produits.users.dao.impl.IUsersDaoImpl;

public class LoginCBeans extends HttpServlet {


	private static final long serialVersionUID = 6171791452168208549L;
	
	private DashboardSession dashboardSession;
	
	IUsersDao userDao;
	IDashboardSessionDao dashboardSessionDao;
	IProduitsDao produitsDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new IUsersDaoImpl();
		dashboardSessionDao = new IDashboardSessionDaoImpl();
		produitsDao = new IProduitsDaoImpl();
		dashboardSession = new DashboardSession();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		
		if (path.equals("/home.asp")){
			//Information du dashboard
			UserBean userBeanDetails = dashboardSession.DashboardInformations(dashboardSession.getUsernameSession(), dashboardSession.getPwdSession());
			request.setAttribute("userBean", userBeanDetails);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Recupération des valeurs saisies dans le formulaire de login
		String username = request.getParameter("nom");
		String pwd = request.getParameter("pwd");
		
		dashboardSession.setUsernameSession(username);
		dashboardSession.setPwdSession(pwd);
		
		//Information du dashboard
		UserBean userBeanDetails = dashboardSession.DashboardInformations(username, pwd);
		
		//Controle du flag activation
		if(userBeanDetails.isActivation()) {
			request.setAttribute("userBean", userBeanDetails);
			userDao.updateDateConnectionUser(username, pwd);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		} else {
			String errorMessage = "Identifiant ou/et Mot de Passe Incorrect(s)";
			request.setAttribute("errorMessage", errorMessage);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

	/**
	 * @return the dashboardSession
	 */
	public DashboardSession getDashboardSession() {
		return dashboardSession;
	}

	/**
	 * @param dashboardSession the dashboardSession to set
	 */
	public void setDashboardSession(DashboardSession dashboardSession) {
		this.dashboardSession = dashboardSession;
	}

	/**
	 * @return the userDao
	 */
	public IUsersDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(IUsersDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * @return the dashboardSessionDao
	 */
	public IDashboardSessionDao getDashboardSessionDao() {
		return dashboardSessionDao;
	}

	/**
	 * @param dashboardSessionDao the dashboardSessionDao to set
	 */
	public void setDashboardSessionDao(IDashboardSessionDao dashboardSessionDao) {
		this.dashboardSessionDao = dashboardSessionDao;
	}

	/**
	 * @return the produitsDao
	 */
	public IProduitsDao getProduitsDao() {
		return produitsDao;
	}

	/**
	 * @param produitsDao the produitsDao to set
	 */
	public void setProduitsDao(IProduitsDao produitsDao) {
		this.produitsDao = produitsDao;
	}
	
}
