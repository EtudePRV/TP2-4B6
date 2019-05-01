package view;

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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class GestionAlbum extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textRecherche;
	private JTextField textId;
	private JTextField textTitre;
	private JButton btnRechercher;
	private JButton btnNouveau;
	private JButton btnModifier;
	private JButton btnSupprimer;
	private JLabel lblImg;
	private JComboBox comboBoxGenre;
	private JSpinner spinnerAnnee;
	private JButton btnRemplacer;
	private JButton btnAjouter;
	private JComboBox comboBoxArtiste;
	private JButton btnAnnuler;
	private JLabel lblErreur;
	
	public GestionAlbum() {
		setTitle("Gestion de Biblioteque de Musical - Gestion des Albums");
		setBounds( 100, 100, 701, 403 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 0, 0, 101, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblGestionDesAlbums = new JLabel("Gestion des Albums");
		lblGestionDesAlbums.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGestionDesAlbums = new GridBagConstraints();
		gbc_lblGestionDesAlbums.gridwidth = 2;
		gbc_lblGestionDesAlbums.insets = new Insets(0, 0, 5, 5);
		gbc_lblGestionDesAlbums.gridx = 1;
		gbc_lblGestionDesAlbums.gridy = 0;
		contentPane.add(lblGestionDesAlbums, gbc_lblGestionDesAlbums);
		
		textRecherche = new JTextField();
		GridBagConstraints gbc_textRecherche = new GridBagConstraints();
		gbc_textRecherche.gridwidth = 2;
		gbc_textRecherche.insets = new Insets(0, 0, 5, 5);
		gbc_textRecherche.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRecherche.gridx = 1;
		gbc_textRecherche.gridy = 1;
		contentPane.add(textRecherche, gbc_textRecherche);
		textRecherche.setColumns(10);
		
		 btnRechercher = new JButton("Rechercher");
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRechercher.insets = new Insets(0, 0, 5, 0);
		gbc_btnRechercher.gridx = 3;
		gbc_btnRechercher.gridy = 1;
		contentPane.add(btnRechercher, gbc_btnRechercher);
		
		 btnNouveau = new JButton("Nouveau");
		GridBagConstraints gbc_btnNouveau = new GridBagConstraints();
		gbc_btnNouveau.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNouveau.insets = new Insets(0, 0, 5, 0);
		gbc_btnNouveau.gridx = 3;
		gbc_btnNouveau.gridy = 2;
		contentPane.add(btnNouveau, gbc_btnNouveau);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		 btnModifier = new JButton("Modifier");
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModifier.insets = new Insets(0, 0, 5, 0);
		gbc_btnModifier.gridx = 3;
		gbc_btnModifier.gridy = 3;
		contentPane.add(btnModifier, gbc_btnModifier);
		
		 btnSupprimer = new JButton("Supprimer");
		GridBagConstraints gbc_btnSupprimer = new GridBagConstraints();
		gbc_btnSupprimer.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSupprimer.insets = new Insets(0, 0, 5, 0);
		gbc_btnSupprimer.gridx = 3;
		gbc_btnSupprimer.gridy = 4;
		contentPane.add(btnSupprimer, gbc_btnSupprimer);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblInformation = new GridBagConstraints();
		gbc_lblInformation.gridwidth = 2;
		gbc_lblInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformation.gridx = 1;
		gbc_lblInformation.gridy = 6;
		contentPane.add(lblInformation, gbc_lblInformation);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 5;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 7;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		 lblImg = new JLabel("");
		scrollPane_1.setViewportView(lblImg);
		
		JLabel label = new JLabel("#");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 7;
		contentPane.add(label, gbc_label);
		
		textId = new JTextField();
		GridBagConstraints gbc_textId = new GridBagConstraints();
		gbc_textId.insets = new Insets(0, 0, 5, 5);
		gbc_textId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textId.gridx = 2;
		gbc_textId.gridy = 7;
		contentPane.add(textId, gbc_textId);
		textId.setColumns(10);
		
		JLabel lblTitre = new JLabel("Titre");
		GridBagConstraints gbc_lblTitre = new GridBagConstraints();
		gbc_lblTitre.anchor = GridBagConstraints.EAST;
		gbc_lblTitre.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitre.gridx = 1;
		gbc_lblTitre.gridy = 8;
		contentPane.add(lblTitre, gbc_lblTitre);
		
		textTitre = new JTextField();
		GridBagConstraints gbc_textTitre = new GridBagConstraints();
		gbc_textTitre.insets = new Insets(0, 0, 5, 5);
		gbc_textTitre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTitre.gridx = 2;
		gbc_textTitre.gridy = 8;
		contentPane.add(textTitre, gbc_textTitre);
		textTitre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Genre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 9;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		 comboBoxGenre = new JComboBox();
		GridBagConstraints gbc_comboBoxGenre = new GridBagConstraints();
		gbc_comboBoxGenre.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGenre.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGenre.gridx = 2;
		gbc_comboBoxGenre.gridy = 9;
		contentPane.add(comboBoxGenre, gbc_comboBoxGenre);
		
		JLabel lblAnner = new JLabel("Ann\u00E9");
		GridBagConstraints gbc_lblAnner = new GridBagConstraints();
		gbc_lblAnner.anchor = GridBagConstraints.EAST;
		gbc_lblAnner.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnner.gridx = 1;
		gbc_lblAnner.gridy = 10;
		contentPane.add(lblAnner, gbc_lblAnner);
		
		 spinnerAnnee = new JSpinner();
		GridBagConstraints gbc_spinnerAnnee = new GridBagConstraints();
		gbc_spinnerAnnee.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerAnnee.gridx = 2;
		gbc_spinnerAnnee.gridy = 10;
		contentPane.add(spinnerAnnee, gbc_spinnerAnnee);
		
		JLabel lblArtiste = new JLabel("Artiste");
		GridBagConstraints gbc_lblArtiste = new GridBagConstraints();
		gbc_lblArtiste.anchor = GridBagConstraints.EAST;
		gbc_lblArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtiste.gridx = 1;
		gbc_lblArtiste.gridy = 11;
		contentPane.add(lblArtiste, gbc_lblArtiste);
		
		 btnRemplacer = new JButton("Remplacer");
		btnRemplacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		 comboBoxArtiste = new JComboBox();
		GridBagConstraints gbc_comboBoxArtiste = new GridBagConstraints();
		gbc_comboBoxArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxArtiste.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxArtiste.gridx = 2;
		gbc_comboBoxArtiste.gridy = 11;
		contentPane.add(comboBoxArtiste, gbc_comboBoxArtiste);
		GridBagConstraints gbc_btnRemplacer = new GridBagConstraints();
		gbc_btnRemplacer.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemplacer.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemplacer.gridx = 0;
		gbc_btnRemplacer.gridy = 12;
		contentPane.add(btnRemplacer, gbc_btnRemplacer);
		
		 btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.anchor = GridBagConstraints.EAST;
		gbc_btnAnnuler.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 12;
		contentPane.add(btnAnnuler, gbc_btnAnnuler);
		
		 btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.anchor = GridBagConstraints.WEST;
		gbc_btnAjouter.insets = new Insets(0, 0, 5, 5);
		gbc_btnAjouter.gridx = 2;
		gbc_btnAjouter.gridy = 12;
		contentPane.add(btnAjouter, gbc_btnAjouter);
		
		 lblErreur = new JLabel("");
		GridBagConstraints gbc_lblErreur = new GridBagConstraints();
		gbc_lblErreur.gridwidth = 4;
		gbc_lblErreur.gridx = 0;
		gbc_lblErreur.gridy = 13;
		contentPane.add(lblErreur, gbc_lblErreur);
	}

}
