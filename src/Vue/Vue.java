package Vue;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Genre;

/**
 * 
 * @author Padow2
 *
 */
public class Vue extends JFrame {
	
	// https://github.com/romfret/ws-coa/blob/master/project/src/main/java/gui/GlobalGUI.java

	private JPanel contentPane;
	private JTextField textField;
	public Genre genre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vue frame = new Vue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblLivre = new JLabel("Titre");
		lblLivre.setBounds(51, 53, 46, 14);
		contentPane.add(lblLivre);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(51, 106, 46, 14);
		contentPane.add(lblGenre);
		
		textField = new JTextField();
		textField.setBounds(133, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 103, 86, 17);
		comboBox.addItem("");
		for (int i=0; i<Genre.NOM_GENRES.length; i++) {
			comboBox.addItem(Genre.NOM_GENRES[i]);
		}
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identifiantGenre = comboBox.getSelectedIndex() - 1;
				
			}
		});
	
		contentPane.add(comboBox);
		
		JButton btnAjouter = new JButton("Ajouter ");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAjouter.setBounds(180, 178, 89, 23);
		contentPane.add(btnAjouter);
	}
}
