package com.example.springDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller")
public class SpringDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAppApplication.class, args);
	}

}
