package com.example.SpringDockerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.example.SpringDockerExample.entity")
@ComponentScan(basePackages = {"com.example.SpringDockerExample"})
public class SpringDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerExampleApplication.class, args);
	}

}
