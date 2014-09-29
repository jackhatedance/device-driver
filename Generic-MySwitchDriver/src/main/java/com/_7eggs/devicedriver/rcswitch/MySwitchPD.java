package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.deviceApi.transmitter.MySwitch;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.FunctionalDevice;

public class MySwitchPD extends AbstractPhysicalDevice {

	private Config config;

	public MySwitchPD() {

	}

	@Override
	public Config getConfigure() {
		return config;
	}

	public void setConfigure(Object configure) {
		this.config = (Config) configure;

	}

	public void init() {

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
