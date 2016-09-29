package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.ExecutionEnvironment;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;

public class RcSwitchPD extends AbstractPhysicalDevice {

	private Config config;

	@Override
	public void init(ExecutionEnvironment executionEnvironment, Object config) {

		super.init(executionEnvironment, config);

		this.config = (Config) config;

		createFD();
	}

	private void createFD() {
		FunctionalDevice fd = new RcSwitchFD(config);

		functionalDevices.add(fd);
	}

}
