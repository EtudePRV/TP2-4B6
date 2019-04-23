package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	
	public Menu() {
		setTitle("Gestion de Biblioteque de Musical - Menu");
		setBounds( 100, 100, 450, 215 );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("Utilisateur");
		menuBar.add(mnUser);
		
		JMenuItem mntmDeconexion = new JMenuItem("Deconexion");
		mnUser.add(mntmDeconexion);
		
		JMenuItem mntmQuiter = new JMenuItem("Quiter");
		mnUser.add(mntmQuiter);
		
		JMenu mnMenu = new JMenu("Fenetre");
		menuBar.add(mnMenu);
		
		JMenuItem mntmGestionAlbum = new JMenuItem("Gestion Album");
		mnMenu.add(mntmGestionAlbum);
		
		JMenuItem mntmGestionArtiste = new JMenuItem("Gestion Artiste");
		mnMenu.add(mntmGestionArtiste);
		
		JMenu mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		
		JMenuItem mntmAide = new JMenuItem("Aide");
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
		
		JButton btnGestionDesAlbum = new JButton("Gestion des Album");
		GridBagConstraints gbc_btnGestionDesAlbum = new GridBagConstraints();
		gbc_btnGestionDesAlbum.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGestionDesAlbum.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestionDesAlbum.gridx = 1;
		gbc_btnGestionDesAlbum.gridy = 1;
		contentPane.add(btnGestionDesAlbum, gbc_btnGestionDesAlbum);
		
		JButton btnGestionDesArtiste = new JButton("Gestion des Artiste");
		GridBagConstraints gbc_btnGestionDesArtiste = new GridBagConstraints();
		gbc_btnGestionDesArtiste.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGestionDesArtiste.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestionDesArtiste.gridx = 1;
		gbc_btnGestionDesArtiste.gridy = 2;
		contentPane.add(btnGestionDesArtiste, gbc_btnGestionDesArtiste);
		
		JButton btnQuiter = new JButton("Quiter");
		btnQuiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDeconexion = new JButton("Deconexion");
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
	}

}
