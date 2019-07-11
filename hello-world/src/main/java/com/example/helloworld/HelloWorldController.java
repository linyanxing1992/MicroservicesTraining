package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${app.test}")
	private String data;
	
	@Value("${app.age}")
	private int age;
	
	@Value("${app.name}")
	private String name;
	
	@GetMapping("/world")
	public String hi() {
		return data + " " + name + " " + "You are " + age + " years old";
	}
}
