package com.jaxws.demo;

import javax.xml.ws.Endpoint;

public class ServerRunner {
	public static void main(String[] args)
	{
		// publish a instance of WebService by specifying a identical URL
		// and generate a WSDL document which shows all methods in this WebService
		Endpoint.publish("http://localhost:8080/demo", new HelloWorldImpl());

		System.out.println("public a Web server successfully, waiting for client...");
	}
}
