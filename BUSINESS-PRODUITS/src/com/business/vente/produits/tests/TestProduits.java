package com.business.vente.produits.tests;

import java.util.List;

import com.business.vente.produits.beans.ProduitStock;
import com.business.vente.produits.daoImpl.IProduitsDaoImpl;

public class TestProduits {

	public static void main(String[] args) {
		
		IProduitsDaoImpl test = new IProduitsDaoImpl();
		
		//ProduitStock p1 = test.SaveProduitStock(new ProduitStock("Sac rouge de marque Bulgari", 15000, 1));
		//ProduitStock p2 = test.SaveProduitStock(new ProduitStock("Sac noir modele V", 13000, 2));
		System.out.println("++++++++++++++++++ Ajouter des produits ++++++++++++++++++++ /n");
		//System.out.println(p1.toString());
		//System.out.println(p2.toString());
		System.out.println("++++++++++++++++++ Liste des produits par mot clè ++++++++++++++++++++ /n");
		List<ProduitStock> produit = test.getProduitStockParRecherche("%modele%");
		for(ProduitStock p : produit){
			System.out.println(p.toString());
		}
	}

}
