package com.business.vente.produits.queries;

public class ProduitQuery {

	//DB PRODUITS_STOCK
	public static final String PRODUITS_INSERTION_DB_STOCK = "INSERT INTO PRODUITS_STOCK (DESC_PRODUIT, CAT_PRODUIT, PRIX_PRODUIT, QT_PRODUIT) VALUES (?,?,?,?)";
	public static final String PRODUITS_SELECT_MAX_ID_DB_STOCK = "SELECT MAX(ID_PRODUIT) AS MAX_ID FROM PRODUITS_STOCK";
	public static final String PRODUITS_DELETE_DB_STOCK = "DELETE FROM PRODUITS_STOCK WHERE ID_PRODUIT =?";
	public static final String PRODUITS_SELECT_DESC_DB_STOCK = "SELECT * FROM PRODUITS_STOCK WHERE DESC_PRODUIT LIKE ?";
	public static final String PRODUITS_SELECT_ID_DB_STOCK = "SELECT * FROM PRODUITS_STOCK WHERE ID_PRODUIT = ?";
	public static final String PRODUITS_UPDATE_DB_STOCK = "UPDATE PRODUITS_STOCK SET DESC_PRODUIT=?, CAT_PRODUIT=?, PRIX_PRODUIT=?, QT_PRODUIT=? WHERE ID_PRODUIT=?";
	public static final String PRODUITS_SUM_PRIX_DB_STOCK = "SELECT SUM(PRIX_PRODUIT) AS SUM_MONTANT_PRODUITS FROM PRODUITS_STOCK";
	public static final String PRODUITS_SUM_QTE_DB_STOCK = "SELECT SUM(QT_PRODUIT) AS SUM_QTE_PRODUITS FROM PRODUITS_STOCK";
	public static final String PRODUITS_NUMBER_BY_SEARCH_DB_STOCK = "SELECT COUNT(ID_PRODUIT) AS NUMBER_SEARCH_PRODUITS FROM PRODUITS_STOCK WHERE DESC_PRODUIT LIKE ?";
	
	//DB PRODUITS_VENDUS
	public static final String PRODUITS_SELECT_ALL_DB_VENDUS = "SELECT * FROM PRODUITS_VENDUS";
	public static final String PRODUITS_INSERTION1_DB_VENDUS = "INSERT INTO PRODUITS_VENDUS FROM PRODUITS_STOCK WHERE ID_PRODUIT =?";
	public static final String PRODUITS_INSERTION2_DB_VENDUS = "INSERT INTO PRODUITS_VENDUS (ID_PRODUIT, DESC_PRODUIT, CAT_PRODUIT, PRIX_PRODUIT, QT_PRODUIT, DATE_VENTE_PRODUIT) VALUES (?,?,?,?,?,?)";
	public static final String PRODUITS_SELECT_ID_DB_VENDUS = "SELECT * FROM PRODUITS_VENDUS WHERE ID_PRODUIT = ?";
	public static final String PRODUITS_SUM_PRIX_DB_VENDUS = "SELECT SUM(PRIX_PRODUIT) AS SUM_MONTANT_PRODUITS FROM PRODUITS_VENDUS";
	public static final String PRODUITS_ORDER_BY_DATE_DB_VENDUS = "SELECT * FROM PRODUITS_VENDUS ORDER BY DATE_VENTE_PRODUIT DESC";
	public static final String PRODUITS_SELECT_DESC_VENDUS = "SELECT * FROM PRODUITS_VENDUS WHERE DESC_PRODUIT LIKE ?";
	public static final String PRODUITS_NUMBER_BY_SEARCH_DB_VENDUS = "SELECT COUNT(ID_PRODUIT) AS NUMBER_SEARCH_PRODUITS FROM PRODUITS_VENDUS WHERE DESC_PRODUIT LIKE ?";
	
	//DB USERS
	public static final String USERS_LOGGED = "SELECT * FROM USERS WHERE NOM_USER=? AND PWD_USER=?";
	public static final String USERS_UPDATE_DATE_CONNECTION = "UPDATE USERS SET DERN_DATE_CONNECT_USER = current_timestamp() WHERE NOM_USER=? AND PWD_USER=?";
	
	
}
