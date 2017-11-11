package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

	@RequestMapping("/")
	public String Welcome()
	{
	
	return "welcome";
	}
}
