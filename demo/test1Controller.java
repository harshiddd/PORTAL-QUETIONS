package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1Controller {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World:";
	}

}