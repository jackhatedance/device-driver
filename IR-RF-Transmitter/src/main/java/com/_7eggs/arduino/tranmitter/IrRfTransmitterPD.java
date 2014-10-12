package com._7eggs.arduino.tranmitter;

import java.util.HashMap;
import java.util.Map;

import com.driverstack.yunos.ExecutionEnvironment;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.net.http.HttpClient;

public class IrRfTransmitterPD extends AbstractPhysicalDevice {

	private HttpClient httpClient;
	private Config config;

	private String url;
	
	public IrRfTransmitterPD() {

	}

	@Override
	public void init(ExecutionEnvironment executionEnvironment, Object config) {

		super.init(executionEnvironment, config);

		this.config = (Config) config;

		createFD();
	}

	public void createFD() {

		url=config.getUrl();
		
		IrTransmitterFD it = new IrTransmitterFD(this);
		functionalDevices.add(it);

		RfTransmitterFD rt = new RfTransmitterFD(this);
		functionalDevices.add(rt);
	}

	public void transmitIR(String type, long code, int bits, int repeat) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("cmd", "IR");
		map.put("type", type);
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));
		map.put("repeat", String.valueOf(repeat));

		executionEnvironment.getHttpClient().get(url, map);
		

	}

	public void transmitRF(int frequency, int pulseLength, long code, int bits) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("cmd", "RCSwitch");
		map.put("frequency", String.valueOf(frequency));
		map.put("pulseLength", String.valueOf(pulseLength));
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));

		executionEnvironment.getHttpClient().get(url, map);
		
	}

}
