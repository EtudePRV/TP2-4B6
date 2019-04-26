package Outils;

import java.util.ArrayList;

public class ObjectHandler {

	ArrayList<Object> objectList;
	ArrayList<String> nameList;

	public ObjectHandler() {
		objectList = new ArrayList<Object>();
		nameList = new ArrayList<String>();
	}

	public void add( Object object, String name ) {
		objectList.add( object );
		nameList.add( name );
	}

	public Object get( String name ) {
		return objectList.get( nameList.indexOf( name ) );
	}

	public Object find( Object object ) {
		int index = objectList.indexOf( object );
		Object tempObject;

		if ( index >= 0 ) {
			tempObject = objectList.get( index );
			System.out.println( "ObjectHandler: Object Found" );
		} else {
			tempObject = null;
			System.out.println( "ObjectHandler: Object Not found");
		}

		return tempObject;

	}
	public String getName(Object object) {
		int index = objectList.indexOf( object );
		String tempString;
		if ( index >= 0 ) {
			tempString = nameList.get( index );
			System.out.println( "ObjectHandler: Object Name Found" );
		} else {
			tempString = "NA";
			System.out.println( "ObjectHandler: Object Name Not found");
		}
		
		return tempString;
		
	}
}
