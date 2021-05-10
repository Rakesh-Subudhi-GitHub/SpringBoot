package com.rk.convert;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rk.helper.Customer;

public class Marshalling {

	public static void main(String[] args) throws Exception {
		
		Customer cust=new Customer();
		
		//store the obj value
		cust.setCustId(100);
		cust.setCustNamme("rakesh");
		cust.setCustEmail("rakesh.subudhi30@gmail.com");
		
		//Marshalling java-->xml (converstion)
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		
		Marshaller marshal=context.createMarshaller();
		
		marshal.marshal(cust, System.out);
	}//main
}//class
