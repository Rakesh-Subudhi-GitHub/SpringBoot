package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rk.helper.Book;

@SpringBootApplication
public class GetBookClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBookClientServerApplication.class, args);
		
		String endPointUrl="http://localhost:8888/book";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Book> forHeader=rt.getForEntity(endPointUrl,Book.class);
		
		if(forHeader.getStatusCodeValue() == 200)
		{
			Book body=forHeader.getBody();
			
			System.out.println("Book details is :: "+body);
			
			System.out.println("book id is :: "+body.getBookId());
			System.out.println("book name is :: "+body.getBookName());
			System.out.println("book price is :: "+body.getBookPrice());
		}//if
	}//method

}//class
