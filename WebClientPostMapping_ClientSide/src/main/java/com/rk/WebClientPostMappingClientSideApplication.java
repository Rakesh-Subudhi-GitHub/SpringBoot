package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.rk.helper.CustomerInfo;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebClientPostMappingClientSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientPostMappingClientSideApplication.class, args);
		
		CustomerInfo cust=new CustomerInfo();
		cust.setCustId(1000);
		cust.setCustName("Rakesh");
		cust.setCustEmail("ABC@gmail.com");
	
		String endPointUrl="http://localhost:8080/addCust";
		
		WebClient webclient= WebClient.create();
		
		String resp=webclient.post()//post method
				             .uri(endPointUrl)//url
				             .body(Mono.just(cust),CustomerInfo.class)//store and send data cust in customerinfo helper class
				             .retrieve()//resp data
				             .bodyToMono(String.class)//output in String if data take then may be take CustomerInfo helper class that time its not need
				             .block();//sync manaer
	System.out.println("OUTPUT is :: "+resp);
	}//main

}//class
