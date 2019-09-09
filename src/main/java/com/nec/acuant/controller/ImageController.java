package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.service.ImageService;

@RestController
@RequestMapping("acuant")
public class ImageController {

	@Autowired
	ImageService imageService;

	@PostMapping(value = "/image-upload")
	public void uploadImage(
			@RequestHeader("Authorization") String authToken,
			@RequestParam MultipartFile image, 
			@RequestParam String instanceId,
			@RequestParam int side,
			@RequestParam int light) {
		imageService.uploadImage(authToken, image, instanceId, side, light);
	}

}
