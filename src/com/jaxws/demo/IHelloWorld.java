package com.jaxws.demo;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// specify this calss as a WebService
@WebService
//@SOAPBinding(style=Style.RPC)
public interface IHelloWorld {
	// WebService Operation
	@WebMethod(exclude=true)  //exclude ->true, so that wsdl will not show this method
	void sayHiDefault();
	
	@WebMethod
	String sayHi(@WebParam(name="name")String name);
	
	@WebMethod
	@WebResult(name="tagname") // set the tag name of returned SOAPMessage
	int checkTime(@WebParam(name="clientTime") Date clientTime);

}
