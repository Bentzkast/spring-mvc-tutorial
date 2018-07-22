package com.example.mvctutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTutorialApplication {
	// required for html
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-thymeleaf</artifactId>
//		</dependency>
	public static void main(String[] args) {
		SpringApplication.run(MvcTutorialApplication.class, args);
	}
}
