package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Outils.Constante;
import Outils.SQL;

public class ModelAlbum implements Constante {

	public static DefaultTableModel getTable( String serche, SQL database ) {
		return database.tableData( SELECT_ALBUMS + "\'%" + serche + "%\'" );
	}

	public static ResultSet getAlbum( String id, SQL database ) {
		return database.select( SELECT_ALBUM + id );
	}

	public static String[] getArtistAlbums( String id, SQL database ) {
		ResultSet table = database.select( SELECT_ALBUMS_ARTIST + id );
		ArrayList<String> list = new ArrayList<String>();
		try {
			while ( table.next() ) {
				list.add( table.getString( 2 ) );
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		String[] listeAlbum = new String[list.size()];
		for ( int i = 0; i < listeAlbum.length; i++ ) {
			listeAlbum[i] = list.get( i );
		}
		return listeAlbum;
	}

	public static boolean existe( String name, SQL database ) {
		boolean result = false;
		ResultSet artiste = database.select( SELECT_ALBUM_NAME + "\'" + name + "\'" );
		try {
			result = artiste.next();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return result;
	}

	public static void ajouter( String[] values, SQL database ) {
		String requete = "";
		if ( values[0].equals( "" ) ) {
			requete = ADD_ALBUM + "(\'" + values[1] + "\',\'" + ModelTableInaccessible.getId( values[2], database )
					+ "\'," + values[3] + ",\'" + values[4] + "\'," + ModelArtiste.getId( values[5], database ) + ")";
		} else {
			requete = UPDATE_ALBUM + " titre =\'" + values[1] + "\', idgenre = "
					+ ModelTableInaccessible.getId( values[2], database ) + ",annee = " + values[3] + ",image = \'"
					+ values[4] + "\', idartise = " + ModelArtiste.getId( values[5], database ) + " Where id = "
					+ values[0];
		}
		database.requests( requete );
	}

	public static void delete( String string, SQL database ) {

		database.requests( DELETE_ALBUM + string );

	}
}
