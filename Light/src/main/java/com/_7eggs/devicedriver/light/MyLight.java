package com._7eggs.devicedriver.light;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.light.SimpleLight;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;

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

	@Override
	public Object getConfigure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfigure(Object arg0) {
		// TODO Auto-generated method stub

	}

	

}
