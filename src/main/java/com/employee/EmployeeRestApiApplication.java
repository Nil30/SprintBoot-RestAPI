package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApiApplication.class, args);
		System.out.println("Application is started on port : 8080");
	}

}
