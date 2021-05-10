package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rk.helper.CustomerInfo;

@SpringBootApplication
public class PostMappingClientSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostMappingClientSideApplication.class, args);
		
		//add Customer value
		CustomerInfo cust=new CustomerInfo();
		cust.setCustId(1000);
		cust.setCustName("Raja");
		cust.setCustEmail("Raja@Gmail.com");
		
		//RestTemplate for Post
		RestTemplate rt=new RestTemplate();
		
		String endPointUrl="http://localhost:8080/addCust";
		
		ResponseEntity<String> forEntity = rt.postForEntity(endPointUrl,cust, String.class);
		
		System.out.println("value ::  "+forEntity.getBody());
		if(forEntity.getStatusCodeValue() == 201)
		{
			System.out.println("value ::  "+forEntity.getBody());
		}
	}//main

}//class
