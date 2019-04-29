package controler;

import dataBase.SQL;
import view.GestionArtiste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import Outils.Constante;

public class ArtistControler implements Constante {
	GestionArtiste view;
	SQL database;
	AppControler controler;

	public ArtistControler( SQL bd,AppControler controleur ) {
		database = bd;
		controler = controleur;
	}

	public void setView( GestionArtiste vue ) {
		view = vue;
	}

	public void rechercher() {
		view.disableModification();
		this.updateTable();
	}

	public void nouveau() {
		view.enableModification();
		view.setValues( "", "", false, "base.png" );
	}

	public void modifier() {
		view.enableModification();
	}

	public void supprimer() {
		String[] values = view.getValues();
		String requeste = DELETE_ARTISTE + values[0];
		if(values[0].equals( "" )) {
			this.nouveau();
			view.disableModification();
		}else {
			view.disableModification();
			int dialogResult = 0;
			dialogResult = JOptionPane.showConfirmDialog ( view, "Vouler Vous Vraiment Effacer l'artiste #"+values[0],"Attention", dialogResult);
			if(dialogResult == JOptionPane.YES_OPTION){
				database.requests( requeste );
				this.updateTable();
			}
		}
	}

	public void ajouter() {

		String[] values = view.getValues();
		String requeste = "";
		if ( values[0].equals( "" ) ) {
			requeste = ADD_ARTISTE + "(\'" + values[1] + "\'," + values[2] + ",\'" + values[3] + "\')";
		} else {
			requeste = UPDATE_ARTISTE +" nom =\'"+values[1]+"\', membre = " + values[2] + ",photo = \'"+ values[3]+"\' Where id = " + values[0];
		}
		database.requests( requeste );
		this.updateTable();
		view.disableModification();
	}

	public void annuler() {
		view.disableModification();
	}

	public void remplacer() {
		JFileChooser chooser = new JFileChooser();
		int value = chooser.showOpenDialog(view);

		File fileIn = null;
		if (value == JFileChooser.APPROVE_OPTION) {
		    fileIn = chooser.getSelectedFile();
		    File FileOut = new File( System.getProperty( "user.dir" )+"/DB/img/"+fileIn.getName()); 
		    try {
				Files.copy( fileIn.toPath(), FileOut.toPath() );
			} catch ( IOException e ) {
				System.out.println( "Erreur:ArtisteControler:Remplacer:"+e );
			}
		} 
	}

	public void updateTable() {
		view.setTable( database.tableData( SELECT_ARTISTES + "\'%" + view.getRecherche() + "%\'" ) );
	}

	public void select( String id ) {
		if ( Integer.parseInt( id ) >= 0 ) {
			ResultSet data = database.select( SELECT_ARTISTE + id );
			try {
				data.next();
				view.setValues( data.getString( 1 ), data.getString( 2 ), data.getBoolean( 3 ), data.getString( 4 ) );
			} catch ( SQLException e ) {
				e.printStackTrace();
			}

		}
	}
	public void closing() {
		controler.CloseGestionArtiste();
	}

}
