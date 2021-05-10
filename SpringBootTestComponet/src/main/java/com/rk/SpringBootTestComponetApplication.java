package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rk.service.ServiceClass;
import com.rk.service.ServiceClassImpl;

@SpringBootApplication
public class SpringBootTestComponetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestComponetApplication.class, args);
	}

	@Bean
	public ServiceClass getInstance()
	{
		ServiceClass sc=new ServiceClassImpl();
		sc.test();
		return sc;
	}
}
