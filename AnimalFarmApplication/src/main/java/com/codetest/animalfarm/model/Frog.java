package com.codetest.animalfarm.model;

public class Frog extends Animal implements ISingable, IWalkable, ISwimmable {
	public Frog() {
		setName(this.getClass().getSimpleName());
		setSound("Croak, croak");
	}

	@Override
	public void swim() {
		System.out.println("A "+getName()+" is able to swim");
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
