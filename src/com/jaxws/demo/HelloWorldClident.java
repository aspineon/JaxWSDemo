package com.jaxws.demo;

import sun.jvm.hotspot.HelloWorld;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class HelloWorldClident {
	
	private final static QName SERVICE_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplService");
	private final static QName PORT_NAME=new QName("http://demo.jaxws.com/", "HelloWorldImplPort");
	private final static String ADDRESS="http://localhost:8080/demo?wsdl";
	
	//此方法可以在本地测试此WebService是否正确
	
	public static void main(String[] args) throws MalformedURLException {
		Service service = Service.create(new URL(ADDRESS),SERVICE_NAME);

		// find a web service by providing an identical URL of a Web service
        IHelloWorld hw = service.getPort(IHelloWorld.class);

        // call service operation
		String str = hw.sayHi("Hello");
        System.out.println(str);

        // call service operation
        int date = hw.checkTime(new Date());
        System.out.println(date);

//		System.out.println("test");
	}

}
