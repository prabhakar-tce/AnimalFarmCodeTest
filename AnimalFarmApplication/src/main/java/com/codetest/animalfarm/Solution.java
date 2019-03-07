package com.codetest.animalfarm;

import java.util.Arrays;
import java.util.List;

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
import com.codetest.animalfarm.model.IFlyable;
import com.codetest.animalfarm.model.ISingable;
import com.codetest.animalfarm.model.ISwimmable;
import com.codetest.animalfarm.model.IWalkable;
import com.codetest.animalfarm.model.Parrot;
import com.codetest.animalfarm.model.Shark;

public class Solution {
	public static void main(String[] ag) {
		List<Animal> animalList = Arrays.asList(new Duck(),
												new Chicken(),
												new Chicken().addGender("M"),
												new Parrot(),
												new Shark(),
												new ClownFish(),
												new Dolphin(),
												new Frog(),
												new Dog(),
												new Butterfly(),
												new Cat());
		
		System.out.println("Walkable : "+animalList.stream().filter(animalObj -> animalObj instanceof IWalkable).count());
		System.out.println("Flyable : "+animalList.stream().filter(animalObj -> animalObj instanceof IFlyable).count());
		System.out.println("Singable : "+animalList.stream().filter(animalObj -> animalObj instanceof ISingable).count());
		System.out.println("Swimmable : "+animalList.stream().filter(animalObj -> animalObj instanceof ISwimmable).count());
		
//		Duck duck = new Duck();
//		duck.fly();
//		duck.walk();
//		duck.swim();
//		duck.sing();
		
//		Chicken chicken = new Chicken();
//		chicken.sing();
//		chicken.walk();
		
//		Chicken rooster = new Chicken().addGender("M").addTongue("TAMIL");
//		rooster.sing();
//		rooster.walk();
		
//		Dog dog = new Dog();
//		dog.sing();
//		dog.walk();
		
//		Cat cat = new Cat();
//		cat.sing();
//		cat.walk();
		
//		Parrot parrot = new Parrot();
//		parrot.sing();
//		parrot.walk();
//		parrot.fly();
		
//		Parrot parrot = new Parrot().livesWith(new Chicken());
//		parrot.sing();
//		parrot.walk();
//		parrot.fly();
		
//		Shark shark = new Shark();
//		shark.swim();
//		shark.color();
//		shark.size();
		
//		ClownFish clownFish = new ClownFish();
//		clownFish.swim();
//		clownFish.color();
//		clownFish.size();
		
//		Dolphin dolphin = new Dolphin();
//		dolphin.swim();
		
//		Butterfly butterfly = new Butterfly();
//		butterfly.fly();
		
//		Caterpillar caterpillar = new Caterpillar();
//		caterpillar.walk();
		
//		Frog frog = new Frog();
//		frog.walk();
//		frog.sing();
//		frog.swim();
		
	}
}
