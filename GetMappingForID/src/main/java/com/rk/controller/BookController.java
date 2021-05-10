package com.rk.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.BookInfo;

@RestController
public class BookController {

//	@GetMapping(value = "/book",produces = {"application/xml","application/json"})
//	public ResponseEntity<BookInfo> BookSearchMethod(@RequestParam("bookid") String bookid)
	
	@GetMapping(value = "/book/{id}",produces = {"application/xml","application/json"})
	public ResponseEntity<BookInfo> BookSearchMethod(@PathVariable("id") String bookid)
	{
		BookInfo book=new BookInfo();
		
		if(bookid.equals("101"))
		{
			book.setBookId("101");
			book.setBookName("Spring");
			book.setAuthor("jana nahi");
			book.setPrice(578.50);
		}
		else {
			book.setBookId("1000");
			book.setBookName("Hibernate");
			book.setAuthor("kia se");
			book.setPrice(952.25);
			
		}
		return new ResponseEntity<BookInfo>(book, HttpStatus.OK);
	}
}
