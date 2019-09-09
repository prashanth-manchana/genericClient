package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nec.acuant.service.ClassificationService;

@RestController
@RequestMapping("acuant")
public class ClassificationController {

	@Autowired
	ClassificationService classificationService;

	@GetMapping(value = "/getClassification")
	public void getMetrics(@RequestHeader("Authorization") String authToken, 
			@RequestParam String instanceId) {
		classificationService.getClassificationData(instanceId, authToken);
	}
}
