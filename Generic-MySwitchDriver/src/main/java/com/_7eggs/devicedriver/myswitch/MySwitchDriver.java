package com._7eggs.devicedriver.myswitch;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.AbstractDriver;
import net.abstractfactory.yunos.driver.device.DeviceInfo;
import net.abstractfactory.yunos.driver.device.PhysicalDevice;

public class MySwitchDriver extends AbstractDriver {

	public MySwitchDriver() {

	}

	@Override
	public PhysicalDevice createDevice(
			ExecutionEnvironment executionEnvironment, DeviceInfo info) {
		MySwitchPD dev = new MySwitchPD();

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
