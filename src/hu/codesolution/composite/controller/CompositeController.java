package hu.codesolution.composite.controller;

import hu.codesolution.composite.view.CompositeGUI;

public class CompositeController {

	public void startDesktop() {
		
		CompositeGUI gui = new CompositeGUI(this);
		gui.startGUI();		
		
	}
	
}
