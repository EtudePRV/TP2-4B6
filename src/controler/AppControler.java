package controler;

import java.sql.ResultSet;
import java.sql.SQLException;

import Outils.*;
import dataBase.SQL;
import listeners.*;
import view.*;

public class AppControler implements Constante {
	
	private ObjectHandler objectHandler;
	private SQL database;
	
	public AppControler() {
		objectHandler = new ObjectHandler();
		objectHandler.add(this,"Controler");
	}
	public Object getObject(String name) {
		return objectHandler.get( name );
	}
	public void start() {
		database = new SQL(CONNECTIONSTRING);
		objectHandler.add( new LogOnListener(this),"LogOnListener");
		objectHandler.add( new LogOn((LogOnListener)objectHandler.get( "LogOnListener" )), "LogOn" );
	}
	public void exit() {
		System.exit( 0 );
	}

	public void logIn() {
		String username = ( (LogOn) objectHandler.get( "LogOn" ) ).getuser();
		String password = ( (LogOn) objectHandler.get( "LogOn" ) ).getpassword();
		try {
			database.connect();
			ResultSet user = database.select( SELECT_USER + "\'" + username + "\'" );
			if ( user.next() ) {
				if ( user.getString( 3 ).equals( password ) ) {
					this.enter();
					System.out.println( "Match" );
				} else {
					( (LogOn) objectHandler.get( "LogOn" ) ).setErreur( "Le mot de passe est Invalide" );
				}
			} else {
				( (LogOn) objectHandler.get( "LogOn" ) ).setErreur( "L'utilisateur n'existe pas!" );
			}
			database.disconnect();
		} catch ( SQLException se ) {
			System.out.println( "ERREUR: Probleme de log in: " + se );
			database.disconnect();
		}
	}
	public void enter() {
		objectHandler.add( new Menu(), "Menu" );
		( (LogOn) objectHandler.get( "LogOn" ) ).dispose();
		
	}
}
