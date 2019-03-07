package com.codetest.animalfarm.model;

public class Cat extends Animal implements ISingable, IWalkable {
	public Cat() {
		setName(this.getClass().getSimpleName());
		setSound("Meow");
	}

	@Override
	public void walk() {
		System.out.println("A "+getName()+" is able to walk");
	}

	@Override
	public void sing() {
		System.out.println("A "+getName()+" says : '"+getSound()+"'");
	}
	
	
}
