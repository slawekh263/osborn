package org.j45.osborn.wagec.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlType(name = "Taxpayer")
@XmlRootElement(name="Taxpayer")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxpayerImpl implements Taxpayer {
	
	@XmlElement(required=true)
    String name;
	@XmlElement(required=true)
    String irs;
	@XmlElement(required=true)
    float income;

	public TaxpayerImpl() {
	}

    public TaxpayerImpl(String _name, String _irs, float _income) {
    	this.name = _name;
    	this.irs = _irs;
    	this.income = _income;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIrs() {
		return irs;
	}

	public void setIrs(String irs) {
		this.irs = irs;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

}
