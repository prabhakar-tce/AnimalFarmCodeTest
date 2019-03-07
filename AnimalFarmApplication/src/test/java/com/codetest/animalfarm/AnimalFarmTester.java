package com.codetest.animalfarm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codetest.animalfarm.model.Chicken;
import com.codetest.animalfarm.model.Duck;
import com.codetest.animalfarm.model.IFlyable;
import com.codetest.animalfarm.model.ISingable;
import com.codetest.animalfarm.model.ISwimmable;
import com.codetest.animalfarm.model.IWalkable;
import com.codetest.animalfarm.model.Parrot;

public class AnimalFarmTester {
	Duck duck = null;
	Chicken chicken = null;
	Chicken rooster = null;
	Parrot parrot = null;
	@Before
	public void setUp() {
		duck = new Duck();
		chicken = new Chicken();
		rooster = new Chicken().addGender("M");
		parrot = new Parrot();
	}
	@Test
	public void testDuck() {
		assertTrue(duck instanceof IFlyable);
		assertTrue(duck instanceof ISwimmable);
		assertTrue(duck instanceof ISingable);
		assertTrue(duck instanceof IWalkable);
		
		assertEquals("Quack, quack", duck.getSound());
	}
	
	@Test
	public void testRooster() {
		assertFalse(rooster instanceof IFlyable);
		assertFalse(rooster instanceof ISwimmable);
		assertTrue(rooster instanceof ISingable);
		assertTrue(rooster instanceof IWalkable);
		
		assertEquals("Cock-a-doodle-doo", rooster.getSound());
//		rooster.addTongue("DANISH");
//		assertEquals("kykyliky", rooster.getSound());
//		rooster.addTongue("GERMAN");
//		assertEquals("kikeriki", rooster.getSound());
//		rooster.addTongue("tamil");
//		assertEquals("kokoroko", rooster.getSound());
//		rooster.addTongue("xxxx");
//		assertEquals("Cock-a-doodle-doo", rooster.getSound());
	}
	
	@Test
	public void testChicken() {
		assertFalse(chicken instanceof IFlyable);
		assertFalse(chicken instanceof ISwimmable);
		assertTrue(chicken instanceof ISingable);
		assertTrue(chicken instanceof IWalkable);
		
		assertEquals("Cluck, cluck", chicken.getSound());
//		chicken.addTongue("DANISH");
//		assertNotEquals("kykyliky", rooster.getSound());
	}
	@Test
	public void testParrot() {
		assertTrue(parrot instanceof IFlyable);
		assertFalse(parrot instanceof ISwimmable);
		assertTrue(parrot instanceof ISingable);
		assertTrue(parrot instanceof IWalkable);
		
		assertEquals("Anything", parrot.getSound());
		parrot.livesWith(new Duck());
		assertNotEquals("Anything", parrot.getSound());
		assertEquals("Quack, quack", parrot.getSound());
	}
}
