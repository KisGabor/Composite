package hu.codesolution.composite.controller;

import hu.codesolution.composite.view.CompositeGUI;

public class CompositeController {
	
	private String treeStruct;
	
	public CompositeController(String str) {
		treeStruct = str;
	}
	
	public String getTreeStruct() {
		return treeStruct;
	}

	public void startDesktop() {
		
		CompositeGUI gui = new CompositeGUI(this);
		gui.startGUI();		
		
	}
	
}
