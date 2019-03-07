package com.codetest.animalfarm.model;

public class Butterfly extends Animal implements IFlyable {
	public Butterfly() {
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void fly() {
		System.out.println("A "+getName()+" can fly");
	}

}
