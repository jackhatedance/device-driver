package com._7eggs.arduino.tranmitter;

import net.abstractfactory.yunos.deviceApi.transmitter.IrTransmitterV1_0;

public class IrTransmitterFD implements
		IrTransmitterV1_0 {

	private IrRfTransmitterPD pdo;



	public IrTransmitterFD(IrRfTransmitterPD pdo) {
		this.pdo = pdo;

	}

	@Override
	public void transmit(String type, long code, int bits, int repeat) {
		pdo.transmitIR(type, code, bits, repeat);
	}

}
