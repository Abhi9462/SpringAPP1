package com.dollop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Runner2 implements CommandLineRunner {
	@Autowired
	private EMail email;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(email);
		// TODO Auto-generated method stub

	}

}
