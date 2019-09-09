package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nec.acuant.service.MetricsService;

@RestController
@RequestMapping("acuant")
public class MetricsController {

	@Autowired
	MetricsService metricsService;

	@GetMapping(value = "/getMetrics")
	public void getMetrics(@RequestHeader("Authorization") String authToken, 
			@RequestParam String instanceId, 
			@RequestParam int side, 
			@RequestParam int light) {
		metricsService.getImageMetrics(instanceId, authToken, side, light);
	}
}
