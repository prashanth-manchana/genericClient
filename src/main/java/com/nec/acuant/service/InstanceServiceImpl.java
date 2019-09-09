package com.nec.acuant.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.nec.acuant.constants.URLConstants;
import com.nec.acuant.to.ScanData;

@Service
public class InstanceServiceImpl implements InstanceService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public String getInstanceId(String authToken, ScanData scanData) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", authToken);
		Gson gson = new Gson();
		HttpEntity<String> entity = new HttpEntity<>(gson.toJson(scanData), headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				URLConstants.BASE_URL + URLConstants.GET_DOCUMENT_INSTANCE, HttpMethod.POST, entity, String.class);
		LOGGER.debug(response.getBody().toString());
		return response.getBody();
	}

}
