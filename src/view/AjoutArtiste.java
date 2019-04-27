package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class AjoutArtiste extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public AjoutArtiste() {
		setResizable(false);
		setBounds( 100, 100, 450, 229 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 27, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Ajout de Artiste");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblId = new JLabel("#");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		contentPane.add(lblId, gbc_lblId);
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 1;
		contentPane.add(spinner, gbc_spinner);
		
		JLabel lblNom = new JLabel("Nom");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 2;
		contentPane.add(lblNom, gbc_lblNom);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblMembre = new JLabel("Membre");
		GridBagConstraints gbc_lblMembre = new GridBagConstraints();
		gbc_lblMembre.anchor = GridBagConstraints.EAST;
		gbc_lblMembre.insets = new Insets(0, 0, 5, 5);
		gbc_lblMembre.gridx = 0;
		gbc_lblMembre.gridy = 3;
		contentPane.add(lblMembre, gbc_lblMembre);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 3;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JButton btnImg = new JButton("Img");
		GridBagConstraints gbc_btnImg = new GridBagConstraints();
		gbc_btnImg.anchor = GridBagConstraints.EAST;
		gbc_btnImg.insets = new Insets(0, 0, 5, 5);
		gbc_btnImg.gridx = 0;
		gbc_btnImg.gridy = 4;
		contentPane.add(btnImg, gbc_btnImg);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblErreur = new JLabel("");
		GridBagConstraints gbc_lblErreur = new GridBagConstraints();
		gbc_lblErreur.gridwidth = 2;
		gbc_lblErreur.insets = new Insets(0, 0, 5, 5);
		gbc_lblErreur.gridx = 0;
		gbc_lblErreur.gridy = 5;
		contentPane.add(lblErreur, gbc_lblErreur);
		
		JButton btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAjouter.insets = new Insets(0, 0, 0, 5);
		gbc_btnAjouter.gridx = 0;
		gbc_btnAjouter.gridy = 6;
		contentPane.add(btnAjouter, gbc_btnAjouter);
		
		JButton btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 6;
		contentPane.add(btnAnnuler, gbc_btnAnnuler);
	}

}
