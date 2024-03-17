package com.uplifttech.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class,args);
	}


	@Override
	public void run(String... args) throws Exception {
		Thread t=new Thread(new ShowDbChanges());
		t.run();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
