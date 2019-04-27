package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import controler.AppControler;

public class LogOnListener implements ActionListener {
	private AppControler controleur;

	public LogOnListener( AppControler controler ) {
		controleur = controler;
	}

	@Override
	public void actionPerformed( ActionEvent e ) {
		Object trigger = e.getSource();

		if ( trigger.getClass() == JButton.class ) {
			switch ( ( (JButton) trigger ).getText() ) {
			case "Entrer":
				controleur.logIn();
				break;
			case "Quiter":
				controleur.exit();
				break;
			}
		}

	}

}
