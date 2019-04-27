package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import controler.AppControler;

public class MenuListener implements ActionListener {
	private AppControler controleur;

	public MenuListener( AppControler controler ) {
		controleur = controler;
	}

	@Override
	public void actionPerformed( ActionEvent e ) {
		Object trigger = e.getSource();

		if ( trigger.getClass() == JButton.class ) {
			switch ( ( (JButton) trigger ).getText() ) {
			case "Gestion Album":
				controleur.OpenGestionAlbum();
				break;
			case "Gestion Artiste":
				controleur.OpenGestionArtiste();
				break;
			case "Deconexion":
				controleur.disconect();
				break;
			case "Quiter":
				controleur.exit();
				break;
			}
		} else if ( trigger.getClass() == JMenuItem.class ) {
			switch ( ( (JMenuItem) trigger ).getText() ) {
			
			case "Aide":
				break;
			case "Deconexion":
				controleur.disconect();
				break;
			case "Quiter":
				controleur.exit();
				break;
			case "Gestion Album":
				controleur.OpenGestionAlbum();
				break;
			case "Gestion Artiste":
				controleur.OpenGestionArtiste();
				break;
			}
		}

	}

}
