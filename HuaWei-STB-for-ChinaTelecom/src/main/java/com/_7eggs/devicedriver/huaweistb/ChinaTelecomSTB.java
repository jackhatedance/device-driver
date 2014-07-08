package com._7eggs.devicedriver.huaweistb;

import com.deviceyun.smarthome.api.device.AbstractDevice;
import com.deviceyun.smarthome.api.device.Api;
import com.deviceyun.smarthome.api.device.transmitter.IrTransmitter;
import com.deviceyun.smarthome.api.device.tv.TV;

public class ChinaTelecomSTB extends AbstractDevice implements TV {
	private IrTransmitter controller;

	private static long CODE_CHANNEL[] = { 0x12345, 0x123456 };

	public ChinaTelecomSTB() {
		configure.put("bits", 24);
		configure.put("repeat", 1);
	}

	public void setController(IrTransmitter controller) {
		this.controller = controller;
	}

	@Override
	public Api getApi() {

		return null;
	}

	@Override
	public String getApiVersion() {
		return "1.0";
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToChannel(int channel) {
		controller.transmit(IrTransmitter.TYPE_NEC, CODE_CHANNEL[channel],
				configure.getInt("bits"), configure.getInt("repeat"));

	}
}
