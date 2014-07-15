package com._7eggs.arduino.tranmitter;

import java.util.HashMap;
import java.util.Map;

import com.deviceyun.yunos.api.device.AbstractDevice;
import com.deviceyun.yunos.api.device.DeviceApi;
import com.deviceyun.yunos.api.device.transmitter.Rf433Transmitter;
import com.deviceyun.yunos.device.HttpClient;
import com.deviceyun.yunos.device.HttpClientImpl;

public class IrRfTransmitter extends AbstractDevice implements Rf433Transmitter {

	private DeviceApi deviceApi;
	private String version;

	private HttpClient httpClient;
	private Configure configure;

	public IrRfTransmitter() {
		deviceApi = new DeviceApi("7eggs", "transmitter", "IrRfTransmitter");
		version = "0.1";

		configure = new Configure();
	}

	@Override
	public Object getConfigure() {

		return configure;
	}

	public void init() {
		httpClient = new HttpClientImpl(configure.getHost(),
				configure.getPort());
	}

	@Override
	public void transmit(int pulseLength, long code, int bits) {
		System.out.println(String.format("transmit RF433: %d,%d,%d",
				pulseLength, code, bits));

		Map<String, String> map = new HashMap<String, String>();

		map.put("pulseLength", String.valueOf(pulseLength));
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));

		httpClient.get(map);
	}

	@Override
	public DeviceApi getApi() {
		return deviceApi;
	}

	@Override
	public String getApiVersion() {
		return version;
	}

}
