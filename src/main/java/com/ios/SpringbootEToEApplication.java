package com.ios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootEToEApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		System.out.println("WELCOME TO THE SPRING BOOT E-TO-E APP...!");
		SpringApplication.run(SpringbootEToEApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootEToEApplication.class);
	}
}
