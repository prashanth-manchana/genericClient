package com.nec.acuant.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	void uploadImage(String authToken, MultipartFile image, String instanceId, int side, int light);

}
