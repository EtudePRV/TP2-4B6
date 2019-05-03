package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JTable;
import controler.AlbumControler;

public class AlbumListener implements ActionListener, MouseListener, WindowListener {
	private AlbumControler controleur;

	public AlbumListener( AlbumControler controler ) {
		controleur = controler;
	}

	@Override
	public void actionPerformed( ActionEvent e ) {
		Object trigger = e.getSource();

		if ( trigger.getClass() == JButton.class ) {
			switch ( ( (JButton) trigger ).getText() ) {
			case "Rechercher":
				controleur.rechercher();
				break;
			case "Nouveau":
				controleur.nouveau();
				break;
			case "Modifier":
				controleur.modifier();
				break;
			case "Supprimer":
				controleur.supprimer();
				break;
			case "Annuler":
				controleur.annuler();
				break;
			case "Ajouter":
				controleur.ajouter();
				break;
			case "Remplacer":
				controleur.remplacer();
				break;
			}
		}

	}

	@Override
	public void mouseClicked( MouseEvent e ) {
		JTable trigger = (JTable) e.getSource();
		if ( trigger.getSelectedRow() >= 0 ) {
			controleur.select( trigger.getModel().getValueAt( trigger.getSelectedRow(), 0 ).toString() );
		}

	}

	@Override
	public void mousePressed( MouseEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased( MouseEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered( MouseEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited( MouseEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened( WindowEvent e ) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing( WindowEvent e ) {
		controleur.closing();

	}

	@Override
	public void windowClosed( WindowEvent e ) {

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
