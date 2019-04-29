package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listeners.MenuListener;

import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;


public class Menu extends JFrame {

	private MenuListener listner;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnUser;
	private JMenuItem mntmDeconexion;
	private JMenuItem mntmQuiter;
	private JMenu mnMenu;
	private JMenuItem mntmGestionAlbum;
	private JMenuItem mntmGestionArtiste;
	private JMenu mnAide;
	private JMenuItem mntmAide;
	private JButton btnGestionDesAlbum;
	private JButton btnGestionDesArtiste;
	private JButton btnQuiter;
	private JButton btnDeconexion;
	
	public Menu(MenuListener menuListner) {
		listner = menuListner;
		this.addWindowListener( listner );
		setTitle("Gestion de Biblioteque de Musical - Menu");
		setBounds( 100, 100, 450, 215 );
		
		 menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		 mnUser = new JMenu("Utilisateur");
		menuBar.add(mnUser);
		
		 mntmDeconexion = new JMenuItem("Deconexion");
		mnUser.add(mntmDeconexion);
		
		 mntmQuiter = new JMenuItem("Quiter");
		 mntmQuiter.addActionListener(listner);
		mnUser.add(mntmQuiter);
		
		 mnMenu = new JMenu("Fenetre");
		menuBar.add(mnMenu);
		
		 mntmGestionAlbum = new JMenuItem("Gestion des Album");
		 mntmGestionAlbum.addActionListener(listner);
		mnMenu.add(mntmGestionAlbum);
		
		 mntmGestionArtiste = new JMenuItem("Gestion des Artiste");
		 mntmGestionArtiste.addActionListener(listner);
		mnMenu.add(mntmGestionArtiste);
		
		 mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		
		 mntmAide = new JMenuItem("Aide");
		 mntmAide.addActionListener(listner);
		mnAide.add(mntmAide);
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 250, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		 btnGestionDesAlbum = new JButton("Gestion des Album");
		 btnGestionDesAlbum.addActionListener(listner);
		GridBagConstraints gbc_btnGestionDesAlbum = new GridBagConstraints();
		gbc_btnGestionDesAlbum.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGestionDesAlbum.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestionDesAlbum.gridx = 1;
		gbc_btnGestionDesAlbum.gridy = 1;
		contentPane.add(btnGestionDesAlbum, gbc_btnGestionDesAlbum);
		
		 btnGestionDesArtiste = new JButton("Gestion des Artiste");
		 btnGestionDesArtiste.addActionListener(listner);
		GridBagConstraints gbc_btnGestionDesArtiste = new GridBagConstraints();
		gbc_btnGestionDesArtiste.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGestionDesArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestionDesArtiste.gridx = 1;
		gbc_btnGestionDesArtiste.gridy = 2;
		contentPane.add(btnGestionDesArtiste, gbc_btnGestionDesArtiste);
		
		 btnQuiter = new JButton("Quiter");
		btnQuiter.addActionListener(listner);
		
		 btnDeconexion = new JButton("Deconexion");
		 btnDeconexion.addActionListener(listner);
		GridBagConstraints gbc_btnDeconexion = new GridBagConstraints();
		gbc_btnDeconexion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDeconexion.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeconexion.gridx = 1;
		gbc_btnDeconexion.gridy = 3;
		contentPane.add(btnDeconexion, gbc_btnDeconexion);
		GridBagConstraints gbc_btnQuiter = new GridBagConstraints();
		gbc_btnQuiter.insets = new Insets(0, 0, 0, 5);
		gbc_btnQuiter.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnQuiter.gridx = 1;
		gbc_btnQuiter.gridy = 4;
		contentPane.add(btnQuiter, gbc_btnQuiter);
		this.setVisible( true );
	}

}
