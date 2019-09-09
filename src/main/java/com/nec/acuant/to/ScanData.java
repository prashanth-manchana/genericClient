package com.nec.acuant.to;

public class ScanData {
	private int AuthenticationSensitivity;
	private int ClassificationMode;
	private Device Device;
	private int ImageCroppingExpectedSize;
	private int ImageCroppingMode;
	private String ManualDocumentType;
	private int ProcessMode;
	private String SubscriptionId;

	public int getAuthenticationSensitivity() {
		return AuthenticationSensitivity;
	}

	public void setAuthenticationSensitivity(int authenticationSensitivity) {
		AuthenticationSensitivity = authenticationSensitivity;
	}

	public int getClassificationMode() {
		return ClassificationMode;
	}

	public void setClassificationMode(int classificationMode) {
		ClassificationMode = classificationMode;
	}

	public Device getDevice() {
		return Device;
	}

	public void setDevice(Device device) {
		Device = device;
	}

	public int getImageCroppingExpectedSize() {
		return ImageCroppingExpectedSize;
	}

	public void setImageCroppingExpectedSize(int imageCroppingExpectedSize) {
		ImageCroppingExpectedSize = imageCroppingExpectedSize;
	}

	public int getImageCroppingMode() {
		return ImageCroppingMode;
	}

	public void setImageCroppingMode(int imageCroppingMode) {
		ImageCroppingMode = imageCroppingMode;
	}

	public String getManualDocumentType() {
		return ManualDocumentType;
	}

	public void setManualDocumentType(String manualDocumentType) {
		ManualDocumentType = manualDocumentType;
	}

	public int getProcessMode() {
		return ProcessMode;
	}

	public void setProcessMode(int processMode) {
		ProcessMode = processMode;
	}

	public String getSubscriptionId() {
		return SubscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		SubscriptionId = subscriptionId;
	}

}
