package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWebApplication.class, args);
		System.out.println("Hello Anish");
	}

}
