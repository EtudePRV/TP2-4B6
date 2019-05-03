package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import listeners.ArtisteListener;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class GestionArtiste extends JFrame {

	private ArtisteListener listener;
	private JPanel contentPane;
	private JTable table;
	private JTextField textRecherche;
	private JTextField textId;
	private JTextField textNom;
	private JLabel lblGestionDartiste;
	private JButton btnRechercher;
	private JButton Nouveau;
	private JButton btnModifier;
	private JButton btnSupprimer;
	private JList list;
	private JPanel panelImage;
	private JCheckBox chckbxMembre;
	private JButton btnAnnuler;
	private JButton btnAjouter;
	private JButton btnRemplacer;
	private JLabel lblErreur;
	private String imgLink;
	private JLabel lblImg;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	public GestionArtiste( ArtisteListener ViewListener ) {
		listener = ViewListener;
		this.addWindowListener( listener );
		setTitle( "Gestion de Biblioteque de Musical - Gestion des Artistes" );
		setBounds( 100, 100, 702, 379 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 120, 0, 0, 120, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 28, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				1.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout( gbl_contentPane );

		lblGestionDartiste = new JLabel( "Gestion des Artiste" );
		lblGestionDartiste.setFont( new Font( "Tahoma", Font.PLAIN, 18 ) );
		GridBagConstraints gbc_lblGestionDartiste = new GridBagConstraints();
		gbc_lblGestionDartiste.gridwidth = 2;
		gbc_lblGestionDartiste.insets = new Insets( 0, 0, 5, 5 );
		gbc_lblGestionDartiste.gridx = 1;
		gbc_lblGestionDartiste.gridy = 0;
		contentPane.add( lblGestionDartiste, gbc_lblGestionDartiste );

		textRecherche = new JTextField();
		GridBagConstraints gbc_textRecherche = new GridBagConstraints();
		gbc_textRecherche.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRecherche.gridwidth = 2;
		gbc_textRecherche.insets = new Insets( 0, 0, 5, 5 );
		gbc_textRecherche.gridx = 1;
		gbc_textRecherche.gridy = 1;
		contentPane.add( textRecherche, gbc_textRecherche );
		textRecherche.setColumns( 10 );

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets( 0, 0, 5, 5 );
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		contentPane.add( scrollPane, gbc_scrollPane );

		table = new JTable();
		scrollPane.setViewportView( table );
		table.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
		table.setAutoscrolls( true );
		table.addMouseListener( listener );

		btnRechercher = new JButton( "Rechercher" );
		btnRechercher.addActionListener( listener );
		GridBagConstraints gbc_btnRechercher = new GridBagConstraints();
		gbc_btnRechercher.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRechercher.insets = new Insets( 0, 0, 5, 0 );
		gbc_btnRechercher.gridx = 3;
		gbc_btnRechercher.gridy = 1;
		contentPane.add( btnRechercher, gbc_btnRechercher );

		Nouveau = new JButton( "Nouveau" );
		Nouveau.addActionListener( listener );
		GridBagConstraints gbc_Nouveau = new GridBagConstraints();
		gbc_Nouveau.fill = GridBagConstraints.BOTH;
		gbc_Nouveau.insets = new Insets( 0, 0, 5, 0 );
		gbc_Nouveau.gridx = 3;
		gbc_Nouveau.gridy = 2;
		contentPane.add( Nouveau, gbc_Nouveau );

		btnModifier = new JButton( "Modifier" );
		btnModifier.addActionListener( listener );
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.fill = GridBagConstraints.BOTH;
		gbc_btnModifier.insets = new Insets( 0, 0, 5, 0 );
		gbc_btnModifier.gridx = 3;
		gbc_btnModifier.gridy = 3;
		contentPane.add( btnModifier, gbc_btnModifier );

		btnSupprimer = new JButton( "Supprimer" );
		btnSupprimer.addActionListener( listener );
		GridBagConstraints gbc_btnSupprimer = new GridBagConstraints();
		gbc_btnSupprimer.fill = GridBagConstraints.BOTH;
		gbc_btnSupprimer.insets = new Insets( 0, 0, 5, 0 );
		gbc_btnSupprimer.gridx = 3;
		gbc_btnSupprimer.gridy = 4;
		contentPane.add( btnSupprimer, gbc_btnSupprimer );

		JLabel lblInformation = new JLabel( "Information" );
		lblInformation.setFont( new Font( "Tahoma", Font.PLAIN, 18 ) );
		GridBagConstraints gbc_lblInformation = new GridBagConstraints();
		gbc_lblInformation.gridwidth = 2;
		gbc_lblInformation.insets = new Insets( 0, 0, 5, 5 );
		gbc_lblInformation.gridx = 1;
		gbc_lblInformation.gridy = 6;
		contentPane.add( lblInformation, gbc_lblInformation );

		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 7;
		gbc_list.insets = new Insets( 0, 0, 5, 5 );
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 7;
		contentPane.add( list, gbc_list );

		JLabel label = new JLabel( "#" );
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets( 0, 0, 5, 5 );
		gbc_label.gridx = 1;
		gbc_label.gridy = 8;
		contentPane.add( label, gbc_label );

		textId = new JTextField();
		textId.setEnabled(false);
		GridBagConstraints gbc_textId = new GridBagConstraints();
		gbc_textId.fill = GridBagConstraints.HORIZONTAL;
		gbc_textId.insets = new Insets( 0, 0, 5, 5 );
		gbc_textId.gridx = 2;
		gbc_textId.gridy = 8;
		contentPane.add( textId, gbc_textId );
		textId.setColumns( 10 );

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridheight = 7;
		gbc_scrollPane_1.insets = new Insets( 0, 0, 5, 0 );
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 7;
		contentPane.add( scrollPane_1, gbc_scrollPane_1 );

		panelImage = new JPanel();
		scrollPane_1.setViewportView( panelImage );

		panelImage.setLayout( new BorderLayout( 0, 0 ) );
		panelImage.setMaximumSize( new Dimension( 120, 120 ) );
		lblImg = new JLabel( new ImageIcon(
				"C:\\Users\\Peter\\OneDrive\\Documents\\Programing\\Java_Eclipse\\WO\\TP2-4B6\\DB\\img\\blank.png" ) );
		panelImage.add( lblImg );

		JLabel lblNom = new JLabel( "Nom:" );
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets( 0, 0, 5, 5 );
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.gridx = 1;
		gbc_lblNom.gridy = 9;
		contentPane.add( lblNom, gbc_lblNom );

		textNom = new JTextField();
		textNom.setEnabled( false );
		GridBagConstraints gbc_textNom = new GridBagConstraints();
		gbc_textNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNom.insets = new Insets( 0, 0, 5, 5 );
		gbc_textNom.gridx = 2;
		gbc_textNom.gridy = 9;
		contentPane.add( textNom, gbc_textNom );
		textNom.setColumns( 10 );

		JLabel lblMembre = new JLabel( "Membre:" );
		GridBagConstraints gbc_lblMembre = new GridBagConstraints();
		gbc_lblMembre.anchor = GridBagConstraints.EAST;
		gbc_lblMembre.insets = new Insets( 0, 0, 5, 5 );
		gbc_lblMembre.gridx = 1;
		gbc_lblMembre.gridy = 10;
		contentPane.add( lblMembre, gbc_lblMembre );

		chckbxMembre = new JCheckBox( "" );
		chckbxMembre.setEnabled( false );
		GridBagConstraints gbc_chckbxMembre = new GridBagConstraints();
		gbc_chckbxMembre.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxMembre.insets = new Insets( 0, 0, 5, 5 );
		gbc_chckbxMembre.gridx = 2;
		gbc_chckbxMembre.gridy = 10;
		contentPane.add( chckbxMembre, gbc_chckbxMembre );

		btnAnnuler = new JButton( "Annuler" );
		btnAnnuler.addActionListener( listener );
		btnAnnuler.setEnabled( false );
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.anchor = GridBagConstraints.EAST;
		gbc_btnAnnuler.insets = new Insets( 0, 0, 5, 5 );
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 11;
		contentPane.add( btnAnnuler, gbc_btnAnnuler );

		btnAjouter = new JButton( "Ajouter" );
		btnAjouter.addActionListener( listener );
		btnAjouter.setEnabled( false );
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.anchor = GridBagConstraints.WEST;
		gbc_btnAjouter.insets = new Insets( 0, 0, 5, 5 );
		gbc_btnAjouter.gridx = 2;
		gbc_btnAjouter.gridy = 11;
		contentPane.add( btnAjouter, gbc_btnAjouter );

		lblErreur = new JLabel( "" );
		GridBagConstraints gbc_lblErreur = new GridBagConstraints();
		gbc_lblErreur.gridwidth = 3;
		gbc_lblErreur.insets = new Insets( 0, 0, 0, 5 );
		gbc_lblErreur.gridx = 0;
		gbc_lblErreur.gridy = 14;
		contentPane.add( lblErreur, gbc_lblErreur );

		btnRemplacer = new JButton( "Remplacer" );
		btnRemplacer.addActionListener( listener );
		btnRemplacer.setEnabled( false );
		GridBagConstraints gbc_btnRemplacer = new GridBagConstraints();
		gbc_btnRemplacer.fill = GridBagConstraints.BOTH;
		gbc_btnRemplacer.gridx = 3;
		gbc_btnRemplacer.gridy = 14;
		contentPane.add( btnRemplacer, gbc_btnRemplacer );
		this.setVisible( true );
	}

	public void enableModification() {
		textNom.setEnabled( true );
		chckbxMembre.setEnabled( true );
		btnAjouter.setEnabled( true );
		btnAnnuler.setEnabled( true );
		btnRemplacer.setEnabled( true );
		updateImage();
		this.setError( "" );
	}

	public void disableModification() {
		this.clearValues();
		textNom.setEnabled( false );
		chckbxMembre.setEnabled( false );
		btnAjouter.setEnabled( false );
		btnAnnuler.setEnabled( false );
		btnRemplacer.setEnabled( false );
		updateImage();
		this.setError( "" );
	}

	public void clearValues() {
		textId.setText( "" );
		textNom.setText( "" );
		chckbxMembre.setSelected( false );
		imgLink = System.getProperty( "user.dir" ) + "/DB/img/blank.png";
	}

	public void setError( String error ) {
		lblErreur.setText( error );
	}

	public String[] getValues() {
		String[] values = new String[4];
		values[0] = textId.getText();
		values[1] = textNom.getText();
		values[3] = imgLink;
		if ( chckbxMembre.isSelected() ) {
			values[2] = "1";
		} else {
			values[2] = "0";
		}

		return values;
	}

	public void setValues( String id, String nom, boolean value, String lien ) {
		textId.setText( id );
		textNom.setText( nom );
		this.setImg(lien);
		chckbxMembre.setSelected( value );
	}

	public void setTable( DefaultTableModel model ) {
		table.setModel( model );
	}

	public String getRecherche() {
		return textRecherche.getText();

	}

	public void setImg( String link ) {
		imgLink = link;
		updateImage();
	}

	public void updateImage() {
		ImageIcon imgI = new ImageIcon(imgLink);
		Image img = imgI.getImage();
		Image newImg = img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		lblImg.setIcon( new ImageIcon( newImg ) );
	}
	public void setList(String[] tempString) {
		DefaultListModel<String> listModel = new DefaultListModel<>();
		for(String line : tempString) {
			listModel.addElement( line );
		}
		list.setModel( listModel );
	}

}