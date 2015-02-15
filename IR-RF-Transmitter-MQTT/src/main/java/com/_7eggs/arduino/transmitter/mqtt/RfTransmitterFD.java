package com._7eggs.arduino.transmitter.mqtt;

import com.driverstack.yunos.deviceApi.transmitter.RfTransmitter;


public class RfTransmitterFD implements RfTransmitter {

	private IrRfTransmitterPD pdo;

 
	public RfTransmitterFD(IrRfTransmitterPD pdo) {
		this.pdo = pdo;

	}

	public void transmit(int frequency, int pulseLength, long code, int bits) {
		pdo.transmitRF(frequency, pulseLength, code, bits);
	}

}
