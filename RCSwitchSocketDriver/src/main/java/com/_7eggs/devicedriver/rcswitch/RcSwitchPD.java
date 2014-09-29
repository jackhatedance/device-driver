package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.transmitter.RfTransmitter;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.FunctionalDevice;

public class RcSwitchPD extends AbstractPhysicalDevice {

	private Config config;
	private RfTransmitter controller;

	public RcSwitchPD() {

	}

	@Override
	public Config getConfigure() {
		return config;
	}

	public void setConfigure(Object configure) {
		this.config = (Config) configure;
		this.controller = config.getController();
	}

	public void init() {

		// Rf433SwitchFD fd = new Rf433SwitchFD(this);
		FunctionalDevice fd = new ElectricitySwitch() {

			@Override
			public void on() {

				controller.transmit(RfTransmitter.FREQUENCY_433,
						config.getPulseLength(), config.getCodeOn(),
						config.getBits());

			}

			@Override
			public void off() {

				controller.transmit(RfTransmitter.FREQUENCY_433,
						config.getPulseLength(), config.getCodeOff(),
						config.getBits());
			}
		};

		functionalDevices.add(fd);
	}

}
