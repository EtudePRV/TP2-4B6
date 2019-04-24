package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AjoutAlbum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public AjoutAlbum() {
		setResizable(false);
		setBounds( 100, 100, 452, 288 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 32, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Ajout d'Album");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("#");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 1;
		contentPane.add(spinner, gbc_spinner);
		
		JLabel lblTitre = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre = new GridBagConstraints();
		gbc_lblTitre.anchor = GridBagConstraints.EAST;
		gbc_lblTitre.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre.gridx = 0;
		gbc_lblTitre.gridy = 2;
		contentPane.add(lblTitre, gbc_lblTitre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblGenre = new JLabel("Genre");
		GridBagConstraints gbc_lblGenre = new GridBagConstraints();
		gbc_lblGenre.anchor = GridBagConstraints.EAST;
		gbc_lblGenre.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenre.gridx = 0;
		gbc_lblGenre.gridy = 3;
		contentPane.add(lblGenre, gbc_lblGenre);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblAnn = new JLabel("Ann\u00E9");
		GridBagConstraints gbc_lblAnn = new GridBagConstraints();
		gbc_lblAnn.anchor = GridBagConstraints.EAST;
		gbc_lblAnn.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnn.gridx = 0;
		gbc_lblAnn.gridy = 4;
		contentPane.add(lblAnn, gbc_lblAnn);
		
		JSpinner spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_1.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_1.gridx = 1;
		gbc_spinner_1.gridy = 4;
		contentPane.add(spinner_1, gbc_spinner_1);
		
		JLabel lblArtiste = new JLabel("# Artiste");
		GridBagConstraints gbc_lblArtiste = new GridBagConstraints();
		gbc_lblArtiste.anchor = GridBagConstraints.EAST;
		gbc_lblArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtiste.gridx = 0;
		gbc_lblArtiste.gridy = 5;
		contentPane.add(lblArtiste, gbc_lblArtiste);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JButton btnImg = new JButton("Img");
		GridBagConstraints gbc_btnImg = new GridBagConstraints();
		gbc_btnImg.anchor = GridBagConstraints.EAST;
		gbc_btnImg.insets = new Insets(0, 0, 5, 5);
		gbc_btnImg.gridx = 0;
		gbc_btnImg.gridy = 6;
		contentPane.add(btnImg, gbc_btnImg);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 6;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblErreur = new JLabel("");
		GridBagConstraints gbc_lblErreur = new GridBagConstraints();
		gbc_lblErreur.gridwidth = 2;
		gbc_lblErreur.insets = new Insets(0, 0, 5, 0);
		gbc_lblErreur.gridx = 0;
		gbc_lblErreur.gridy = 7;
		contentPane.add(lblErreur, gbc_lblErreur);
		
		JButton btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAjouter.insets = new Insets(0, 0, 0, 5);
		gbc_btnAjouter.gridx = 0;
		gbc_btnAjouter.gridy = 8;
		contentPane.add(btnAjouter, gbc_btnAjouter);
		
		JButton btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 8;
		contentPane.add(btnAnnuler, gbc_btnAnnuler);
	}

}
