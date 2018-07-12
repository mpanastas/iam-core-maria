package fr.epita.iam.launcher;

import java.awt.EventQueue;

import fr.epita.iam.views.MainFrame;
import fr.epita.iam.utils.logger.Logger;

/**
 * <h3>Description</h3>
 * <p> Main class of the project, it calls the methods and 
 * functions of the project application </p>
 * 
 * @date 6/18
 * @author Maria Anastas
 *
 */
public class Main {

	private static final Logger LOGGER = new Logger(Main.class);
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = MainFrame.getMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					LOGGER.error("there was an error on the application");
				}
			}
		});


	}

}
