package com.business.vente.produits.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.beans.ProduitVendu;
import com.business.vente.produits.connection.SingletonConnection;
import com.business.vente.produits.dao.IProduitsDao;
import com.business.vente.produits.queries.ProduitQuery;


public class IProduitsDaoImpl implements IProduitsDao {

	@Override
	public ProduitStock SaveProduitStock (ProduitStock p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_INSERTION_DB_STOCK);
			preparedStatement.setString(1, p.getDescriptionProduit());
			preparedStatement.setString(2, p.getCategorieProduit());
			preparedStatement.setDouble(3, p.getPrixProduit());
			preparedStatement.setInt(4, p.getQuantiteProduit());
			preparedStatement.executeUpdate();
			
			PreparedStatement preparedStatementBis = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_MAX_ID_DB_STOCK);
			ResultSet resultset = preparedStatementBis.executeQuery();
			if(resultset.next()){
				p.setIdProduit(resultset.getLong("MAX_ID"));
			}
			resultset.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void deleteProduit(Long idProduit) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_DELETE_DB_STOCK);
			preparedStatement.setLong(1, idProduit);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public List<ProduitStock> getProduitStockParRecherche(String motCle) {
		List<ProduitStock> produit = new ArrayList<ProduitStock>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_DESC_DB_STOCK);
			preparedStatement.setString(1, motCle);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				ProduitStock p = new ProduitStock();
				p.setIdProduit(resultSet.getLong("ID_PRODUIT"));
				p.setDescriptionProduit(resultSet.getString("DESC_PRODUIT"));
				p.setCategorieProduit(resultSet.getString("CAT_PRODUIT"));
				p.setQuantiteProduit(resultSet.getInt("QT_PRODUIT"));
				p.setPrixProduit(resultSet.getDouble("PRIX_PRODUIT"));
				produit.add(p);
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return produit;
	}

	@Override
	public ProduitStock getProduit(Long idProduit) {
		Connection connection = SingletonConnection.getConnection();
		ProduitStock p = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_ID_DB_STOCK);
			preparedStatement.setLong(1, idProduit);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				p = new ProduitStock();
				p.setIdProduit(resultSet.getLong("ID_PRODUIT"));
				p.setDescriptionProduit(resultSet.getString("DESC_PRODUIT"));
				p.setCategorieProduit(resultSet.getString("CAT_PRODUIT"));
				p.setQuantiteProduit(resultSet.getInt("QT_PRODUIT"));
				p.setPrixProduit(resultSet.getDouble("PRIX_PRODUIT"));
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public ProduitStock updateProduit(ProduitStock p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_UPDATE_DB_STOCK);
			preparedStatement.setString(1, p.getDescriptionProduit());
			preparedStatement.setString(2, p.getCategorieProduit());
			preparedStatement.setDouble(3, p.getPrixProduit());
			preparedStatement.setInt(4, p.getQuantiteProduit());
			preparedStatement.setLong(5, p.getIdProduit());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public double getMontantProduitStock(List<ProduitStock> p) {
		Connection connection = SingletonConnection.getConnection();
		double montantTotal = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SUM_PRIX_DB_STOCK);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				montantTotal = resultSet.getDouble("SUM_MONTANT_PRODUITS");
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return montantTotal;
	}

	@Override
	public List<ProduitVendu> getProduitsVendus() {
		List<ProduitVendu> produitVendu = new ArrayList<ProduitVendu>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_ALL_DB_VENDUS);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				ProduitVendu p = new ProduitVendu();
				p.setIdProduit(resultSet.getLong("ID_PRODUIT"));
				p.setDescriptionProduit(resultSet.getString("DESC_PRODUIT"));
				p.setCategorieProduit(resultSet.getString("CAT_PRODUIT"));
				p.setQuantiteProduit(resultSet.getInt("QT_PRODUIT"));
				p.setPrixProduit(resultSet.getDouble("PRIX_PRODUIT"));
				p.setDateDeVenteProduit(resultSet.getString("DATE_VENTE_PRODUIT"));
				produitVendu.add(p);
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return produitVendu;
	}

	@Override
	public ProduitVendu getVendreProduit(Long idProduit) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_INSERTION1_DB_VENDUS);
			preparedStatement.setLong(1, idProduit);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public ProduitVendu SaveProduitVendu(ProduitStock p) {
		ProduitVendu pVendu = new ProduitVendu();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_INSERTION2_DB_VENDUS);
			preparedStatement.setLong(1, p.getIdProduit());
			preparedStatement.setString(2, p.getDescriptionProduit());
			preparedStatement.setString(3, p.getCategorieProduit());
			preparedStatement.setDouble(4, p.getPrixProduit());
			preparedStatement.setInt(5, p.getQuantiteProduit());
			preparedStatement.setTimestamp(6, getCurrentTimeStamp());
			preparedStatement.executeUpdate();
			
			PreparedStatement preparedStatementBis = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_ID_DB_VENDUS);
			preparedStatementBis.setLong(1, p.getIdProduit());
			ResultSet resultset = preparedStatementBis.executeQuery();
			
			if(resultset.next()){
				pVendu.setIdProduit(resultset.getLong("ID_PRODUIT"));
				pVendu.setDescriptionProduit(resultset.getString("DESC_PRODUIT"));
				pVendu.setCategorieProduit(resultset.getString("CAT_PRODUIT"));
				pVendu.setPrixProduit(resultset.getDouble("PRIX_PRODUIT"));
				pVendu.setQuantiteProduit(resultset.getInt("QT_PRODUIT"));
				pVendu.setDateDeVenteProduit(resultset.getString("DATE_VENTE_PRODUIT"));
			}
			resultset.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return pVendu;
	}

	private static java.sql.Timestamp getCurrentTimeStamp() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}

	@Override
	public double getMontantProduitVendus(List<ProduitVendu> p) {
		Connection connection = SingletonConnection.getConnection();
		double montantTotal = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SUM_PRIX_DB_VENDUS);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				montantTotal = resultSet.getDouble("SUM_MONTANT_PRODUITS");
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return montantTotal;
	}

	@Override
	public List<ProduitVendu> getProduitsVendusByDateVente() {
		List<ProduitVendu> produitVendu = new ArrayList<ProduitVendu>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_ORDER_BY_DATE_DB_VENDUS);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				ProduitVendu p = new ProduitVendu();
				p.setIdProduit(resultSet.getLong("ID_PRODUIT"));
				p.setDescriptionProduit(resultSet.getString("DESC_PRODUIT"));
				p.setCategorieProduit(resultSet.getString("CAT_PRODUIT"));
				p.setQuantiteProduit(resultSet.getInt("QT_PRODUIT"));
				p.setPrixProduit(resultSet.getDouble("PRIX_PRODUIT"));
				p.setDateDeVenteProduit(resultSet.getString("DATE_VENTE_PRODUIT"));
				produitVendu.add(p);
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return produitVendu;
	}

	@Override
	public ProduitStock getProduitsStockInformations() {
		Connection connection = SingletonConnection.getConnection();
		ProduitStock produitsDB = new ProduitStock();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SUM_QTE_DB_STOCK);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				produitsDB.setQuantiteProduit(resultSet.getInt("SUM_QTE_PRODUITS"));
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return produitsDB;
	}

	@Override
	public ProduitVendu getProduitsVendusInformations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProduitVendu> getProduitVenduParRecherche(String motCle) {
		List<ProduitVendu> produit = new ArrayList<ProduitVendu>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_SELECT_DESC_VENDUS);
			preparedStatement.setString(1, motCle);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				ProduitVendu p = new ProduitVendu();
				p.setIdProduit(resultSet.getLong("ID_PRODUIT"));
				p.setDescriptionProduit(resultSet.getString("DESC_PRODUIT"));
				p.setCategorieProduit(resultSet.getString("CAT_PRODUIT"));
				p.setQuantiteProduit(resultSet.getInt("QT_PRODUIT"));
				p.setPrixProduit(resultSet.getDouble("PRIX_PRODUIT"));
				p.setDateDeVenteProduit(resultSet.getString("DATE_VENTE_PRODUIT"));
				produit.add(p);
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return produit;
	}

	@Override
	public int nombreProduitsStockRecherche(String motCle) {
		Connection connection = SingletonConnection.getConnection();
		int nombreTotal = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_NUMBER_BY_SEARCH_DB_STOCK);
			preparedStatement.setString(1, motCle);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				nombreTotal = resultSet.getInt("NUMBER_SEARCH_PRODUITS");
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return nombreTotal;
	}

	@Override
	public int nombreProduitsVendusRecherche(String motCle) {
		Connection connection = SingletonConnection.getConnection();
		int nombreTotal = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(ProduitQuery.PRODUITS_NUMBER_BY_SEARCH_DB_VENDUS);
			preparedStatement.setString(1, motCle);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()){
				nombreTotal = resultSet.getInt("NUMBER_SEARCH_PRODUITS");
			}
			resultSet.close();
		} catch (SQLException e) {
			System.out.println("Message Error : " +e.getMessage());
			e.printStackTrace();
		}
		return nombreTotal;
	}
}
	
