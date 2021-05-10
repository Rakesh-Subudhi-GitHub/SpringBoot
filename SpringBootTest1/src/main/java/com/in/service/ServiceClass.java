package com.in.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceClass {

	public ServiceClass() {
		System.out.println("0-param constructor calling ServiceClass another class");
	}
}
