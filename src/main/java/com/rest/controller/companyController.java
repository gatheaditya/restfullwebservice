package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.services.companyService;

@RestController
public class companyController {
	
	@Autowired
	private companyService cs;
		
		@RequestMapping("/{msgs}")
		public String welcome(@PathVariable(name="msgs") String msgs)
		{
			return cs.welcomemessage(msgs);
		}

	}
