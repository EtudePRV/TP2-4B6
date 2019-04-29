package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
	
	public void requests(String select) {

		try {
			Statement statement = connexion.createStatement();
			statement.execute(select);
			connexion.commit();
		} catch(SQLException se) {
			System.out.println("ERREUR: Probleme de Requete: " + se);
		}

		
	}
	
	public ResultSet select(String select) {
		ResultSet result = null;
		try {
			Statement statement = connexion.createStatement();
			result = (statement.executeQuery(select));
		} catch(SQLException se) {
			System.out.println("ERREUR: Probleme de select: " + se);
		}
		
		return result;
	}

	public DefaultTableModel tableData( String select ) {
		ResultSet data = this.select( select );
		DefaultTableModel table = new DefaultTableModel();;
		if ( data != null ) {
			try {
				ResultSetMetaData structure = data.getMetaData();
				int columns = structure.getColumnCount();
				Object[] columnID = new String[columns];
				for ( int i = 0; i < columns; i++ ) {
					table.addColumn( structure.getColumnName( i+1 ) );
					columnID[i] = structure.getColumnName( i+1); 
				}
				table.setColumnIdentifiers( columnID );
				while ( data.next() ) {
					String[] row = new String[columns];
					for ( int i = 0; i < columns; i++ ) {
						row[i] = data.getString( i+1 );
					}
					table.addRow( row );
				}

			} catch ( Exception e ) {
				System.out.println( "Error SQL:tableDada: " + e );
			}

		}

		return table;
	}
	
	public void printTable( String select ) {
		try {
			ResultSet table = select( select );
			if ( table != null ) {
				ResultSetMetaData structure = table.getMetaData();
				int nbColonnes = structure.getColumnCount();
				System.out.println();
				System.out.print( "|" );

				for ( int i = 1; i <= nbColonnes; i++ ) {
					System.out.print( structure.getColumnName( i ) + "\t|" );
				}
				System.out.println();
				System.out.print( "|" );
				while ( table.next() ) {
					for ( int i = 1; i <= nbColonnes; i++ ) {

						System.out.print( table.getString( i ) + "\t|" ); 

					}
					System.out.println();
				}
			}

		} catch ( SQLException se ) {
			System.out.println( "ERREUR: Probleme d'impresion: " + se );
		}

	}

}
