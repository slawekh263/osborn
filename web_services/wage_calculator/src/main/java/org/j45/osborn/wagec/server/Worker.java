package org.j45.osborn.wagec.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="worker")
@XmlAccessorType(XmlAccessType.FIELD)
public class Worker {
	
	@XmlElement(required=true) 
	String name;
	@XmlElement(required=true) 
	String location;
	
	public Worker(String _name, String _location) {
		name = _name;
		location = _location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
