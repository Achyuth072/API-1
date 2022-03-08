package com.ba.SpingBootDataJPAdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingBootDataJpAdemoApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepo ur;
	
	public static void main(String[] args) {
		SpringApplication.run(SpingBootDataJpAdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User>users=ur.findAll();
		for( User user:users) {
			System.out.println(user);
		}
		
		// TODO Auto-generated method stub
		
	}

}
