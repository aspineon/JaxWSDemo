package com.jaxws.demo;

import sun.jvm.hotspot.HelloWorld;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloWorldClient {
	
	private final static QName SERVICE_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplService");
	private final static QName PORT_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplPort");
	private final static String ADDRESS="http://localhost:8080/demo?wsdl";
	
	public static void main(String[] args) throws MalformedURLException {
		// find a web service by providing an WSDL of a Web service
		Service service = Service.create(new URL(ADDRESS),SERVICE_NAME);
        IHelloWorld hw = service.getPort(IHelloWorld.class);

        // call service operation
		String str = hw.sayHi("Hello");
        System.out.println(str);

        // call service operation
        int date = hw.checkTime(new Date());
        System.out.println(date);

	}

}
