
package org.j45.osborn.wagec.server;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class WageCalculatorImplTest {
	
	WageCalculatorImpl wci;
	
	@Before public void init() {
		wci = new WageCalculatorImpl();
	}

    @Test
    public void testSayHi() {
        float netIncome = wci.getNetIncome(10000.0f, "Linear");
        assertEquals(1900.0f, netIncome, 0.1d);
    }
/*
    @Test
    public void testGetTaxpayerByName_success() {
        // WageCalculatorImpl wci = new WageCalculatorImpl();
        Taxpayer tp = wci.getTaxpayerByName("Wladyslaw");
        assertEquals(tp.getIncome(), 4000.0f, 0.1d);
    }
    
    @Test
    public void testGetTaxpayerByName_notfound() {
        // WageCalculatorImpl wci = new WageCalculatorImpl();
        Taxpayer tp = wci.getTaxpayerByName("Grzymislaw");
        assertNull(tp);
    }   
*/     

}
