package com.codetest.animalfarm.model;

public class Duck extends Bird implements ISwimmable, IFlyable {
	public Duck() {
		setName(this.getClass().getSimpleName());
		setSound("Quack, quack");
	}

	@Override
	public void fly() {
		System.out.println("A "+getName()+" is able to fly");
	}

	@Override
	public void swim() {
		System.out.println("A "+getName()+" is able to swim");
	}
	
}
