package org.j45.osborn.wagec.server;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(TaxpayerAdapter.class)
public interface Taxpayer {
	String getName();
	String getIrs();
	float getIncome();
}
