package com._7eggs.devicedriver.legacyOnOffDevice;

import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.FunctionalDevice;

public class PD extends AbstractPhysicalDevice {

	private Config config;

	@Override
	public void init(Object config) {

		super.init(config);

		this.config = (Config) config;

		createFD();
	}

	private void createFD() {
		FunctionalDevice fd = new FD(config);

		functionalDevices.add(fd);
	}

}
