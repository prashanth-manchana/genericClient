package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nec.acuant.service.InstanceService;
import com.nec.acuant.to.ScanData;

@RestController
@RequestMapping("acuant")
public class InstanceController {

	@Autowired
	InstanceService instanceService;

	@RequestMapping(value = "instance", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String getInstanceId(@RequestHeader("Authorization") String authToken, @RequestBody ScanData scanData) {
		return instanceService.getInstanceId(authToken, scanData);
	}
}
