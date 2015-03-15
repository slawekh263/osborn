
package org.j45.osborn.wagec.server;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "org.j45.osborn.wagec.server.WageCalculator",
            serviceName = "WageCalculator")
public class WageCalculatorImpl implements WageCalculator {

	float linearTaxRate = 0.19f;
	
	static List<Taxpayer> taxpayers = new LinkedList<Taxpayer>();
	
	static {
		Taxpayer tp1 = new TaxpayerImpl("Wladyslaw", "Urzad Podatkowy Krakow Podgorze", 4000.0f);
		Taxpayer tp2 = new TaxpayerImpl("Bronislaw", "Urzad Podatkowy Krakow Nowa Huta", 5000.0f);
		taxpayers.add(tp1);
		taxpayers.add(tp2);
	}

	public float getNetIncome(float base, String taxSystem) {
		if(taxSystem.equals("Linear")) {
			return base * linearTaxRate;
		}
		return -1.0f;
	}
	
	public float getSocialCosts(boolean reducedZus, String year) {
		if(year.equals("2015")) {
			if(reducedZus) {
				return 446.88f;
			} else {
				return 1095.37f;
			}
		}
		return -1.0f;
	}

	public Taxpayer getTaxpayerByName(String name) {
		System.out.println("Searching for taxpayer: " + name);
		Taxpayer current = null;
		Taxpayer matching = null;
		
		Iterator<Taxpayer> it = taxpayers.iterator();
		while(it.hasNext()) {
			current = it.next();
			System.out.println("examining taxpayer: " + current.getName());
			if(current.getName().equals(name)) {
				matching = current;
				break;
			}
		}
		return matching;
	}
	
	/*
	
	public Worker getJohnyWorker() {
		return new Worker("Johny", "Arkansas");
	}
	
	*/

}
