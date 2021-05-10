package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Server1ClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Server1ClientServerApplication.class, args);
		
		RestTemplate rt=new RestTemplate();
		
		String endpointUrl="http://localhost:8888/ServerApp/m1";
		
		ResponseEntity<String> forHeader= rt.getForEntity(endpointUrl,String.class);//its header return(GET,POST,PUT)
																	//its String just bcz result should return Text/plain format so
	
		if(forHeader.getStatusCodeValue() == 200)
		{
			String body= forHeader.getBody();
			System.out.println("Response :: "+body);
		}//if
	}//method

}//class
