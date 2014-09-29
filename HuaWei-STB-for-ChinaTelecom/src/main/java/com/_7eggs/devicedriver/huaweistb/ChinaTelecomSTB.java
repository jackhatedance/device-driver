package com._7eggs.devicedriver.huaweistb;

import com.driverstack.yunos.deviceApi.transmitter.IrTransmitterV1_0;
import com.driverstack.yunos.deviceApi.tv.TV;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;

public class ChinaTelecomSTB extends AbstractPhysicalDevice implements TV {
	private IrTransmitterV1_0 controller;

	private static long CODE_CHANNEL[] = { 0x12345, 0x123456 };

	public ChinaTelecomSTB() {
		/*
		 * configure = new Configure();
		 * 
		 * configure.setBits(24); configure.setRepeat(1);
		 * configure.getControllerRef().setType(
		 * "com.driverstack.yunos.api.device.transmitter.IrTransmitter");
		 */
	}

	private Config getConfig() {
		return (Config) config;
	}

	public void setController(IrTransmitterV1_0 controller) {
		this.controller = controller;
	}

	@Override
	public void on() {
		transmit(-1);

	}

	@Override
	public void off() {
		transmit(-1);

	}

	@Override
	public void setVolume(int vol) {
		transmit(-1);

	}

	private void transmit(long code) {
		controller.transmit(IrTransmitterV1_0.TYPE_NEC, code, getConfig()
				.getBits(), getConfig().getRepeat());

	}

	@Override
	public void switchToChannel(int channel) {
		transmit(CODE_CHANNEL[channel]);

	}

}
