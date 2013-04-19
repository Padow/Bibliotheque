package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author Padow2
 *
 */
public class Etagere {
	private int numero;
	private List<Genre> genres;
	/**
	 * 
	 * @param numero
	 */
	public Etagere(int numero) {
		this.numero = numero;
		genres = new ArrayList<Genre>();
	}
	/**
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Retourne le Genre pour l'identifiant donne, s'il n'a pas ete trouve, retourne null (inexistant dans cette etagere)
	 * @param identifiantGenre
	 * @return
	 */
	public Genre getGenre(int identifiantGenre) {
		for (Genre genreDeLEtagere : genres) {
			if (genreDeLEtagere.getIdentifiantGenre() == identifiantGenre) // Contains
				return genreDeLEtagere;
		}
		return null;
	}
	/**
	 * 
	 * @param genre
	 */
	public void addGenre(Genre genre) {
		genres.add(genre);
	}
	/**
	 * 
	 * @param genres
	 */
	public void addGenres(Collection<Genre> genres) {
		this.genres.addAll(genres);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Genre livresDuGenre : genres) {
			sb.append("[Etagere: "+numero+"]");
			sb.append(livresDuGenre.toString());
		}
		return sb.toString();
	}
}
