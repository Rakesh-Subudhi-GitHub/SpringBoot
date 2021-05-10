package com.rk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.Book;

@RestController
public class MyController {

	@GetMapping("/welcome")
	public String welcomeMethod()
	{
	return "WELCOME RAKESH";	
	}
	
	@GetMapping(value = "/book",produces = {"application/json","application/xml"})
	public Book getBookMethod()
	{
		Book book=new Book();
		
		book.setBookId(10);
		book.setBookName("Spring");
		book.setBookPrice(9999.9f);
		
		return book;
	}//method
}
