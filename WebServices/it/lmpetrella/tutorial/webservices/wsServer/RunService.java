package it.lmpetrella.tutorial.webservices.wsServer;

import javax.xml.ws.Endpoint;

public class RunService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SayHello Web Service started.");
		Endpoint.publish("http://localhost:8080/wsServerExample", new SayHello());
		
	}

}
