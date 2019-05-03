package controler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Outils.Constante;
import Outils.SQL;
import listeners.AlbumListener;
import model.ModelAlbum;
import model.ModelArtiste;
import model.ModelTableInaccessible;
import view.GestionAlbum;

public class AlbumControler implements Constante {
	private GestionAlbum view;
	private SQL database;
	private AppControler controler;

	public AlbumControler( SQL bd, AppControler controleur ) {
		database = bd;
		controler = controleur;
		view = new GestionAlbum( new AlbumListener( this ) );
		this.rechercher();
		view.setList( ModelArtiste.getListArtiste( database ),ModelTableInaccessible.getListGenre( database ) );
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
		if ( values[0].equals( "" ) ) {
			this.nouveau();
			view.disableModification();
		} else {
			view.disableModification();
			int dialogResult = 0;
			dialogResult = JOptionPane.showConfirmDialog( view, "Vouler Vous Vraiment Effacer l'Album #" + values[0],
					"Attention", dialogResult );
			if ( dialogResult == JOptionPane.YES_OPTION ) {
				ModelAlbum.delete( values[0], database );
				this.updateTable();
			}
		}
	}

	public void ajouter() {

		String[] values = view.getValues();
		boolean valide = false;
		if(values[0].equals("") && !ModelAlbum.existe( values[1], database )) {
			valide = true;
		} else if(!values[0].equals("")) {
			valide = true;
		}
		
		if ( valide ) {
			ModelAlbum.ajouter( values, database );
			this.updateTable();
			view.disableModification();
		} else {
			view.setError( "Un Album a deja ce nom!" );
		}

	}

	public void annuler() {
		view.disableModification();
	}

	public void remplacer() {
		JFileChooser chooser = new JFileChooser();
		int value = chooser.showOpenDialog( view );

		File fileIn = null;
		if ( value == JFileChooser.APPROVE_OPTION ) {
			fileIn = chooser.getSelectedFile();
			File FileOut = new File( System.getProperty( "user.dir" ) + "/DB/img/album/" + fileIn.getName() );
			try {
				Files.copy( fileIn.toPath(), FileOut.toPath() );
				view.setImg( System.getProperty( "user.dir" ) + "/DB/img/album/" + fileIn.getName() );
			} catch ( IOException e ) {
				System.out.println( "Erreur:AlbumControler:Remplacer:" + e );
			}
		}
	}

	public void updateTable() {
		view.setTable( ModelAlbum.getTable( view.getRecherche(), database ) );
	}

	public void select( String id ) {
		if ( Integer.parseInt( id ) >= 0 ) {
			ResultSet data = ModelAlbum.getAlbum( id, database );
			try {
				data.next();
				view.setValues( data.getString( 1 ), data.getString( 2 ),  data.getString( 3 ), data.getInt( 4 ),data.getString( 5 ),data.getString( 6 ));
			} catch ( SQLException e ) {
				System.out.println( "Erreur:AlbumControler:Select:" + e );
			}

		}
	}

	public void closing() {
		controler.ClosenGestionAlbum();
	}

}
