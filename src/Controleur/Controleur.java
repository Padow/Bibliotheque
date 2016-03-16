package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vue.Vue;

import model.Bibliotheque;
import model.Etagere;
import model.Genre;
import model.Livre;
/**
 * 
 * @author Padow2
 *
 */
public class Controleur implements ActionListener {
	
	private Vue vue;
	private Bibliotheque b1;
	private Etagere e1;
	private Genre g1;
	private Livre l1;
	/**
	 * 
	 * @param vue
	 * @param b1
	 * @param e1
	 * @param g1
	 * @param l1
	 */
	public Controleur (Vue vue, Bibliotheque b1, Etagere e1, Genre g1, Livre l1) {
		this.vue=vue;
		this.b1=b1;
		this.e1=e1;
		this.g1=g1;
		this.l1=l1;
	}
	
	



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		try {
			b1.nouveauLivre(vue.getTextField().getText(), vue.getAuteurField().getText(), vue.getEditeurField().getText(), vue.getComboBox().getSelectedIndex());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Bibliotheque :");
		System.out.println(b1.toString());
	}
	

}
