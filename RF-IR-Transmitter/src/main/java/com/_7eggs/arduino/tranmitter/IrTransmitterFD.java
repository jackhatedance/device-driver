package com._7eggs.arduino.tranmitter;

import com.driverstack.yunos.device.DeviceApi;

public class IrTransmitterFD implements
		com.driverstack.yunos.deviceApi.transmitter.IrTransmitterV1_0 {

	private DeviceApi deviceApi;

	private IrRfTransmitterPD pdo;

	public IrTransmitterFD(IrRfTransmitterPD pdo) {
		this.pdo = pdo;

		deviceApi = new DeviceApi(brand, category, name);
	}

	@Override
	public DeviceApi getApi() {

		return deviceApi;
	}

	@Override
	public String getApiVersion() {

		return version;
	}

	@Override
	public void transmit(String type, long code, int bits, int repeat) {
		pdo.transmitIR(type, code, bits, repeat);
	}
}
