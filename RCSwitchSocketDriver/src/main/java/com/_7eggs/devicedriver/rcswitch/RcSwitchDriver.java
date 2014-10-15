package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.ExecutionEnvironment;
import com.driverstack.yunos.driver.AbstractDriver;
import com.driverstack.yunos.driver.device.DeviceInfo;
import com.driverstack.yunos.driver.device.PhysicalDevice;

public class RcSwitchDriver extends AbstractDriver {

	public RcSwitchDriver() {

	}

	@Override
	public PhysicalDevice createDevice(ExecutionEnvironment executionEnvironment,DeviceInfo info) {
		RcSwitchPD dev = new RcSwitchPD();

		dev.init(executionEnvironment,info.getConfigure());

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
