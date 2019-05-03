package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Outils.Constante;
import Outils.SQL;

public class ModelTableInaccessible implements Constante {

	public static String[] getListGenre( SQL database ) {
		ResultSet table = database.select( SELECT_GENRES );
		ArrayList<String> list = new ArrayList<String>();
		try {
			while ( table.next() ) {
				list.add( table.getString( 2 ) );
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		String[] listeArtiste = new String[list.size()];
		for ( int i = 0; i < listeArtiste.length; i++ ) {
			listeArtiste[i] = list.get( i );
		}
		return listeArtiste;
	}

	public static String getId( String name, SQL database ) {
		String id = "null";
		ResultSet tempresult = database.select( SELECT_GENRE_NAME + "\'" + name + "\'" );
		try {
			if ( tempresult.next() ) {
				id = tempresult.getString( 1 );
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return id;
	}

	public static void ajouter( SQL database ) {
		String requete = "INSERT INTO genres ( nom ) VALUES ('Aucun'),('Country'),('Pop'),('EDM'),('House'),('Classic'),('Rock') ";
		database.requests( requete );
	}
}
