package hu.codesolution.composite.model;

public class File implements Resource {

	private String name;
	private int size;
	
	public File(String name, int size) {
		
		super();
		this.name = name;
		this.size = size;
		
	}
	
	
	@Override
	public String getName() {		
		return this.name;
	}

	@Override
	public int getSize() {		
		return this.size;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
