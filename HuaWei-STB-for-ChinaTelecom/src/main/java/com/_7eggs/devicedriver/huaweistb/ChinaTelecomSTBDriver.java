package com._7eggs.devicedriver.huaweistb;

import com.driverstack.yunos.device.DeviceInfo;
import com.driverstack.yunos.device.Model;
import com.driverstack.yunos.device.PhysicalDevice;
import com.driverstack.yunos.driver.AbstractDriver;

public class ChinaTelecomSTBDriver extends AbstractDriver {

	public ChinaTelecomSTBDriver() {
		Model m = new Model("Huawei", "Set Top Box", "EC1308");
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
