package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class Genre {
	public static final int SCIENCE = 0;
	public static final int HISTOIRE = 1;
	public static final int SCIENCE_FICTION = 2;
	public static final int POLICIER = 3;
	public static final int POLITIQUE = 4;
	
	public static final String[] NOM_GENRES = {"Science", "Histoire", "Science fiction", "Policier", "Politique"};
	
	// Du type Genre.SCIENCE
	private int identifiantGenre;
	
	// Contient les livres du genre identifiantGenre dont la clef est le titre du livre et la valeur le livre lui-meme
	private SortedMap<String, Livre> livres;
	/**
	 * 
	 * @param identifiantGenre
	 * @see TreeMap
	 */
	public Genre(int identifiantGenre) {
		
		this.identifiantGenre = identifiantGenre;
		livres = new TreeMap<String, Livre>();
	}
	/**
	 * 
	 * @return
	 */
	public int getIdentifiantGenre() {
		return identifiantGenre;
	}
	/**
	 * 
	 * @param livre
	 */
	public void placeLivre(Livre livre) {
		// Dans l'ordre d'ajout
		livres.put(livre.getTitre(), livre);
	}
	
	/**
	 * Retourne une liste de livres triees
	 * @see ArrayList
	 * @return
	 */
	public List<Livre> getLivres() {
		List<Livre> livresTries = new ArrayList<Livre>();
		
		// Titres des livres tries par ordre alphabetique dans une liste
		Set<String> titresTries = livres.keySet();
		
		
		for (String titre : titresTries) {
			// Dans l'ordre des titres
			livresTries.add(livres.get(titre));
		}
		
		return livresTries;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		List<Livre> l = getLivres();
		sb.append("["+Genre.NOM_GENRES[identifiantGenre]+"]: ");
		for (Livre livre : l) {
			sb.append(livre.getTitre()+", ");
		}
		sb.append("\n");
		return sb.toString();
	}
}
