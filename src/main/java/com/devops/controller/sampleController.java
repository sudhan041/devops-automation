package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class sampleController {
	
	@GetMapping(value = "/greeting")
	public String testing() {
		
		return "welcome to java world!";
		
	}

}
