package com._7eggs.devicedriver.light;

import com.driverstack.yunos.deviceApi.light.SimpleLight;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;

import net.abstractfactory.yunos.deviceApi._switch.ElectricitySwitch;

public class MyLight extends AbstractPhysicalDevice implements SimpleLight {
	ElectricitySwitch controller;

	@Override
	public void on() {
		controller.on();

	}

	@Override
	public void off() {
		controller.off();

	}

	public void setController(ElectricitySwitch controller) {
		this.controller = controller;
	}

}
