package com.codetest.animalfarm.model;

public class AnimalDTO {
	private String name;
	private String sound;
	
	private String singable;
	private String walkable;
	private String swimmable;
	private String flyable;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSingable() {
		return singable;
	}
	public void setSingable(String singable) {
		this.singable = singable;
	}
	public String getWalkable() {
		return walkable;
	}
	public void setWalkable(String walkable) {
		this.walkable = walkable;
	}
	public String getSwimmable() {
		return swimmable;
	}
	public void setSwimmable(String swimmable) {
		this.swimmable = swimmable;
	}
	public String getFlyable() {
		return flyable;
	}
	public void setFlyable(String flyable) {
		this.flyable = flyable;
	}
	
	
}
