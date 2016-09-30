package com._7eggs.devicedriver.rcswitch;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.device.AbstractPhysicalDevice;
import net.abstractfactory.yunos.driver.device.FunctionalDevice;

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
