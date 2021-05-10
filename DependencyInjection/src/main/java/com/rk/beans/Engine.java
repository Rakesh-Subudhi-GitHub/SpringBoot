package com.rk.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine Start :: Constructor 0-param ");
	}
	
	public Integer start()
	{
		System.out.println("Engine run");
		return 0;
	}//method
}
