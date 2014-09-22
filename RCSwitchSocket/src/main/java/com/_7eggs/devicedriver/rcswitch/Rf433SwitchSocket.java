package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.transmitter.RfTransmitterV1_0;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;

public class Rf433SwitchSocket extends AbstractPhysicalDevice implements
		ElectricitySwitch {
	private RfTransmitterV1_0 controller;

	private int pulseLength = 166;
	private long codeOn = 123;
	private long codeOff = 456;
	private int bits = 24;

	@Override
	public void on() {

		controller.transmit(RfTransmitterV1_0.FREQUENCY_433, pulseLength,
				codeOn, bits);

	}

	@Override
	public void off() {
		controller.transmit(RfTransmitterV1_0.FREQUENCY_433, pulseLength,
				codeOff, bits);
	}

	public void setController(RfTransmitterV1_0 controller) {
		this.controller = controller;
	}

	@Override
	public Object getConfigure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfigure(Object configure) {
		// TODO Auto-generated method stub

	}

}
