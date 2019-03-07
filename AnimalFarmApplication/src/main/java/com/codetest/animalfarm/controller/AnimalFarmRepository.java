package com.codetest.animalfarm.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codetest.animalfarm.model.AnimalDTO;
import com.codetest.animalfarm.model.AnimalStatsDTO;
import com.codetest.animalfarm.model.ApiResponse;
import com.codetest.animalfarm.service.AnimalFarmService;

/**
 * Repository for Animal objects
 * @author Prabhakar M
 *
 */
@RestController
@RequestMapping("/animal")
public class AnimalFarmRepository {
	Logger logger = LoggerFactory.getLogger(AnimalFarmRepository.class);
	@Autowired
	private AnimalFarmService animalFarmService;
	@GetMapping("/{animalId}")
	public ApiResponse getAnimal(@PathVariable("animalId") String animalId) {
		logger.info("Request for animal : "+animalId);
		ApiResponse apiResponse = new ApiResponse();
		try {
			if (!StringUtils.isEmpty(animalId)) {
				if (!StringUtils.isEmpty(animalId)) {
					Optional<AnimalDTO> animalOpt = animalFarmService.getAnimal(animalId);
					if (animalOpt.isPresent()) {
						apiResponse.setHttpStatus(HttpStatus.OK.value());
						apiResponse.setMessage("Animal found in the farm");
						apiResponse.setResponseObj(animalOpt.get());
					} else {
						apiResponse.setHttpStatus(HttpStatus.NO_CONTENT.value());
						apiResponse.setMessage("Animal not found in the farm");
					}
				} else {
					apiResponse.setHttpStatus(HttpStatus.NO_CONTENT.value());
					apiResponse.setMessage("Animal not found in the farm");
				}
			} else {
				apiResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
				apiResponse.setMessage("Animal not found in the farm");
			}
		} catch (Exception e) {
			logger.error("Error while get Animal", e);
			apiResponse.setHttpStatus(HttpStatus.EXPECTATION_FAILED.value());
			apiResponse.setMessage("Animal not found in the farm");
		}
		return apiResponse;
	}
	
	@GetMapping("/statistics")
	public ApiResponse getAnimalStats() {
		logger.info("Request for animal statistics");
		ApiResponse apiResponse = new ApiResponse();
		try {
			Optional<AnimalStatsDTO> animalStatsOpt = animalFarmService.getAnimalStats();
			if (animalStatsOpt.isPresent()) {
				apiResponse.setHttpStatus(HttpStatus.OK.value());
				apiResponse.setMessage("Animal stats generated");
				apiResponse.setResponseObj(animalStatsOpt.get());
			} else {
				apiResponse.setHttpStatus(HttpStatus.NOT_FOUND.value());
				apiResponse.setMessage("Animal stats not generated");
			}
		} catch (Exception e) {
			logger.error("Error while get Animal statistics", e);
			apiResponse.setHttpStatus(HttpStatus.EXPECTATION_FAILED.value());
			apiResponse.setMessage("Animal statistics not found");
		}
		return apiResponse;
	}
}
