package com.dollop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Runner implements CommandLineRunner {
    @Autowired
	private BootCon bc;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(bc+"runner");
		// TODO Auto-generated method stub

	}

}
