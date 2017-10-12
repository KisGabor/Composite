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
        // A GUI kirajzolására és az azon történõ események kezelésére a Java egy külön szálat használ.
        // Ezen a szálon indítjuk el a createAndShowGUI() metódust.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	
	private void createAndShowGUI() {
		String title = "Fõképernyõ";
		
		window = new JFrame(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,600);
        window.setVisible(true);
	}
	
	
}
