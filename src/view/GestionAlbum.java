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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GestionAlbum extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public GestionAlbum() {
		setTitle("Gestion de Biblioteque de Musical - Gestion des Albums");
		setBounds( 100, 100, 701, 403 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 0, 0, 101, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblGestionDesAlbums = new JLabel("Gestion des Albums");
		lblGestionDesAlbums.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGestionDesAlbums = new GridBagConstraints();
		gbc_lblGestionDesAlbums.gridwidth = 2;
		gbc_lblGestionDesAlbums.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestionDesAlbums.gridx = 1;
		gbc_lblGestionDesAlbums.gridy = 0;
		contentPane.add(lblGestionDesAlbums, gbc_lblGestionDesAlbums);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRechercher.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercher.gridx = 3;
		gbc_btnRechercher.gridy = 1;
		contentPane.add(btnRechercher, gbc_btnRechercher);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 4;
		gbc_table.gridwidth = 2;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 2;
		contentPane.add(table, gbc_table);
		
		JButton btnNouveau = new JButton("Nouveau");
		GridBagConstraints gbc_btnNouveau = new GridBagConstraints();
		gbc_btnNouveau.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNouveau.insets = new Insets(0, 0, 5, 0);
		gbc_btnNouveau.gridx = 3;
		gbc_btnNouveau.gridy = 2;
		contentPane.add(btnNouveau, gbc_btnNouveau);
		
		JButton btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAjouter.insets = new Insets(0, 0, 5, 0);
		gbc_btnAjouter.gridx = 3;
		gbc_btnAjouter.gridy = 3;
		contentPane.add(btnAjouter, gbc_btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModifier.insets = new Insets(0, 0, 5, 0);
		gbc_btnModifier.gridx = 3;
		gbc_btnModifier.gridy = 4;
		contentPane.add(btnModifier, gbc_btnModifier);
		
		JButton btnRemplacer = new JButton("Remplacer");
		GridBagConstraints gbc_btnRemplacer = new GridBagConstraints();
		gbc_btnRemplacer.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemplacer.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemplacer.gridx = 0;
		gbc_btnRemplacer.gridy = 5;
		contentPane.add(btnRemplacer, gbc_btnRemplacer);
		
		JButton btnNewButton = new JButton("Supprimer");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblInformation = new GridBagConstraints();
		gbc_lblInformation.gridwidth = 2;
		gbc_lblInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformation.gridx = 1;
		gbc_lblInformation.gridy = 6;
		contentPane.add(lblInformation, gbc_lblInformation);
		
		JLabel label = new JLabel("#");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 7;
		contentPane.add(label, gbc_label);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 7;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTitre = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre = new GridBagConstraints();
		gbc_lblTitre.anchor = GridBagConstraints.EAST;
		gbc_lblTitre.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre.gridx = 1;
		gbc_lblTitre.gridy = 8;
		contentPane.add(lblTitre, gbc_lblTitre);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 8;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Genre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 9;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 9;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAnner = new JLabel("Ann\u00E9");
		GridBagConstraints gbc_lblAnner = new GridBagConstraints();
		gbc_lblAnner.anchor = GridBagConstraints.EAST;
		gbc_lblAnner.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnner.gridx = 1;
		gbc_lblAnner.gridy = 10;
		contentPane.add(lblAnner, gbc_lblAnner);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 10;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblArtiste = new JLabel("# Artiste");
		GridBagConstraints gbc_lblArtiste = new GridBagConstraints();
		gbc_lblArtiste.anchor = GridBagConstraints.EAST;
		gbc_lblArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtiste.gridx = 1;
		gbc_lblArtiste.gridy = 11;
		contentPane.add(lblArtiste, gbc_lblArtiste);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 11;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblErreur = new JLabel("");
		GridBagConstraints gbc_lblErreur = new GridBagConstraints();
		gbc_lblErreur.gridwidth = 4;
		gbc_lblErreur.gridx = 0;
		gbc_lblErreur.gridy = 12;
		contentPane.add(lblErreur, gbc_lblErreur);
	}

}
