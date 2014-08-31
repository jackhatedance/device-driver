package com._7eggs.arduino.tranmitter;

import java.util.HashMap;
import java.util.Map;

import com.driverstack.yunos.device.AbstractPhysicalDevice;
import com.driverstack.yunos.device.utils.HttpClient;
import com.driverstack.yunos.device.utils.HttpClientImpl;

public class IrRfTransmitterPD extends AbstractPhysicalDevice {

	private HttpClient httpClient;
	private Config configure;

	public IrRfTransmitterPD() {
		// deviceApi = new DeviceApi("7eggs", "Transmitter",
		// "MultifunctionTransmitter");
		// version = "0.1";

	}

	@Override
	public Object getConfigure() {
		return configure;
	}

	public void setConfigure(Object configure) {
		this.configure = (Config) configure;
	}

	public void init() {
		httpClient = new HttpClientImpl(configure.getHost(),
				configure.getPort());

		IrTransmitterFD it = new IrTransmitterFD(this);
		functionalDevices.add(it);

		RfTransmitterFD rt = new RfTransmitterFD(this);
		functionalDevices.add(rt);
	}

	public void transmitIR(String type, long code, int bits, int repeat) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("type", type);
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));
		map.put("repeat", String.valueOf(repeat));

		httpClient.get(map);

	}

	public void transmitRF(int frequency, int pulseLength, long code, int bits) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("frequency", String.valueOf(frequency));
		map.put("pulseLength", String.valueOf(pulseLength));
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));

		httpClient.get(map);

	}

}
