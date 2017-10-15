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
		
		JPanel panel = new JPanel(new GridLayout(3,3));
		JLabel label = new JLabel("EL�R�SI �TVONAL");
		
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
