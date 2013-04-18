package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Etagere {
	private int numero;
	private List<Genre> genres;
	
	public Etagere(int numero) {
		this.numero = numero;
		genres = new ArrayList<Genre>();
	}

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
	
	public void addGenre(Genre genre) {
		genres.add(genre);
	}
	
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
