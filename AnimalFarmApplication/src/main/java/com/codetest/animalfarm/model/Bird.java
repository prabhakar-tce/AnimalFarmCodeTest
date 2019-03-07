package com.codetest.animalfarm.model;

public abstract class Bird extends Animal implements ISingable, IWalkable {

	@Override
	public void sing() {
		System.out.println("A "+getName()+" says : '"+getSound()+"'");
	}
	
	@Override
	public void walk() {
		System.out.println("A "+getName()+" move by walk");
	}
	
}
