package com.codetest.animalfarm.factory;

import static com.codetest.animalfarm.util.AnimalFarmUtil.*;
/**
 * Factory class to produce Animal object based on given Identifier
 * @author Prabhakar M
 *
 */

import com.codetest.animalfarm.model.Animal;
import com.codetest.animalfarm.model.Butterfly;
import com.codetest.animalfarm.model.Cat;
import com.codetest.animalfarm.model.Caterpillar;
import com.codetest.animalfarm.model.Chicken;
import com.codetest.animalfarm.model.ClownFish;
import com.codetest.animalfarm.model.Dog;
import com.codetest.animalfarm.model.Dolphin;
import com.codetest.animalfarm.model.Duck;
import com.codetest.animalfarm.model.Frog;
import com.codetest.animalfarm.model.Parrot;
import com.codetest.animalfarm.model.Shark;

public class AnimalFarmFactory {
	public static Animal getAnimal(String animalId) {
		Animal animal = null;
		animalId = animalId.toUpperCase();
		switch (animalId) {
			case ANIMAL_TYPE_DUCK:
				animal = new Duck();
			break;
			case ANIMAL_TYPE_CHICKEN:
				animal = new Chicken();
			break;
			case ANIMAL_TYPE_ROOSTER:
				animal = new Chicken().addGender("M");
			break;
			case ANIMAL_TYPE_PARROT:
				animal = new Parrot();
			break;
			case ANIMAL_TYPE_SHARK:
				animal = new Shark();
			break;
			case ANIMAL_TYPE_CLOWNFISH:
				animal = new ClownFish();
			break;
			case ANIMAL_TYPE_DOLPHIN:
				animal = new Dolphin();
			break;
			case ANIMAL_TYPE_FROG:
				animal = new Frog();
			break;
			case ANIMAL_TYPE_DOG:
				animal = new Dog();
			break;
			case ANIMAL_TYPE_BUTTERFLY:
				animal = new Butterfly();
			break;
			case ANIMAL_TYPE_CAT:
				animal = new Cat();
			break;
			case ANIMAL_TYPE_CATERPILLAR:
				animal = new Caterpillar();
			break;
			default:
				animal = null;
			break;
		}
		return animal;
	}
}
