package com.example.javavscodespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaVscodeSpringApplication {

	public static void main(String[] args) {
		System.out.println("Hello! This is going to run BEFORE SpringApplication.run(JavaVsCodeSpringApplication.class, args);");
		SpringApplication.run(JavaVscodeSpringApplication.class, args);
		System.out.println("Hello! This is going to run AFTER SpringApplication.run(JavaVsCodeSpringApplication.class, args);");
	}

}
