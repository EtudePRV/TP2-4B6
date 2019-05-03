package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import controler.AppControler;

public class MenuListener implements ActionListener, WindowListener {
	private AppControler controleur;

	public MenuListener( AppControler controler ) {
		controleur = controler;
	}

	@Override
	public void actionPerformed( ActionEvent e ) {
		Object trigger = e.getSource();

		if ( trigger.getClass() == JButton.class ) {
			switch ( ( (JButton) trigger ).getText() ) {
			case "Gestion des Album":
				controleur.OpenGestionAlbum();
				break;
			case "Gestion des Artiste":
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
				controleur.ouvrireAide();
				break;
			case "Deconexion":
				controleur.disconect();
				break;
			case "Quiter":
				controleur.exit();
				break;
			case "Gestion des Album":
				controleur.OpenGestionAlbum();
				break;
			case "Gestion des Artiste":
				controleur.OpenGestionArtiste();
				break;
			}
		}

	}

	@Override
	public void windowOpened( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing( WindowEvent e ) {
		controleur.exit();

	}

	@Override
	public void windowClosed( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

}
