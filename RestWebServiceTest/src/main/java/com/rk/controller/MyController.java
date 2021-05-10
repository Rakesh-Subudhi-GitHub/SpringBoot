package com.rk.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/welcome")
	public String welcomeMethod()
	{
		String Tmsg="<h1>WELCOME TO MY FAST REST WEbService its rakesh </h1>";
		
		return Tmsg;
	}
	
	@GetMapping("/date")
	public String dateMethod()
	{
		String msg="WELCOME Rakesh Good morning to days date is : "+new Date();
		
		return msg;
	}
	
}
