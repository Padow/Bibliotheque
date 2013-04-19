package Vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Controleur.Controleur;

import model.Bibliotheque;
import model.Etagere;
import model.Genre;
import model.Livre;
/**
 * 
 * @author Padow2
 *
 */
public class Vue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAjouter;
	private JComboBox<String> comboBox ;
	
	private Controleur c1;
	private Bibliotheque b1;
	private Etagere e1;
	private Genre g1;
	private Livre l1;

	/**
	 * Create the frame.
	 */
	public Vue(Bibliotheque b1, Etagere e1, Genre g1, Livre l1) {
		this.b1=b1;
		Controleur c1 = new Controleur(this, b1, e1, g1, l1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(51, 58, 46, 14);
		contentPane.add(lblTitre);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(51, 114, 46, 14);
		contentPane.add(lblGenre);
		
		textField = new JTextField();
		textField.setBounds(133, 58, 215, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(133, 114, 215, 20);
		contentPane.add(comboBox);
		for (int i=0; i<Genre.NOM_GENRES.length; i++) {
			comboBox.addItem(Genre.NOM_GENRES[i]);
		}
		
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(159, 182, 89, 23);
		contentPane.add(btnAjouter);
		btnAjouter.addActionListener(c1);
		
		
		
		
	}
	/**
	 * recuperation du TextField
	 * @return
	 */
	public JTextField getTextField() {
		return textField;
	}
	/**
	 * recuperation de la JCombobox
	 * @return
	 */
	public JComboBox<String> getComboBox() {
		return comboBox;
	}


	

	
	
}
