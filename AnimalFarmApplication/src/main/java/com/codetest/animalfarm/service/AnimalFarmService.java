package com.codetest.animalfarm.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static com.codetest.animalfarm.util.AnimalFarmUtil.*;
/**
 * This service class is used to retrieve model objects
 * @author Prabhakar M
 *
 */

import com.codetest.animalfarm.factory.AnimalFarmFactory;
import com.codetest.animalfarm.factory.AnimalFarmStatsMngr;
import com.codetest.animalfarm.model.Animal;
import com.codetest.animalfarm.model.AnimalDTO;
import com.codetest.animalfarm.model.AnimalStatsDTO;
import com.codetest.animalfarm.model.IFlyable;
import com.codetest.animalfarm.model.ISingable;
import com.codetest.animalfarm.model.ISwimmable;
import com.codetest.animalfarm.model.IWalkable;
@Service
public class AnimalFarmService {
	Logger logger = LoggerFactory.getLogger(AnimalFarmService.class);
	List<String> animalTypeList = new ArrayList<>();
	@PostConstruct
	public void constructAnimalTypeList() {
		animalTypeList = Arrays.asList(ANIMAL_TYPE_DUCK,
									   ANIMAL_TYPE_CHICKEN,
									   ANIMAL_TYPE_ROOSTER,
									   ANIMAL_TYPE_PARROT,
									   ANIMAL_TYPE_SHARK,
									   ANIMAL_TYPE_CLOWNFISH,
									   ANIMAL_TYPE_DOLPHIN,
									   ANIMAL_TYPE_FROG,
									   ANIMAL_TYPE_DOG,
									   ANIMAL_TYPE_BUTTERFLY,
									   ANIMAL_TYPE_CAT,
									   ANIMAL_TYPE_CATERPILLAR);
	}
	
	public Optional<AnimalDTO> getAnimal(String animalId) throws Exception {
		Optional<AnimalDTO> animalOpt = Optional.empty();
		try {
			if (animalTypeList.contains(animalId.toUpperCase())) {
				Animal animal = AnimalFarmFactory.getAnimal(animalId);
				if (animal != null) {
					AnimalDTO animalDTO = new AnimalDTO();
					animalDTO.setName(animal.getName());
					animalDTO.setSound(StringUtils.isEmpty(animal.getSound()) ? "Doesn't sing" : animal.getSound());
					animalDTO.setFlyable((animal instanceof IFlyable) ? (animal.getName()+" is able to fly") : (animal.getName()+" is not able to fly"));
					animalDTO.setSwimmable((animal instanceof ISwimmable) ? (animal.getName()+" is able to swim") : (animal.getName()+" is not able to swim"));
					animalDTO.setWalkable((animal instanceof IWalkable) ? (animal.getName()+" is able to walk") : (animal.getName()+" is not able to walk"));
					animalDTO.setSingable((animal instanceof ISingable) ? (animal.getName()+" is able to sing") : (animal.getName()+" is not able to sing"));
					animalOpt = Optional.of(animalDTO);
				}
			} else {
				logger.info("Animal not found in the farm");
			}
		} catch (Exception e) {
			logger.error("Error while constructing Animal object", e);
			throw e;
		}
		return animalOpt;
	}
	
	public Optional<AnimalStatsDTO> getAnimalStats() throws Exception {
		Optional<AnimalStatsDTO> animalStatsOpt = Optional.empty();
		AnimalStatsDTO animalStatsDTO = AnimalFarmStatsMngr.getStatistics();
		animalStatsOpt = Optional.of(animalStatsDTO);
		return animalStatsOpt;
	}
	
}
