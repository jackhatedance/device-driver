package com._7eggs.arduino.tranmitter;

import java.util.HashMap;
import java.util.Map;

import com.deviceyun.yunos.api.device.AbstractDevice;
import com.deviceyun.yunos.api.device.DeviceApi;
import com.deviceyun.yunos.device.HttpClient;
import com.deviceyun.yunos.device.HttpClientImpl;

public class IrRfTransmitter extends AbstractDevice implements
		MutifunctionTransmitterV1_0 {

	private DeviceApi deviceApi;
	private String version;

	private HttpClient httpClient;
	private Configure configure;

	public IrRfTransmitter() {
		deviceApi = new DeviceApi("7eggs", "Transmitter",
				"MultifunctionTransmitter");
		version = "0.1";

		configure = new Configure();
	}

	@Override
	public Object getConfigure() {

		return configure;
	}

	public void setConfigure(Object configure) {
		this.configure = this.configure;
	}

	public void init() {
		httpClient = new HttpClientImpl(configure.getHost(),
				configure.getPort());
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
	public void transmitIR(String type, long code, int bits, int repeat) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("type", type);
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));
		map.put("repeat", String.valueOf(repeat));

		httpClient.get(map);

	}

	@Override
	public void transmitRF(int mhz, int pulseLength, long code, int bits) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("mhz", String.valueOf(mhz));
		map.put("pulseLength", String.valueOf(pulseLength));
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));

		httpClient.get(map);

	}

}
