package com.codetest.animalfarm.model;

public class ClownFish extends Fish {
	public ClownFish() {
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void color() {
		System.out.println("A "+getName()+" is Orange color");
	}

	@Override
	public void size() {
		System.out.println("A "+getName()+" is small size");
	}
	
	public void makes() {
		System.out.println("A "+getName()+" makes jokes!");
	}
	
}
