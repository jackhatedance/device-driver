package com._7eggs.arduino.tranmitter;

import net.abstractfactory.yunos.driver.config.annotation.Configure;
import net.abstractfactory.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {
	@Item(order = 1, defaultValue = "http://www.example.com/")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
