package com._7eggs.devicedriver.legacyOnOffDevice;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.AbstractDriver;
import net.abstractfactory.yunos.driver.device.DeviceInfo;
import net.abstractfactory.yunos.driver.device.PhysicalDevice;

public class Driver extends AbstractDriver {

	public Driver() {

	}

	@Override
	public PhysicalDevice createDevice(
			ExecutionEnvironment executionEnvironment, DeviceInfo info) {
		PD dev = new PD();

		dev.init(executionEnvironment, info.getConfigure());

		return dev;
	}

	@Override
	public String getOrganizationId() {

		return null;
	}

	@Override
	public Class getConfigureClass() {
		return Config.class;
	}

	@Override
	public String getArtifactId() {

		return null;
	}

	@Override
	public String getVersion() {

		return null;
	}
}
