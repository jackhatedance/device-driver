package com._7eggs.devicedriver.legacyOnOffDevice;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "")
	private ElectricitySwitch controller;

	@Item(order = 2, defaultValue = "")
	private String scheduleOnAt;

	@Item(order = 3, defaultValue = "")
	private String scheduleOffAt;

	public ElectricitySwitch getController() {
		return controller;
	}

	public void setController(ElectricitySwitch controller) {
		this.controller = controller;
	}

	public String getScheduleOnAt() {
		return scheduleOnAt;
	}

	public void setScheduleOnAt(String scheduleOnAt) {
		this.scheduleOnAt = scheduleOnAt;
	}

	public String getScheduleOffAt() {
		return scheduleOffAt;
	}

	public void setScheduleOffAt(String scheduleOffAt) {
		this.scheduleOffAt = scheduleOffAt;
	}

}
