package com.codetest.animalfarm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codetest.animalfarm.model.Butterfly;
import com.codetest.animalfarm.model.Caterpillar;
import com.codetest.animalfarm.model.Chicken;
import com.codetest.animalfarm.model.ClownFish;
import com.codetest.animalfarm.model.Dolphin;
import com.codetest.animalfarm.model.Duck;
import com.codetest.animalfarm.model.Frog;
import com.codetest.animalfarm.model.IFlyable;
import com.codetest.animalfarm.model.ISingable;
import com.codetest.animalfarm.model.ISwimmable;
import com.codetest.animalfarm.model.IWalkable;
import com.codetest.animalfarm.model.Parrot;
import com.codetest.animalfarm.model.Shark;

public class AnimalFarmTester {
	Duck duck = null;
	Chicken chicken = null;
	Chicken rooster = null;
	Parrot parrot = null;
	Shark shark = null;
	ClownFish clownFish = null;
	Dolphin dolphin = null;
	Frog frog = null;
	Butterfly butterfly = null;
	Caterpillar caterpillar = null;
	
	@Before
	public void setUp() {
		duck = new Duck();
		chicken = new Chicken();
		rooster = new Chicken().addGender("M");
		parrot = new Parrot();
		shark = new Shark();
		clownFish = new ClownFish();
		dolphin = new Dolphin();
		frog = new Frog();
		butterfly = new Butterfly();
		caterpillar = new Caterpillar();
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
	
	@Test
	public void testShark() {
		assertFalse(shark instanceof IFlyable);
		assertTrue(shark instanceof ISwimmable);
		assertFalse(shark instanceof ISingable);
		assertFalse(shark instanceof IWalkable);
		
		assertNotEquals("Anything", shark.getSound());
	}
	
	@Test
	public void testClownFish() {
		assertFalse(clownFish instanceof IFlyable);
		assertTrue(clownFish instanceof ISwimmable);
		assertFalse(clownFish instanceof ISingable);
		assertFalse(clownFish instanceof IWalkable);
		
		assertNotEquals("Anything", clownFish.getSound());
	}
	
	@Test
	public void testDolphin() {
		assertFalse(dolphin instanceof IFlyable);
		assertTrue(dolphin instanceof ISwimmable);
		assertFalse(dolphin instanceof ISingable);
		assertFalse(dolphin instanceof IWalkable);
		
		assertNotEquals("Anything", dolphin.getSound());
		assertEquals(null, dolphin.getSound());
	}
	
	@Test
	public void testFrog() {
		assertFalse(frog instanceof IFlyable);
		assertTrue(frog instanceof ISwimmable);
		assertTrue(frog instanceof ISingable);
		assertTrue(frog instanceof IWalkable);
		
		assertEquals("Croak, croak", frog.getSound());
	}
	
	@Test
	public void testButterfly() {
		assertTrue(butterfly instanceof IFlyable);
		assertFalse(butterfly instanceof ISwimmable);
		assertFalse(butterfly instanceof ISingable);
		assertFalse(butterfly instanceof IWalkable);
		
		assertNotEquals("Woof, woof", butterfly.getSound());
	}
	@Test
	public void testCaterpillar() {
		assertFalse(caterpillar instanceof IFlyable);
		assertFalse(caterpillar instanceof ISwimmable);
		assertFalse(caterpillar instanceof ISingable);
		assertTrue(caterpillar instanceof IWalkable);
		
		assertNotEquals("Woof, woof", caterpillar.getSound());
	}
	
	@After
	public void tearDown() {
		duck = null;
		chicken = null;
		rooster = null;
		parrot = null;
		shark = null;
		clownFish = null;
		dolphin = null;
		frog = null;
		butterfly = null;
		caterpillar = null;
		
	}
}
