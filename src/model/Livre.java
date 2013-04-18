package model;

/**
 * 
 * @author PADOW TODO
 *
 */
public class Livre {

	private String titre;
	private int genre;

	/**
	 * 
	 * @param titre
	 * @param genre
	 */
	public Livre(String titre, int genre) {
		this.titre = titre;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public int getGenre() {
		return genre;
	}
}
