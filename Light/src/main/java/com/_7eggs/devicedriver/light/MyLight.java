package com._7eggs.devicedriver.light;



import net.abstractfactory.yunos.deviceApi._switch.ElectricitySwitch;
import net.abstractfactory.yunos.deviceApi.light.SimpleLight;
import net.abstractfactory.yunos.driver.device.AbstractPhysicalDevice;

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
