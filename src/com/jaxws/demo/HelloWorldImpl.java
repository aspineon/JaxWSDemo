package com.jaxws.demo;

import sun.jvm.hotspot.HelloWorld;

import java.util.Date;

import javax.jws.WebService;

// implemente SEI (service endpoint interface), so clients can call these operation in this web service
@WebService(endpointInterface="com.jaxws.demo.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

	@Override
	public void sayHiDefault() {
		// TODO Auto-generated method stub
		System.out.println("Hi,This is sayHiDefault() Method no arguments");
	}

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		System.out.println("sayHi(String name) Method is called from client: 'name'- " +name);
		return "Hi, " +name;
	}

	@Override
	public int checkTime(Date clientTime) {
		// TODO Auto-generated method stub
		System.out.println("checkTime(Date clientTime) Method is called from client: 'clientTime'- " +clientTime);
		return (int) System.currentTimeMillis();
	}

}
