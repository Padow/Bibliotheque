package model;
/**
 * 
 * @author Padow2
 *
 */
public class Livre {

	private String titre;
	private String auteur;
	private String editeur;
	private int genre;

	/**
	 * 
	 * @param titre
	 * @param genre
	 */
	public Livre(String titre, String auteur, String editeur, int genre) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() { return  auteur; }

	public  String getEditeur() { return editeur; }

	public int getGenre() {
		return genre;
	}
}
