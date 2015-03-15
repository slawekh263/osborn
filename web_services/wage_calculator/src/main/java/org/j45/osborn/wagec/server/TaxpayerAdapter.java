package org.j45.osborn.wagec.server;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TaxpayerAdapter extends XmlAdapter<TaxpayerImpl, Taxpayer> {
	
    public TaxpayerImpl marshal(Taxpayer t) throws Exception {
        if (t instanceof TaxpayerImpl) {
            return (TaxpayerImpl) t;
        }
        return new TaxpayerImpl(t.getName(), t.getIrs(), t.getIncome());
    }

    public Taxpayer unmarshal(TaxpayerImpl taxpayer) throws Exception {
        return taxpayer;
    }
}
