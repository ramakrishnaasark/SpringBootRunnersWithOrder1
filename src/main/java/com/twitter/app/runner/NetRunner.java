package com.twitter.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class NetRunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER ORDER");

	}

}
