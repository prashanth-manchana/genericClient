package com.nec.acuant.service;

import com.nec.acuant.to.ScanData;

public interface InstanceService {

	public String getInstanceId(String authToken, ScanData scanData);

}
