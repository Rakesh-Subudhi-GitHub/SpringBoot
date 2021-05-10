package com.rk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car()
	{
		System.out.println("Car - 0 param constructor calling");
	}
	
	@Autowired
	private Engine engine;
	
	@Autowired
	public Car(Engine engine)
	{
		this.engine=engine;
		System.out.println("Car 1param constructor calling");
	}


    @Autowired	
	public void setEngine(Engine engine) {
	
		this.engine = engine;
		System.out.println("setter engine called");
    }


	public void drive()
	{
		engine.start();
		System.out.println("car drive");
	}
	
}//class
