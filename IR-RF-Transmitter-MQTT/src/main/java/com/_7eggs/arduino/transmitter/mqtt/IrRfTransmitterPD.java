package com._7eggs.arduino.transmitter.mqtt;

import java.util.HashMap;
import java.util.Map;

import com.driverstack.yunos.ExecutionEnvironment;
import com.driverstack.yunos.driver.device.AbstractPhysicalDevice;
import com.driverstack.yunos.driver.device.DeviceInfo;

public class IrRfTransmitterPD extends AbstractPhysicalDevice {

	private String mqttClientId;

	public IrRfTransmitterPD() {

	}

	@Override
	public void init(ExecutionEnvironment executionEnvironment,
			DeviceInfo deviceInfo) {

		super.init(executionEnvironment, deviceInfo);

		Config myConfig = (Config) config;

		mqttClientId = deviceInfo.getId();
		// override by configuration value if set.
		if (myConfig.getMqttClientId() != null
				&& !myConfig.getMqttClientId().trim().isEmpty())
			mqttClientId = myConfig.getMqttClientId().trim();

		createFD();

	}

	public void createFD() {

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

		executionEnvironment.getMqttService().call(mqttClientId, map);

	}

	public void transmitRF(int frequency, int pulseLength, long code, int bits) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("cmd", "RCSwitch");
		map.put("frequency", String.valueOf(frequency));
		map.put("pulseLength", String.valueOf(pulseLength));
		map.put("code", String.valueOf(code));
		map.put("bits", String.valueOf(bits));

		executionEnvironment.getMqttService().call(mqttClientId, map);

	}

}
