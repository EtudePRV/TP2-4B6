package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import Outils.*;

public class ModelArtiste implements Constante{
	
	public static DefaultTableModel getTable(String serche,SQL database) {
		return database.tableData( SELECT_ARTISTES + "\'%" + serche + "%\'");
	}
	public static ResultSet getArtiste(String id, SQL database) {
		return database.select( SELECT_ARTISTE + id );
	}
	public static boolean existe(String name, SQL database) {
		boolean result = false;
		ResultSet artiste = database.select(SELECT_ARTISTE_NAME + "\'"+name+"\'");
		try {
			result = artiste.next();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
		
		return result;
	}
	public static void ajouter(String[] values,SQL database) {
		String requete = "";
		if ( values[0].equals( "" ) ) {
			requete = ADD_ARTISTE + "(\'" + values[1] + "\'," + values[2] + ",\'" + values[3] + "\')";
		} else {
			requete = UPDATE_ARTISTE +" nom =\'"+values[1]+"\', membre = " + values[2] + ",photo = \'"+ values[3]+"\' Where id = " + values[0];
		}
		database.requests( requete );
	}
	public static void delete( String string, SQL database ) {

		database.requests( DELETE_ARTISTE + string );
		
	}
}
