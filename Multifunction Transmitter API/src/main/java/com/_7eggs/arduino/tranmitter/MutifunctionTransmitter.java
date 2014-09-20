package com._7eggs.arduino.tranmitter;

import com.driverstack.yunos.device.FunctionalDevice;

public interface MutifunctionTransmitter extends FunctionalDevice {

	void transmitIR(String type, long code, int bits, int repeat);

	void transmitRF(int mhz, int pulseLength, long code, int bits);
}
