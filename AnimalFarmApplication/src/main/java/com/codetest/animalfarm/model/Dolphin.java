package com.codetest.animalfarm.model;

public class Dolphin extends Animal implements ISwimmable {
	public Dolphin() {
		setName(this.getClass().getSimpleName());
	}

	@Override
	public void swim() {
		System.out.println("A "+getName()+" is is not exactly fish, they are good swimmers");
	}
}
