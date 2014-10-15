package com._7eggs.devicedriver.legacyOnOffDevice;

import com.driverstack.yunos.ExecutionEnvironment;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.FunctionalDevice;

public class PD extends AbstractPhysicalDevice {

	private Config config;

	@Override
	public void init(ExecutionEnvironment executionEnvironment,Object config) {

		super.init(executionEnvironment,config);

		this.config = (Config) config;

		createFD();
	}

	private void createFD() {
		FunctionalDevice fd = new FD(config);

		functionalDevices.add(fd);
	}

}
