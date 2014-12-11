package com._7eggs.devicedriver.rcswitch;

import com.driverstack._interface._switch.StatefulElectricitySwitch;
import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;
import com.driverstack.yunos.deviceApi.transmitter.RfTransmitter;

public class RcSwitchFD implements StatefulElectricitySwitch {
	private Config config;
	private RfTransmitter controller;

	private boolean stateOn = false;

	public RcSwitchFD(Config config) {
		this.config = config;

		this.controller = config.getController();
	}

	@Override
	public void on() {

		controller.transmit(RfTransmitter.FREQUENCY_433,
				config.getPulseLength(), config.getCodeOn(), config.getBits());
		stateOn = true;
	}

	@Override
	public void off() {
		controller.transmit(RfTransmitter.FREQUENCY_433,
				config.getPulseLength(), config.getCodeOff(), config.getBits());
		stateOn = false;

	}

	@Override
	public boolean isOn() {

		return stateOn;
	}

}
