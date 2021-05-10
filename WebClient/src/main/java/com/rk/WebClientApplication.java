package com.rk;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	
	String endPointUrl="http://localhost:8888/ServerApp/m1";
	
	WebClient webclient=WebClient.create();
	
	/*    //synchronus
    	String response = webclient.get() //represent GET Request
						.uri(endPointUrl) //endpoint url
						.retrieve()   //take response body
						.bodyToMono(String.class) //map response to String variable output
						.block(); //make webclient as synchronus
    	
    	System.out.println("Final Response is :: "+response);
	*/
	
	System.out.println("*******Before sending the Response**********");
	
  webclient.get() //represent GET Request
			.uri(endPointUrl) //endpoint url
			.retrieve()   //take response body
			.bodyToMono(String.class) //map response to String variable output
			.subscribe(WebClientApplication::handelResp); //make webclient as Asynchronus
  						//create CallBack method  or handelResp is a method call after execte the output  
  
  		System.out.println("*******After sending the Response**********");
	}//main

	//this is static method this method is final output captcher it then execute
	public static void handelResp(String msg) {
		
		System.out.println("Final Out put :: "+msg);
	   }
}//class
