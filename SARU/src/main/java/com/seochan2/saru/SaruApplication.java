package com.seochan2.saru;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaruApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SaruApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test");
	}

}
