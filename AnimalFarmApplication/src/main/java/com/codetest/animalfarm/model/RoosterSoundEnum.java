package com.codetest.animalfarm.model;

public enum RoosterSoundEnum {
	DANISH("kykyliky"),
	DUTCH("kukeleku"),
	FINNISH("kukko kiekuu"),
	FRENCH("cocorico"),
	GERMAN("kikeriki"),
	GREEK("kikiriki"),
	HEBREW("coo-koo-ri-koo"),
	HUNGARIAN("kukuriku"),
	ITALIAN("chicchirichi"),
	JAPANESE("ko-ke-kok-ko-o"),
	PORTUGUESE("cucurucu"),
	RUSSIAN("kukareku"),
	SWEDISH("kuckeliku"),
	TURKISH("kuk-kurri-kuuu"),
	URDU("kuklooku"),
	TAMIL("kokoroko"),
	ENGLISH("Cock-a-doodle-doo");
	
	private String sound;
	
	RoosterSoundEnum(String sound) {
		this.sound = sound;
	}
	
	public String sound() {
		return sound;
	}
	
	public static RoosterSoundEnum getEnum(String tongue) {
		RoosterSoundEnum tngEnum = null;
		for (RoosterSoundEnum tmpTtl : RoosterSoundEnum.values()) {
			if (tmpTtl.name().equals(tongue)) {
				tngEnum = tmpTtl;
			}
		}
		return tngEnum;
	}
}
