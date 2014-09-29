package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.driver.AbstractDriver;
import com.driverstack.yunos.driver.device.DeviceInfo;
import com.driverstack.yunos.driver.device.Model;
import com.driverstack.yunos.driver.device.PhysicalDevice;
import com.google.gson.Gson;

public class RcSwitchDriver extends AbstractDriver {

	public RcSwitchDriver() {

	}

	@Override
	public PhysicalDevice createDevice(DeviceInfo info) {
		RcSwitchPD dev = new RcSwitchPD();

		Gson gson = new Gson();
		Config conf = gson.fromJson(info.getConfigure().toString(),
				Config.class);

		dev.setConfigure(conf);

		dev.init();

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
