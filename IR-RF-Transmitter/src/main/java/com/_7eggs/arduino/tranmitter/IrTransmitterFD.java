package com._7eggs.arduino.tranmitter;

public class IrTransmitterFD implements
		com.driverstack.yunos.deviceApi.transmitter.IrTransmitterV1_0 {

	private IrRfTransmitterPD pdo;



	public IrTransmitterFD(IrRfTransmitterPD pdo) {
		this.pdo = pdo;

	}

	@Override
	public void transmit(String type, long code, int bits, int repeat) {
		pdo.transmitIR(type, code, bits, repeat);
	}

}
