package com.jmurphey.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	
	@RequestMapping("")
	public String index() {
		return "The Dojo is awesome!";
	}
	
//	@RequestMapping("/{city}")
//	public String showCity(@PathVariable("city") String city) {
//		if(city.equals("burbank")) {
//		return String.format("The %s Dojo is located in Southern, CA", city);
//		}
//		else if(city.equals("san-jose")) {
//			return String.format("%s dojo is the headquarters", city);
//		} else { return "Sorry, Dojo doesnt know that city";
//			
//			}
//		}
	
	@RequestMapping("/{location}")
	public String solutionCode(@PathVariable("location") String location) {
		switch(location) {
		case "burbank":
			return "Burbank Dojo is located in Southern California";
		case "san-jose":
			return "SJ dojo is the headquarters";
		default:
			return String.format("%s is pretty cool too!", location);
		
			}
		}
	

	}
	
