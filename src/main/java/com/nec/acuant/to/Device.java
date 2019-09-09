package com.nec.acuant.to;

public class Device {
	private boolean HasContactlessChipReader;
	private boolean HasMagneticStripeReader;
	private String SerialNumber;
	private Type Type;

	public boolean isHasContactlessChipReader() {
		return HasContactlessChipReader;
	}

	public void setHasContactlessChipReader(boolean hasContactlessChipReader) {
		HasContactlessChipReader = hasContactlessChipReader;
	}

	public boolean isHasMagneticStripeReader() {
		return HasMagneticStripeReader;
	}

	public void setHasMagneticStripeReader(boolean hasMagneticStripeReader) {
		HasMagneticStripeReader = hasMagneticStripeReader;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public Type getType() {
		return Type;
	}

	public void setType(Type type) {
		Type = type;
	}

}
