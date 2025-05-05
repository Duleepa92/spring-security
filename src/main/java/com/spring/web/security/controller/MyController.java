package com.spring.web.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.security.model.Users;
import com.spring.web.security.service.UserService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable("name") String name) {
		return "Hello "+name;
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		return service.verify(user);
	}
	
}
