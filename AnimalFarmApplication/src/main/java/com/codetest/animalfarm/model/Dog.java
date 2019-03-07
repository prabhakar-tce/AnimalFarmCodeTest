package com.codetest.animalfarm.model;

public class Dog extends Animal implements ISingable, IWalkable {
	public Dog() {
		setName(this.getClass().getSimpleName());
		setSound("Woof, woof");
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
