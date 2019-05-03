package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Outils.*;

public class ModelArtiste implements Constante {

	public static DefaultTableModel getTable( String serche, SQL database ) {
		return database.tableData( SELECT_ARTISTES + "\'%" + serche + "%\'" );
	}

	public static ResultSet getArtiste( String id, SQL database ) {
		return database.select( SELECT_ARTISTE + id );
	}

	public static boolean existe( String name, SQL database ) {
		boolean result = false;
		ResultSet artiste = database.select( SELECT_ARTISTE_NAME + "\'" + name + "\'" );
		try {
			result = artiste.next();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return result;
	}

	public static String getId( String name, SQL database ) {
		String id = "null";
		;
		ResultSet tempresult = database.select( SELECT_ARTISTE_NAME + "\'" + name + "\'" );
		try {
			if ( tempresult.next() ) {
				id = tempresult.getString( 1 );
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}

		return id;
	}

	public static String[] getListArtiste( SQL database ) {
		ResultSet table = database.select( SELECT_ARTISTES + "\'%%\'" );
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

	public static void ajouter( String[] values, SQL database ) {
		String requete = "";
		if ( values[0].equals( "" ) ) {
			requete = ADD_ARTISTE + "(\'" + values[1] + "\'," + values[2] + ",\'" + values[3] + "\')";
		} else {
			requete = UPDATE_ARTISTE + " nom =\'" + values[1] + "\', membre = " + values[2] + ",photo = \'" + values[3]
					+ "\' Where id = " + values[0];
		}
		database.requests( requete );
	}

	public static void delete( String string, SQL database ) {

		database.requests( DELETE_ARTISTE + string );

	}
}
