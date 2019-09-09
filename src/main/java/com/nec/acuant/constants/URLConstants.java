package com.nec.acuant.constants;

public class URLConstants {
	public final static String BASE_URL = "https://services.assureid.net";
	public final static String GET_DOCUMENT_INSTANCE = BASE_URL + "/AssureIDService/Document/Instance";
	public final static String POST_IMAGE = BASE_URL + "/AssureIDService/Document/{instanceID}/Image?side={SIDE}&light={LIGHT}";
	public final static String GET_METRICS = BASE_URL + "/AssureIDService/Document/{INSTANCEID}/Image/Metrics?side={SIDE}&light={LIGHT}";
	public static final String GET_DOCUMENT_DATA = BASE_URL + "/AssureIDService/Document/{INSTANCEID}";
	public static final String GET_CLASSIFICATION = BASE_URL + "/AssureIDService/Document/{INSTANCEID}/Classification";
}
