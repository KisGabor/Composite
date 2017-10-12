package hu.codesolution.composite.model;

import java.util.ArrayList;
import java.util.List;


public class Folder implements Resource {

	private String name;
	private List<Resource> resources = new ArrayList<>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void addResources(Resource res) {
		this.resources.add(res);
	}
	
	public List<Resource> getResources(){
		return this.resources;	
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for(Resource res : this.resources) {
			size += res.getSize();
		}
		return size;
	}
	
	@Override
	public String toString() {
		return this.name + "/";	
	}

}
