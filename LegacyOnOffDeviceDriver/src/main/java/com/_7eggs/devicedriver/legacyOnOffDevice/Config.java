package com._7eggs.devicedriver.legacyOnOffDevice;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "")
	private ElectricitySwitch controller;

	public ElectricitySwitch getController() {
		return controller;
	}

	public void setController(ElectricitySwitch controller) {
		this.controller = controller;
	}

}
