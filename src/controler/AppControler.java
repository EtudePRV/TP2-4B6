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
	private boolean isOpen;
	public AppControler() {
		
	}
	public Object getObject(String name) {
		return objectHandler.get( name );
	}
	public void start() {
		objectHandler = new ObjectHandler();
		objectHandler.add(this,"Controler");
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
					( (LogOn) objectHandler.get( "LogOn" ) ).setErreur( "Bienvenu!" );
				} else {
					( (LogOn) objectHandler.get( "LogOn" ) ).setErreur( "Le mot de passe est Invalide!" );
				}
			} else {
				( (LogOn) objectHandler.get( "LogOn" ) ).setErreur( "L'utilisateur est Invalide!" );
			}
			database.disconnect();
		} catch ( SQLException se ) {
			System.out.println( "ERREUR: Probleme de log in: " + se );
			database.disconnect();
		}
	}
	public void enter() {
		isOpen = false;
		objectHandler.add( new MenuListener(this), "MenuListner" );
		objectHandler.add( new Menu((MenuListener)objectHandler.get( "MenuListner" )), "Menu" );
		( (LogOn) objectHandler.get( "LogOn" ) ).dispose();
		
	}
	public void disconect() {
		objectHandler.empty();
		objectHandler = null;
		System.gc();
		this.start();
	}
	public void OpenGestionAlbum() {
		
	}
	public void ClosenGestionAlbum() {
		
	}
	public void OpenGestionArtiste() {
		
	}
	public void CloseGestionArtiste() {
		
	}
}
