package com.javainuse.SpringBootApacheKafkaHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApacheKafkaHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootApplication.class }, args);
	}
}