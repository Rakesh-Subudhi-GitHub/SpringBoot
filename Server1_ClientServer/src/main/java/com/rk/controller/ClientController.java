package com.rk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/client")
public class ClientController {

	@GetMapping(value = "/method")
	public String clientMethod()
	{
		return "ClientController method running:::";
	}
}
