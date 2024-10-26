package com.ram.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);

		//Hello dev = new Hello();

		Dev dev = context.getBean(Dev.class);
		dev.greet();

	}



}
