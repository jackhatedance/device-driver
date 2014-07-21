package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.device.DeviceApi;
import com.deviceyun.yunos.deviceApi.transmitter.RfTransmitterV1_0;

public class RfTransmitterFD implements RfTransmitterV1_0 {

	private DeviceApi deviceApi;

	private IrRfTransmitterPD pdo;

	public RfTransmitterFD(IrRfTransmitterPD pdo) {
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

	public void transmit(int frequency, int pulseLength, long code, int bits) {
		pdo.transmitRF(frequency, pulseLength, code, bits);
	};

}
