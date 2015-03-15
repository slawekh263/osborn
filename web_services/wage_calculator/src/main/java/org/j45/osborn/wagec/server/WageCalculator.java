package org.j45.osborn.wagec.server;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface WageCalculator {
	
	float getNetIncome(float base, String taxSystem);
	
	float getSocialCosts(boolean reducedZus, String year);
	
	@XmlJavaTypeAdapter(TaxpayerAdapter.class)
	Taxpayer getTaxpayerByName(String name);
	// Taxpayer getTaxpayerByName(@WebParam(name="taxpayerName") String name);
	
	/*
	@XmlJavaTypeAdapter(WorkerAdapter.class)
	Worker getJohnyWorker();
	*/

}
