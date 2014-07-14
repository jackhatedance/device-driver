package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.api.device.AbstractDevice;
import com.deviceyun.yunos.api.device.DeviceApi;
import com.deviceyun.yunos.api.device.transmitter.Rf433Transmitter;
import com.deviceyun.yunos.device.HttpClient;

public class IrRfTransmitter extends AbstractDevice implements Rf433Transmitter {

	private HttpClient httpClient;

	@Override
	public void transmit(int pulseLength, long code, int bits) {
		System.out.println(String.format("transmit RF433: %d,%d,%d",
				pulseLength, code, bits));

		// httpClient.get(null);

	}

	@Override
	public DeviceApi getApi() {
		return new DeviceApi("7eggs", "transmitter", "IrRfTransmitter");
	}

	@Override
	public String getApiVersion() {

		return "1.0";
	}

}
