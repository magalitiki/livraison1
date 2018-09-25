package com.objis.cameroun.neostore.presentation;
import com.objis.cameroun.neostore.domaine.Articles;
import com.objis.cameroun.neostore.service.TraitementsArticles;

import java.util.Scanner; 

public class Magasin {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			char choix = 'o';
			
			while (choix=='o') {

			System.out.println ("Bienvenue dans mon application de gestion de supermarchés");
			
			// Instanciation de l'objet article de type Articles
			Articles article = new Articles();
			
			//Intanciation de l'objet articles de type TraitementsArticles
			TraitementsArticles articles = new TraitementsArticles();
			
			// Appel du savoir faire enregistrerArticle
			articles.enregistrerArticle(article);
			 
			//Appel du savoir faire afficherDetailsArticle
			articles.afficherDetailsArticle(article);
			
			System.out.println();
			System.out.println("Voulez-vous réessayer?  o/n" );
			choix = sc.nextLine().charAt(0);
			}
			System.out.println("Au revoir!");
		}
			

}
