package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listeners.LogOnListener;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;

public class LogOn extends JFrame {

	private LogOnListener listener;
	private JPanel contentPane;
	private JTextField userText;
	private JLabel lblConnexionALapplication;
	private JLabel userLbl;
	private JLabel passwordLbl;
	private JButton enterBtn;
	private JButton QuitBtn;
	private JLabel errorLbl;
	private JPasswordField passwordField;
	
	public LogOn(LogOnListener LogListener) {
		listener = LogListener;
		this.addWindowListener( listener );
		setResizable(false);
		setTitle("Gestion de Biblioteque de Musical - Connexion");
		setBounds( 100, 100, 450, 172 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 28, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblConnexionALapplication = new JLabel("Connexion a l'application");
		lblConnexionALapplication.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblConnexionALapplication = new GridBagConstraints();
		gbc_lblConnexionALapplication.gridwidth = 3;
		gbc_lblConnexionALapplication.insets = new Insets(0, 0, 5, 0);
		gbc_lblConnexionALapplication.gridx = 0;
		gbc_lblConnexionALapplication.gridy = 0;
		contentPane.add(lblConnexionALapplication, gbc_lblConnexionALapplication);
		
		userLbl = new JLabel("Nom d'Utilisateur");
		GridBagConstraints gbc_userLbl = new GridBagConstraints();
		gbc_userLbl.anchor = GridBagConstraints.EAST;
		gbc_userLbl.insets = new Insets(0, 0, 5, 5);
		gbc_userLbl.gridx = 0;
		gbc_userLbl.gridy = 1;
		contentPane.add(userLbl, gbc_userLbl);
		
		userText = new JTextField();
		GridBagConstraints gbc_userText = new GridBagConstraints();
		gbc_userText.gridwidth = 2;
		gbc_userText.insets = new Insets(0, 0, 5, 0);
		gbc_userText.fill = GridBagConstraints.HORIZONTAL;
		gbc_userText.gridx = 1;
		gbc_userText.gridy = 1;
		contentPane.add(userText, gbc_userText);
		userText.setColumns(10);
		
		passwordLbl = new JLabel("Mot de passe");
		GridBagConstraints gbc_passwordLbl = new GridBagConstraints();
		gbc_passwordLbl.anchor = GridBagConstraints.EAST;
		gbc_passwordLbl.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLbl.gridx = 0;
		gbc_passwordLbl.gridy = 2;
		contentPane.add(passwordLbl, gbc_passwordLbl);
		
		enterBtn = new JButton("Entrer");
		enterBtn.addActionListener(listener);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		contentPane.add(passwordField, gbc_passwordField);
		GridBagConstraints gbc_enterBtn = new GridBagConstraints();
		gbc_enterBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_enterBtn.insets = new Insets(0, 0, 5, 5);
		gbc_enterBtn.gridx = 1;
		gbc_enterBtn.gridy = 3;
		contentPane.add(enterBtn, gbc_enterBtn);
		
		QuitBtn = new JButton("Quiter");
		QuitBtn.addActionListener(listener);
		GridBagConstraints gbc_QuitBtn = new GridBagConstraints();
		gbc_QuitBtn.insets = new Insets(0, 0, 5, 0);
		gbc_QuitBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_QuitBtn.gridx = 2;
		gbc_QuitBtn.gridy = 3;
		contentPane.add(QuitBtn, gbc_QuitBtn);
		
		errorLbl = new JLabel("");
		GridBagConstraints gbc_errorLbl = new GridBagConstraints();
		gbc_errorLbl.fill = GridBagConstraints.VERTICAL;
		gbc_errorLbl.gridwidth = 3;
		gbc_errorLbl.gridx = 0;
		gbc_errorLbl.gridy = 4;
		contentPane.add(errorLbl, gbc_errorLbl);
		this.setVisible(true);
	}
	
	public String getuser() {
		return this.userText.getText();
	}
	public String getpassword() {
		return this.passwordField.getText();
	}
	public void setErreur(String erreur) {
		this.errorLbl.setText( erreur );
	}

}
