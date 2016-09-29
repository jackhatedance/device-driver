package com._7eggs.devicedriver.huaweistb;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.AbstractDriver;
import net.abstractfactory.yunos.driver.device.DeviceInfo;
import net.abstractfactory.yunos.driver.device.Model;
import net.abstractfactory.yunos.driver.device.PhysicalDevice;

public class ChinaTelecomSTBDriver extends AbstractDriver {

	public ChinaTelecomSTBDriver() {
		Model m = new Model("Huawei", "EC1308");
		supportedModels.add(m);

	}

	@Override
	public PhysicalDevice createDevice(ExecutionEnvironment executionEnvironment,DeviceInfo info) {
		ChinaTelecomSTB dev = new ChinaTelecomSTB();
		return dev;
	}

	@Override
	public String getOrganizationId() {

		return "7eggs.com";
	}

	@Override
	public String getArtifactId() {

		return "Huawei-STB-EC1308";
	}

	@Override
	public String getVersion() {

		return "0.1";
	}
}
