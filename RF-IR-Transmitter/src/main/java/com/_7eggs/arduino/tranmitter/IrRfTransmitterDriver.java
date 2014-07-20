package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.device.DeviceInfo;
import com.deviceyun.yunos.device.FunctionalDevice;
import com.deviceyun.yunos.device.Model;
import com.deviceyun.yunos.driver.AbstractDriver;
import com.google.gson.Gson;

public class IrRfTransmitterDriver extends AbstractDriver {

	public IrRfTransmitterDriver() {
		Model m = new Model("7eggs", "Multifunction Transmitter", "IR-RF433");
		supportedModels.add(m);

	}

	@Override
	public FunctionalDevice createDevice(DeviceInfo info) {
		IrRfTransmitter dev = new IrRfTransmitter();

		Gson gson = new Gson();
		Configure conf = gson.fromJson(info.getConfigure().toString(),
				Configure.class);

		dev.setConfigure(conf);
		
		System.out.println("host:"+conf.getHost());

		dev.init();

		return dev;
	}

	@Override
	public String getOrganizationId() {

		return "7eggs.com";
	}

	@Override
	public String getDriverId() {

		return "arduino rf&ir tranmitter driver";
	}

	@Override
	public String getVersion() {

		return "0.1";
	}
}
