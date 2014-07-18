package com._7eggs.devicedriver.huaweistb;

import com.deviceyun.yunos.device.DeviceInfo;
import com.deviceyun.yunos.device.FunctionalDevice;
import com.deviceyun.yunos.device.Model;
import com.deviceyun.yunos.driver.AbstractDriver;

public class ChinaTelecomSTBDriver extends AbstractDriver {

	public ChinaTelecomSTBDriver() {
		Model m = new Model("Huawei", "Set Top Box", "EC1308");
		supportedModels.add(m);

	}

	@Override
	public FunctionalDevice createDevice(DeviceInfo info) {
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
