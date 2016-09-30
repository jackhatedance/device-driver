package com._7eggs.arduino.tranmitter;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface MultifunctionTransmitter extends FunctionalDevice {

	void transmitIR(String type, long code, int bits, int repeat);

	void transmitRF(int mhz, int pulseLength, long code, int bits);
}
