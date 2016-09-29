package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.driver.config.annotation.Configure;
import com.driverstack.yunos.driver.config.annotation.Item;

import net.abstractfactory.yunos.deviceApi.transmitter.RfTransmitter;

@Configure(resourceFile = "config/config", supportedlocales = { "en_US",
		"zh_CN" })
public class Config {

	@Item(order = 1, defaultValue = "433")
	private int frequency;
	@Item(order = 2, defaultValue = "0")
	private int pulseLength;
	@Item(order = 3, defaultValue = "0")
	private long codeOn;
	@Item(order = 4, defaultValue = "0")
	private long codeOff;
	@Item(order = 5, defaultValue = "0")
	private int bits;
	@Item(order = 6, defaultValue = "")
	private RfTransmitter controller;

	public int getPulseLength() {
		return pulseLength;
	}

	public void setPulseLength(int pulseLength) {
		this.pulseLength = pulseLength;
	}

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

	public int getBits() {
		return bits;
	}

	public void setBits(int bits) {
		this.bits = bits;
	}

	public RfTransmitter getController() {
		return controller;
	}

	public void setController(RfTransmitter controller) {
		this.controller = controller;
	}

}
