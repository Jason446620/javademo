package com.example.demo.controoler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
	
	@GetMapping("/index")
	public String greeting() {
		
		return "index";
	}
}
