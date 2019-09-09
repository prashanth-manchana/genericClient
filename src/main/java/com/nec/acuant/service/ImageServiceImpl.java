package com.nec.acuant.service;

import java.io.InputStream;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.constants.URLConstants;

@Service
public class ImageServiceImpl implements ImageService {

	@Override
	public void uploadImage(String authToken, MultipartFile image, String instanceId, int side, int light) {
		if (image != null & image.getSize() > 0) {
			byte[] imageByte = getByteData(image);
			HttpEntity<byte[]> requestEntity = new HttpEntity<>(imageByte, populateHeaderData(authToken));
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.exchange(getUpdatedUrl(instanceId, URLConstants.POST_IMAGE, side, light), HttpMethod.POST,
					requestEntity, String.class);
		}
	}

	private byte[] getByteData(MultipartFile imageData) {
		byte[] imageByte = new byte[(int) imageData.getSize()];
		try (InputStream in = imageData.getInputStream()) {
			int offset = 0;
			int numRead = 0;
			while ((offset < imageByte.length)
					& ((numRead = in.read(imageByte, offset, imageByte.length - offset)) >= 0)) {
				offset += numRead;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imageByte;
	}

	private String getUpdatedUrl(String instanceId, String url, int side, int light) {
		url.replace("{INSTANCEID}", instanceId);
		url.replace("{SIDE}", String.valueOf(side));
		url.replace("{LIGHT}", String.valueOf(light));
		return url;
	}

	private HttpHeaders populateHeaderData(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", authToken);
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		return headers;
	}

}
