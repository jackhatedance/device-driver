package com._7eggs.devicedriver.huaweistb;

import com.driverstack.yunos.driver.AbstractDriver;
import com.driverstack.yunos.driver.device.DeviceInfo;
import com.driverstack.yunos.driver.device.Model;
import com.driverstack.yunos.driver.device.PhysicalDevice;

public class ChinaTelecomSTBDriver extends AbstractDriver {

	public ChinaTelecomSTBDriver() {
		Model m = new Model("Huawei", "EC1308");
		supportedModels.add(m);

	}

	@Override
	public PhysicalDevice createDevice(DeviceInfo info) {
		ChinaTelecomSTB dev = new ChinaTelecomSTB();
		return dev;
	}

	@Override
	public String getOrganizationId() {

		return "7eggs.com";
	}

	@Override
	public String getDriverId() {

		return "Huawei-STB-EC1308";
	}

	@Override
	public String getVersion() {

		return "0.1";
	}
}
