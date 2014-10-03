package com._7eggs.devicedriver.myswitch;

import com.driverstack.yunos.driver.AbstractDriver;
import com.driverstack.yunos.driver.device.DeviceInfo;
import com.driverstack.yunos.driver.device.PhysicalDevice;

public class MySwitchDriver extends AbstractDriver {

	public MySwitchDriver() {

	}

	@Override
	public PhysicalDevice createDevice(DeviceInfo info) {
		MySwitchPD dev = new MySwitchPD();

		dev.init(info.getConfigure());

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
