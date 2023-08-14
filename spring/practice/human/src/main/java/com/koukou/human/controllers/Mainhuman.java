package com.koukou.human.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mainhuman {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false) String name) {
		
		if(name!=null) {
			return "Hello "+name;
		}
		
		return "Hello Human";
	}
	@RequestMapping("/{name}/{last_name}/{times}")
	public String findTwo(
	        @PathVariable("name") String name,
	        @PathVariable("last_name") String last_name,
	        @PathVariable("times") int times) {
	    if (times > 0) {
	        StringBuilder greeting = new StringBuilder();
	        for (int i = 0; i < times; i++) {
	            greeting.append("Hello ").append(name).append(" ").append(last_name).append("! ");
	        }
	        return greeting.toString();
	    }
	    return "Hello " + name + " " + last_name;
	}
}

