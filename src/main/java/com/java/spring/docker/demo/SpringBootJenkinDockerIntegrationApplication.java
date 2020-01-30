package com.java.spring.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinDockerIntegrationApplication {

	public static void main(String[] args) {
		System.out.println("**************HELLO*******************");
		SpringApplication.run(SpringBootJenkinDockerIntegrationApplication.class, args);
	}

}
