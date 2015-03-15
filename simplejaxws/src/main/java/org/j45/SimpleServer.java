package org.j45;

import javax.xml.ws.Endpoint;

public class SimpleServer {

    protected SimpleServer() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting Server");
        ConferenceManagerImpl implementor = new ConferenceManagerImpl();
        String address = "http://localhost:9000/conference_manager";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String args[]) throws Exception {
        new SimpleServer();
        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }

}

