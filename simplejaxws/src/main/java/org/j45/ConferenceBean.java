package org.j45;

public class ConferenceBean {
	
	String id;
	String name;
	
	public ConferenceBean(String _id, String _name) {
		this.id = _id;
		this.name = _name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

}
