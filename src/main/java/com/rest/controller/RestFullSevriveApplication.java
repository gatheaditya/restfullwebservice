package com.rest.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.rest")
@EnableAutoConfiguration
@SpringBootApplication
public class RestFullSevriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFullSevriveApplication.class, args);
	}
}
