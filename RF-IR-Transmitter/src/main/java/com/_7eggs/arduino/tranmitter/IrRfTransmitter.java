package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.api.device.AbstractDevice;
import com.deviceyun.yunos.api.device.DeviceApi;
import com.deviceyun.yunos.api.device.transmitter.IrTransmitter;
import com.deviceyun.yunos.api.device.transmitter.Rf315Transmitter;
import com.deviceyun.yunos.api.device.transmitter.Rf433Transmitter;
import com.deviceyun.yunos.device.HttpClient;

public class IrRfTransmitter extends AbstractDevice implements
		Rf433Transmitter, Rf315Transmitter, IrTransmitter {

	private HttpClient httpClient;

	@Override
	public void transmit(int pulseLength, long code, int bits) {
		System.out.println(String.format("transmit RF433: %d,%d,%d",
				pulseLength, code, bits));

		// httpClient.get(null);

	}

	@Override
	public void transmit(String command, long code, int bits, int repeat) {
		System.out.println(String.format("transmit IR: %s,%d,%d", command,
				code, bits));

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
