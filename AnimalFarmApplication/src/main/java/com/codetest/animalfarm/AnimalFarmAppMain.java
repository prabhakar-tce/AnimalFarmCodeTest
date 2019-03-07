package com.codetest.animalfarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalFarmAppMain {

	public static void main(String[] args) {
		System.out.println("AnimalFarmAppMain application starts!!!");
		SpringApplication.run(AnimalFarmAppMain.class, args);
		System.out.println("AnimalFarmAppMain application started!!!");
	}

}
