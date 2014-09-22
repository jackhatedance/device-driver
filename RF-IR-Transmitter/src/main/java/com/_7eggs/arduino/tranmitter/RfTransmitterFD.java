package com._7eggs.arduino.tranmitter;

import com.driverstack.yunos.deviceApi.transmitter.RfTransmitterV1_0;

public class RfTransmitterFD implements RfTransmitterV1_0 {

	private IrRfTransmitterPD pdo;

	public RfTransmitterFD(IrRfTransmitterPD pdo) {
		this.pdo = pdo;

	}

	public void transmit(int frequency, int pulseLength, long code, int bits) {
		pdo.transmitRF(frequency, pulseLength, code, bits);
	}

}
