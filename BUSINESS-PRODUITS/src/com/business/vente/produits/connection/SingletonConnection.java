package com.business.vente.produits.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {

	private static Connection connection;
	
	static {
		try {
			//1. Telecharger le driver DB
			Class.forName("com.mysql.jdbc.Driver");
			//2. Connexion à la DB
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Produits_Catalogue", "root", "passaporto2003");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @return the connection
	 */
	//3. Creation d'une instance de la connexion
	public static Connection getConnection() {
		return connection;
	}
	
}
