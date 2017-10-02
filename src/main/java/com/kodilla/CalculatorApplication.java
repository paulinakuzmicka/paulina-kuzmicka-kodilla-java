package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Calculator calculator = new Calculator();
		System.out.println(calculator.addAToB(5, 4));
		System.out.println(calculator.substractAFromB(8,2));
	}
}
