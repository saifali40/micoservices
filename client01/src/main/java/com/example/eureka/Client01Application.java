package com.example.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
public class Client01Application {

	public static void main(String[] args) {
		SpringApplication.run(Client01Application.class, args);
	}
	
	
	@RestController
	class ServiceInstanceRestController {

	    @GetMapping("/")
	    public String hello() {
	    	return "hello world";
	    }
	    
	}
}
