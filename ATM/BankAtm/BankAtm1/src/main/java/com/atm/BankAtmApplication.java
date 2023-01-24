package com.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan("com.atm")  //scan all classes in com.atm
public class BankAtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAtmApplication.class, args);
	}
}
