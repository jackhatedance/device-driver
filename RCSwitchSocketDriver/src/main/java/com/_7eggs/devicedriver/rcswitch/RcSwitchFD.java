package com._7eggs.devicedriver.rcswitch;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.transmitter.RfTransmitter;

public class RcSwitchFD implements ElectricitySwitch {
	private Config config;
	private RfTransmitter controller;

	public RcSwitchFD(Config config) {
		this.config = config;

		this.controller = config.getController();
	}

	@Override
	public void on() {

		controller.transmit(RfTransmitter.FREQUENCY_433,
				config.getPulseLength(), config.getCodeOn(), config.getBits());
	}

	@Override
	public void off() {
		controller.transmit(RfTransmitter.FREQUENCY_433,
				config.getPulseLength(), config.getCodeOff(), config.getBits());

	}

}
