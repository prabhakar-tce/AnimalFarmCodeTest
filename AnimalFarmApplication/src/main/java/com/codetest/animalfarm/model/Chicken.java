package com.codetest.animalfarm.model;

import org.springframework.util.StringUtils;

public class Chicken extends Bird {
	private String gender;
	public Chicken() {
		setName("Hen");
		setSound("Cluck, cluck");
	}
	
	public Chicken addGender(String gender) {
		this.gender = gender;
		if ("M".equals(gender)) {
			setName("Rooster");
			setSound("Cock-a-doodle-doo");
		} else {
			setName("Hen");
			setSound("Cluck, cluck");
		}
		return this;
	}
	
//	public Chicken addTongue(String tongue) {
//		tongue = (StringUtils.isEmpty(tongue)) ? "ENGLISH" : tongue;
//		setSound("M".equals(gender) ? (RoosterSoundEnum.getEnum(tongue.toUpperCase()) != null ? RoosterSoundEnum.getEnum(tongue.toUpperCase()).sound() : "Cock-a-doodle-doo") : "Cluck, cluck");
//		return this;
//	}
}
