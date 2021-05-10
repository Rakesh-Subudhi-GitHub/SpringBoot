package com.rk.service;

import org.springframework.stereotype.Service;


public class ServiceClassImpl implements ServiceClass {

	public ServiceClassImpl()
	{
		System.out.println("Service class run");
	}

	@Override
	public void test() {
		System.out.println("method call in service class");
		
	}
}
