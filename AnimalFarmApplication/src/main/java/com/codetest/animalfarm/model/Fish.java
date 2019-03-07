package com.codetest.animalfarm.model;

public abstract class Fish extends Animal implements ISwimmable {
	public abstract void color();
	public abstract void size();
	@Override
	public void swim() {
		System.out.println("A "+getName()+" is able to swim");
	}
	
}
