package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rk.helper.Book;

@SpringBootApplication
public class GetBookClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBookClientServerApplication.class, args);
		
		String endPointUrl="http://localhost:8888/book/{rid}";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Book> forEntity = rt.getForEntity(endPointUrl, Book.class, "101");
		
		System.out.println(forEntity.getBody());
		
	}//method

}//class
