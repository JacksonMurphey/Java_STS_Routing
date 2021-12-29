package com.jmurphey.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class IndexController {
	
	@RequestMapping("")
	public String index() {
		
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String next() {
		return "Python/Flask was awesome, but Java has it's Perks!";
	}
	
	@RequestMapping("/java")
	public String third() {
		return "Some Say: Java/Spring is better...Controversy?";
	}
}
