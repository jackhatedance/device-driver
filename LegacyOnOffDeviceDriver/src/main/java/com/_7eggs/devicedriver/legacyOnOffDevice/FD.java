package com._7eggs.devicedriver.legacyOnOffDevice;

import net.abstractfactory.yunos.device.api.generic.switch_.ElectricitySwitch;
import net.abstractfactory.yunos.deviceApi._switch.LegacyOnOffDevice;

public class FD implements LegacyOnOffDevice {
	private Config config;
	private ElectricitySwitch controller;

	public FD(Config config) {
		this.config = config;

		this.controller = config.getController();
	}

	@Override
	public void on() {

		controller.on();
	}

	@Override
	public void off() {
		controller.off();

	}

}
