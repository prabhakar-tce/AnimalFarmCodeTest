package com.codetest.animalfarm.model;

public class Parrot extends Bird implements IFlyable {
	private Animal animalLivesWith;
	public Parrot() {
		setName(this.getClass().getSimpleName());
		setSound("Anything");
	}
	
	public Parrot livesWith(Animal animalLivesWith) {
		this.animalLivesWith = animalLivesWith;
		setSound(this.animalLivesWith.getSound());
		return this;
	}
	
	@Override
	public void sing() {
		if (this.animalLivesWith == null) {
			System.out.println("A "+getName()+" says : '"+getSound()+"'");
		} else {
			System.out.println("A "+getName()+" lives with "+this.animalLivesWith.getName()+" says : '"+this.animalLivesWith.getSound()+"'");
		}
	}

	@Override
	public void fly() {
		System.out.println("A "+getName()+" is able to fly");
	}
}
