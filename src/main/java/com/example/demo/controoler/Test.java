package com.example.demo.controoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/test")
	public String testvalue() {
		
		return "this is a api test";
	}
}
