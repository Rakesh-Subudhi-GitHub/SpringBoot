package com.rk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ServerApp")
public class ServerController {

	@GetMapping(value = "/m1")
	public String method1()
	{
		String msg="RestController calling server Controller run method-1 running:::";
		
		return msg;
	}
	
	@GetMapping(value = "/m2")
	public String method2()
	{
		String msg="RestController calling server Controller run method-2 running:::";
		
		return msg;
	}
	
	@GetMapping(value = "/m3")
	public String method3()
	{
		String msg="RestController calling server Controller run method-3 running:::";
		
		return msg;
	}
}
