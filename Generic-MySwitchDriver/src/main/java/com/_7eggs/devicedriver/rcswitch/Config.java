package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "1")
	private long codeOn;
	@Item(order = 2, defaultValue = "2")
	private long codeOff;

	public long getCodeOn() {
		return codeOn;
	}

	public void setCodeOn(long codeOn) {
		this.codeOn = codeOn;
	}

	public long getCodeOff() {
		return codeOff;
	}

	public void setCodeOff(long codeOff) {
		this.codeOff = codeOff;
	}

}
