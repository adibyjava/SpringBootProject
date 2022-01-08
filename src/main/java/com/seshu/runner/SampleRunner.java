package com.seshu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sample Runner...");	
		System.out.println("Welcome to spring boot...");
		int x = 10;
		int y = 20;
		System.out.println(x+y);
	}
}
