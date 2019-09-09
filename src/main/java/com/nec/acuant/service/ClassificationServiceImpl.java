package com.nec.acuant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nec.acuant.constants.URLConstants;
import com.nec.acuant.to.ClassificationResponse;

@Service
public class ClassificationServiceImpl implements ClassificationService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public ClassificationResponse getClassificationData(String instanceId, String authToken) {
		HttpEntity<String> requestEntity = new HttpEntity<>(null, populateHeaderData(authToken));
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ClassificationResponse> response = restTemplate.exchange(getUpdatedUrl(instanceId, URLConstants.GET_CLASSIFICATION),
				HttpMethod.GET, requestEntity, ClassificationResponse.class);
		LOGGER.debug(response.getBody().toString());
		return response.getBody();
	}

	private HttpHeaders populateHeaderData(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authToken);
		return headers;
	}

	private String getUpdatedUrl(String instanceId, String url) {
		return url.replace("{INSTANCEID}", instanceId);
	}

}
