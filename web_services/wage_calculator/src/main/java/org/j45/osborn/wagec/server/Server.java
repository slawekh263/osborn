
package org.j45.osborn.wagec.server;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

public class Server {

    protected Server() throws Exception {
        System.out.println("Starting Server");
        WageCalculatorImpl implementor = new WageCalculatorImpl();
        String address = "http://localhost:9010/wageCalculator";
        EndpointImpl ep = (EndpointImpl) Endpoint.publish(address, implementor);
        
        LoggingInInterceptor liInterceptor = new LoggingInInterceptor();
        liInterceptor.setPrettyLogging(true);
        ep.getServer().getEndpoint().getInInterceptors().add(liInterceptor);
        LoggingOutInterceptor loInterceptor = new LoggingOutInterceptor();
        loInterceptor.setPrettyLogging(true);
        ep.getServer().getEndpoint().getOutInterceptors().add(loInterceptor);
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");
    }
}
