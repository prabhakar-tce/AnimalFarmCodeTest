package com.codetest.animalfarm.factory;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codetest.animalfarm.model.Animal;
import com.codetest.animalfarm.model.AnimalStatsDTO;
import com.codetest.animalfarm.model.Butterfly;
import com.codetest.animalfarm.model.Cat;
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

/**
 * This class is responsible for Animal farm statistics generation
 * @author Prabhakar M
 *
 */
public class AnimalFarmStatsMngr {
	static Logger logger = LoggerFactory.getLogger(AnimalFarmStatsMngr.class);
	public static AnimalStatsDTO getStatistics() {
		AnimalStatsDTO animalStatsDTO = new AnimalStatsDTO();
		try {
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
			animalStatsDTO.setFlyableCount(animalList.stream().filter(animalObj -> animalObj instanceof IFlyable).count());
			animalStatsDTO.setSingableCount(animalList.stream().filter(animalObj -> animalObj instanceof ISingable).count());
			animalStatsDTO.setSwimmableCount(animalList.stream().filter(animalObj -> animalObj instanceof ISwimmable).count());
			animalStatsDTO.setWalkableCount(animalList.stream().filter(animalObj -> animalObj instanceof IWalkable).count());
		} catch (Exception e) {
			logger.error("Error while constructing Animal statistics", e);
			throw e;
		}
		return animalStatsDTO;
	}
}
