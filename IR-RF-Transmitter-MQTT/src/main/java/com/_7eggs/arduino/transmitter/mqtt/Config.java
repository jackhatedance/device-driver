package com._7eggs.arduino.transmitter.mqtt;

import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "")
	private String mqttClientId;

	public String getMqttClientId() {
		return mqttClientId;
	}

	public void setMqttClientId(String mqttClientId) {
		this.mqttClientId = mqttClientId;
	}
	
	
}
