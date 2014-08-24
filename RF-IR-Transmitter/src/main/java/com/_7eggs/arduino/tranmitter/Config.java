package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.driver.config.annotation.Configure;
import com.deviceyun.yunos.driver.config.annotation.Item;

@Configure(resourceFile="config/config",supportedlocales = {
		"en_US", "zh_CN" })
public class Config {
	@Item
	private String host;
	@Item
	private int port;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
