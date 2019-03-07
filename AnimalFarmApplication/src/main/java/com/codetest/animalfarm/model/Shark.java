package com.codetest.animalfarm.model;

public class Shark extends Fish {
	public Shark() {
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void color() {
		System.out.println("A "+getName()+" Gray color");
	}

	@Override
	public void size() {
		System.out.println("A "+getName()+" large size");
	}
	
	public void eat(Fish fish) {
		System.out.println("A "+getName()+" eats "+fish.getName());
	}

}
