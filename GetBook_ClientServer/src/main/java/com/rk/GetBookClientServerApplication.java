package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GetBookClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBookClientServerApplication.class, args);
		
		String endPointUrl="http://localhost:8888/book";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> forHeader=rt.getForEntity(endPointUrl,String.class);
		
		if(forHeader.getStatusCodeValue() == 200)
		{
			String body=forHeader.getBody();
			System.out.println("Book details is :: "+body);
		}//if
	}//method

}//class
