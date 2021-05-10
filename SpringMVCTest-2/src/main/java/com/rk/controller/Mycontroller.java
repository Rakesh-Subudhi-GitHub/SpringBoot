package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

	@GetMapping
	public String welcomeMsg(Model model)
	{
		String Tmsg="This is Rakesh is Talling you  hello world !!!!! ";
		model.addAttribute("msg",Tmsg);
		
		return "welcomeIndex";
	}//method
}//class
