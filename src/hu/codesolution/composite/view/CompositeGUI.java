package hu.codesolution.composite.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
		
		JPanel panel = new JPanel(new GridLayout(3,3));
		JLabel label = new JLabel("ELÉRÉSI ÚTVONAL");
		
		//Set the position of its text, relative to its icon:
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
		
		
		JTextArea text = new JTextArea(10, 20);
		text.setText(controller.getTreeStruct());
		
		panel.add(label);
		panel.add(text);
		
		window.add(panel);
		window.setSize(800,600);
        window.setVisible(true);
	}
	
	
}
