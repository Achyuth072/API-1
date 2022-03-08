package com.ba.SpingBootDataJPAdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
//	private static final String template ="Hello, %s!";
	private int counter=0;	
	
	@GetMapping("/greeting")
	public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name ) {
		Greetings greetings=new Greetings();
		greetings.setId(counter++);
		greetings.setContent(name);
		return greetings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
