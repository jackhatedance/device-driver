package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.api.device.FunctionalDevice;

public interface MutifunctionTransmitterV1_0 extends FunctionalDevice {

	void transmitIR(String type, long code, int bits, int repeat);

	void transmitRF(int mhz, int pulseLength, long code, int bits);
}
