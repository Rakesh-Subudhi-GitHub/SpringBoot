package com.rk.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")//this to client use this name its access this method
	//create a MAV method that return mav
	public ModelAndView dispalyMessage() {
		
		//mav obj is return data or logicalview name
		ModelAndView mav=new ModelAndView();
		
		//data
		mav.addObject("msg","Welcome User this is my fast mvc application");//its carry key value pair  key to collect or access the data
		
		//url
		mav.setViewName("index");//this is logicalView name its not end with may be .jsp or .html  
		return mav;
	}//method

}
