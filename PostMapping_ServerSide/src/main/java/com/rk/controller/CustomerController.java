package com.rk.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.CustomerInfo;

@RestController
public class CustomerController {

	@PostMapping(value = "/addCust",consumes = {"application/xml","application/json"},
			 produces = {"application/xml","application/json"})
	public String addCustomerMethod(@RequestBody CustomerInfo custInfo)
	{
		System.out.println("Customer info is :: in Server end :: "+custInfo);
		
		String Tmsg="Customer added succesfully completed :::: ";
		
		return Tmsg;
	}
}
