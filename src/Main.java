import java.util.ArrayList;
import java.util.Collection;

import Vue.Vue;
import java.io.*;

import model.Bibliotheque;
import model.Etagere;
import model.Genre;
import model.Livre;


public class Main {
	/**
	 * 
	 * @param xargs
	 */
	public static void main(String[] xargs) {
		Bibliotheque bibliotheque = new Bibliotheque();
		
		
		// INIT bibli
		Collection<Genre> genreEtagere0 = new ArrayList<Genre>();
		genreEtagere0.add(new Genre(Genre.HISTOIRE));
		genreEtagere0.add(new Genre(Genre.POLICIER));
		bibliotheque.modeIkea(0, genreEtagere0);
		
		bibliotheque.modeIkea(1, new Genre(Genre.SCIENCE));
		
		bibliotheque.modeIkea(2, new Genre(Genre.SCIENCE_FICTION));
		
		bibliotheque.modeIkea(3, new Genre(Genre.POLITIQUE));
		
		// affichage de la vue
		Vue frame = new Vue(bibliotheque, null, null, null);
		frame.setVisible(true);
		
		
		// Ajout livres console
		try {
//			bibliotheque.nouveauLivre("monLivrePolitique_1", Genre.POLITIQUE);
//			bibliotheque.nouveauLivre("monLivrePolitique_3", Genre.POLITIQUE);
//			bibliotheque.nouveauLivre("monLivrePolitique_2", Genre.POLITIQUE);
//			
//			bibliotheque.nouveauLivre("monLivreHistoire_1", Genre.HISTOIRE);
//			
//			bibliotheque.nouveauLivre("monLivreScience", Genre.SCIENCE);
//			
//			bibliotheque.nouveauLivre("monLivre_3_Policier", Genre.POLICIER);
//			bibliotheque.nouveauLivre("monLivre_2_Policier", Genre.POLICIER);
//			bibliotheque.nouveauLivre("monLivre_1_Policier", Genre.POLICIER);
//			
//			bibliotheque.nouveauLivre("monLivreSF", Genre.SCIENCE_FICTION);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		System.out.println("Bibliotheque :");
		System.out.println(bibliotheque.toString());
	}
}
