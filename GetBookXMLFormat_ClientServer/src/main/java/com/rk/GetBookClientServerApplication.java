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
		
		String endPointUrl="http://localhost:8888/book";
		
		RestTemplate rt=new RestTemplate();
		
		//set Accpet bcz that to change the json to xml format so
		HttpHeaders header=new HttpHeaders();
		header.set("Accept", "application/xml");
		
		HttpEntity<String> reqEntity=new HttpEntity(header);//convert
		
		//exchange json to xml
		ResponseEntity<String> exchange=rt.exchange(endPointUrl,HttpMethod.GET,reqEntity,String.class);
		
		System.out.println(exchange.getBody());
	}//method

}//class
