package com._7eggs.arduino.tranmitter;

import com.driverstack.yunos.driver.AbstractDriver;
import com.driverstack.yunos.driver.device.DeviceInfo;
import com.driverstack.yunos.driver.device.Model;
import com.driverstack.yunos.driver.device.PhysicalDevice;
import com.google.gson.Gson;

public class IrRfTransmitterDriver extends AbstractDriver {

	public IrRfTransmitterDriver() {
		Model m = new Model("7eggs", "IR-RF433");
		supportedModels.add(m);

	}

	@Override
	public PhysicalDevice createDevice(DeviceInfo info) {
		IrRfTransmitterPD dev = new IrRfTransmitterPD();

		Gson gson = new Gson();
		Config conf = gson.fromJson(info.getConfigure().toString(),
				Config.class);

		dev.setConfigure(conf);

		System.out.println("host:" + conf.getHost());

		dev.init();

		return dev;
	}

	@Override
	public String getOrganizationId() {

		return "7eggs.com";
	}

	@Override
	public Class getConfigureClass() {		
		return Config.class;
	}
	
	@Override
	public String getArtifactId() {

		return "arduino rf&ir tranmitter driver";
	}

	@Override
	public String getVersion() {

		return "0.1";
	}
}