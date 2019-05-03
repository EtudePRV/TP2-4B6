package controler;

import view.GestionArtiste;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Outils.*;
import listeners.ArtisteListener;
import model.ModelAlbum;
import model.ModelArtiste;

public class ArtistControler implements Constante {
	private GestionArtiste view;
	private SQL database;
	private AppControler controler;

	public ArtistControler( SQL bd,AppControler controleur ) {
		database = bd;
		controler = controleur;
		view = new GestionArtiste(new ArtisteListener(this));
		this.rechercher();
	}

	public void rechercher() {
		view.disableModification();
		this.updateTable();
	}

	public void nouveau() {
		view.enableModification();
		view.clearValues();
	}

	public void modifier() {
		view.enableModification();
	}

	public void supprimer() {
		String[] values = view.getValues();
		if(values[0].equals( "" )) {
			this.nouveau();
			view.disableModification();
		}else {
			view.disableModification();
			int dialogResult = 0;
			dialogResult = JOptionPane.showConfirmDialog ( view, "Vouler Vous Vraiment Effacer l'artiste #"+values[0],"Attention", dialogResult);
			if(dialogResult == JOptionPane.YES_OPTION){
				ModelArtiste.delete( values[0],database );
				this.updateTable();
			}
		}
	}

	public void ajouter() {
		
		String[] values = view.getValues();
		boolean valide = false;
		if(values[0].equals("") && !ModelArtiste.existe( values[1], database )) {
			valide = true;
		} else if(!values[0].equals("")) {
			valide = true;
		}
		
		if(valide) {
			ModelArtiste.ajouter(values,database);
			this.updateTable();
			view.disableModification();
		} else {
			view.setError( "Un artiste a deja ce nom!" );
		}
		
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
		    File FileOut = new File( System.getProperty( "user.dir" )+"/DB/img/artiste/"+fileIn.getName()); 
		    try {
				Files.copy( fileIn.toPath(), FileOut.toPath() );
				view.setImg( System.getProperty( "user.dir" )+"/DB/img/artiste/"+fileIn.getName() );
			} catch ( IOException e ) {
				System.out.println( "Erreur:ArtisteControler:Remplacer:"+e );
			}
		} 
	}

	public void updateTable() {
		view.setTable( ModelArtiste.getTable(view.getRecherche(),database) );
	}

	public void select( String id ) {
		if ( Integer.parseInt( id ) >= 0 ) {
			ResultSet data = ModelArtiste.getArtiste( id,database );
			try {
				data.next();
				view.setValues( data.getString( 1 ), data.getString( 2 ), data.getBoolean( 3 ), data.getString( 4 ) );
				view.setList( ModelAlbum.getArtistAlbums( id, database ) );
			} catch ( SQLException e ) {
				System.out.println( "Erreur:ArtisteControler:Select:" + e );
			}

		}
	}
	public void closing() {
		controler.CloseGestionArtiste();
	}

}
