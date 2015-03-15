/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.j45.osborn.wagec.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.j45.osborn.wagec.server.WageCalculator;

public final class Client {

    private static final QName SERVICE_NAME 
        = new QName("http://org.j45.osborn/", "WageCalculator");
    private static final QName PORT_NAME 
        = new QName("http://org.j45.osborn/", "WageCalculatorPort");

    private Client() {
    }

    public static void main(String args[]) throws Exception {
        Service service = Service.create(SERVICE_NAME);
        // Endpoint Address
        String endpointAddress = "http://localhost:9010/wageCalculator";
        // If web service deployed on Tomcat (either standalone or embedded)
        // as described in sample README, endpoint should be changed to:
        // String endpointAddress = "http://localhost:8080/java_first_jaxws/services/hello_world";

        // Add a port to the Service
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);
        
        WageCalculator wc = service.getPort(WageCalculator.class);
        System.out.println("Net income for 10000: " + wc.getNetIncome(10000.0f, "Linear"));

        System.out.println("Social costs: " + wc.getSocialCosts(true, "2015"));
    }

}
