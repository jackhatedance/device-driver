package com._7eggs.devicedriver.myswitch;

import com.driverstack.yunos.deviceApi.transmitter.MySwitch;
import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "1")
	private long codeOn;
	@Item(order = 2, defaultValue = "2")
	private long codeOff;
	@Item(order = 3 )
	private MySwitch controller;

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

	public MySwitch getController() {
		return controller;
	}

	public void setController(MySwitch controller) {
		this.controller = controller;
	}

	 
}
