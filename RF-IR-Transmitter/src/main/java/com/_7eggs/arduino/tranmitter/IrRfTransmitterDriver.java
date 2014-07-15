package com._7eggs.arduino.tranmitter;

import com.deviceyun.yunos.api.device.DeviceInfo;
import com.deviceyun.yunos.api.device.FunctionalDevice;
import com.deviceyun.yunos.api.device.Model;
import com.deviceyun.yunos.api.driver.AbstractDriver;

public class IrRfTransmitterDriver extends AbstractDriver {

	public IrRfTransmitterDriver() {
		Model m = new Model("7eggs", "Multifunction Transmitter", "IR-RF433");
		supportedModels.add(m);

	}

	@Override
	public FunctionalDevice createDevice(DeviceInfo info) {
		IrRfTransmitter dev = new IrRfTransmitter();
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
