package com.codetest.animalfarm.model;

public class Caterpillar extends Animal implements IWalkable {
	public Caterpillar() {
		setName(this.getClass().getSimpleName());
	}
	@Override
	public void walk() {
		walk("Crawl");
	}
	
	private void walk(String walkType) {
		System.out.println("A "+getName()+" is able to "+walkType);
	}

}
