package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
	
	private Connection connexion;
	private String connectionString;
	
	public SQL(String chaineConnection) {
		this.connectionString = chaineConnection;
	}
	
	public void connect() {
		try {
			Class.forName( "org.sqlite.JDBC" );
			System.out.println( "Pilote Charger" );
			connexion = DriverManager.getConnection( connectionString );
			System.out.println( "Connexion Etablie" );
			connexion.setAutoCommit( false );
		} catch ( ClassNotFoundException cnfe ) {
			System.out.println( "ERREUR : Driver manquant" );
			disconnect();
		} catch ( SQLException se ) {
			System.out.println( "ERREUR : La base de donnees  manquante: " + se );
			disconnect();
		}

	}
	
	public void disconnect() {
		try { 
				if (connexion != null) {
					connexion.close();
					System.out.println( "Connexion Fermer" );
				}
			} catch (SQLException se) {
				System.out.println("ERREUR : impossible de fermer la connexion: " + se);
			}
	}
	
	public void requests(String[] request) {
		try {
			Statement InstructionSet = connexion.createStatement();
			for(String instruction:request){
				InstructionSet.addBatch(instruction);
			}
			InstructionSet.executeBatch();
			connexion.commit();
		} catch(SQLException se) {
			System.out.println("ERREUR: Probleme de Requete: " + se);
		}
		
	}
	
	public ResultSet select(String select) {
		ResultSet result = null;
		try {
			Statement statement = connexion.createStatement();
			result = statement.executeQuery(select);
		} catch(SQLException se) {
			System.out.println("ERREUR: Probleme de select: " + se);
		}
		
		return result;
	}
	
	public void printTable(String select) {
		try {
			ResultSet table = select(select);
			ResultSetMetaData structure = table.getMetaData();
			int nbColonnes = structure.getColumnCount();
			System.out.println();
			System.out.print("|");
			
			for(int i = 1; i <=nbColonnes; i++) {
				System.out.print( structure.getColumnName( i ) + "\t|" );
			}
			System.out.println();
			System.out.print("|");
			while(table.next()) {
				for(int i = 1 ; i <= nbColonnes; i++){

				      System.out.print(table.getString(i) + "\t|"); //Print one element of a row

				}
				System.out.println();
			}
		} catch(SQLException se) {
			System.out.println("ERREUR: Probleme d'impresion: " + se);
		}
		
	}

}
