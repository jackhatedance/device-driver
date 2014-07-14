package com._7eggs.arduino.tranmitter;

import java.util.List;

import com.deviceyun.yunos.api.device.DeviceApi;
import com.deviceyun.yunos.api.device.DeviceInfo;
import com.deviceyun.yunos.api.device.FunctionalDevice;
import com.deviceyun.yunos.api.device.Model;
import com.deviceyun.yunos.api.driver.AbstractDriver;
import com.deviceyun.yunos.api.driver.ConfigItem;

public class IrRfTransmitterDriver extends AbstractDriver {

	public IrRfTransmitterDriver() {
		Model m = new Model("7eggs", "7eggs multifunction transmitter",
				"IR RF433 transmitter");
		supportedModels.add(m);
	}

	@Override
	public void install(DeviceInfo info) {

	}

	@Override
	public FunctionalDevice createDevice(DeviceInfo info) {
		IrRfTransmitter dev = new IrRfTransmitter();
		return dev;
	}

	@Override
	public List<ConfigItem> getConfigItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceApi getFunctionalDeviceApi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFunctionalDeviceApiVersion() {
		// TODO Auto-generated method stub
		return null;
	}
}
