package hu.codesolution.composite.view;

import javax.swing.JFrame;

import hu.codesolution.composite.controller.CompositeController;

public class CompositeGUI {

	private JFrame window;
	private CompositeController controller;
	
	public CompositeGUI(CompositeController controller) {
		this.controller = controller;
	}
	
	public void startGUI() {
        // A GUI kirajzol�s�ra �s az azon t�rt�n� esem�nyek kezel�s�re a Java egy k�l�n sz�lat haszn�l.
        // Ezen a sz�lon ind�tjuk el a createAndShowGUI() met�dust.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	
	private void createAndShowGUI() {
		String title = "F�k�perny�";
		
		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,600);
        window.setVisible(true);
	}
	
	
}
