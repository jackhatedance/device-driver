package com._7eggs.devicedriver.light;

import com.driverstack.yunos.device.AbstractPhysicalDevice;
import com.driverstack.yunos.device.DeviceApi;
import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.light.SimpleLight;

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
	public DeviceApi getApi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getApiVersion() {
		// TODO Auto-generated method stub
		return null;
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
