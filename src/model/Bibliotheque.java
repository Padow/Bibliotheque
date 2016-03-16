package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author Padow2
 *
 */
public class Bibliotheque {

	private List<Etagere> etageres;
	
	public Bibliotheque() {
		etageres = new ArrayList<Etagere>();
	}
	
	/**
	 * On ajoute (creer) une etagere dans la bibliotheque contenant plusieurs genres de livres
	 * @param numero
	 * @param genres
	 */
	public void modeIkea(int numero, Collection<Genre> genres) {
		Etagere etagere = new Etagere(numero);
		etagere.addGenres(genres);
		
		etageres.add(etagere);
	}
	
	/**
	 * On ajoute (creer) une etagere dans la bibliotheque contenant un seul genre de livres
	 * @param numero
	 * @param genre
	 */
	public void modeIkea(int numero, Genre genre) {
		Etagere etagere = new Etagere(numero);
		etagere.addGenre(genre);
		
		etageres.add(etagere);
	}
	
	/**
	 * on creer un nouveau livre et on regarde si son genre existe dans la bibliotheque
	 * @param titre
	 * @param genre
	 * @throws Exception
	 */
	public void nouveauLivre(String titre,String auteur, String editeur,  int genre) throws Exception {
		Livre livre = new Livre(titre, auteur, editeur, genre);
		for (Etagere etagere : etageres) {
			Genre genreDeLEtagere = etagere.getGenre(genre);
			if (genreDeLEtagere != null) {
				genreDeLEtagere.placeLivre(livre);
				return;
			}
		}
		throw new Exception("Erreur fatale !! Aucune etagere ne contient le genre ["+Genre.NOM_GENRES[genre]+"]");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Etagere etagere : etageres) {
			sb.append(etagere.toString());
		}
		return sb.toString();
	}

}
