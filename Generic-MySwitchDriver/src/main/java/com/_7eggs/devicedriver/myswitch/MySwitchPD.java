package com._7eggs.devicedriver.myswitch;

import com.driverstack.yunos.deviceApi.transmitter.MySwitch;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.FunctionalDevice;

public class MySwitchPD extends AbstractPhysicalDevice {

	private Config config;

	public MySwitchPD() {

	}

	@Override
	public void init(Object config) {

		super.init(config);

		this.config = (Config) config;
		createFD();
	}

	public void createFD() {

		FunctionalDevice fd = new MySwitch() {

			@Override
			public void on() {

			}

			@Override
			public void off() {

			}
		};

		functionalDevices.add(fd);
	}

}
