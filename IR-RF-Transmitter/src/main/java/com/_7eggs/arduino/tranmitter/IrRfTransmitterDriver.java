package com._7eggs.arduino.tranmitter;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.AbstractDriver;
import net.abstractfactory.yunos.driver.device.DeviceInfo;
import net.abstractfactory.yunos.driver.device.Model;
import net.abstractfactory.yunos.driver.device.PhysicalDevice;

public class IrRfTransmitterDriver extends AbstractDriver {

	public IrRfTransmitterDriver() {
		Model m = new Model("7eggs", "IR-RF433");
		supportedModels.add(m);

	}

	@Override
	public PhysicalDevice createDevice(
			ExecutionEnvironment executionEnvironment, DeviceInfo info) {
		IrRfTransmitterPD dev = new IrRfTransmitterPD();

		dev.init(executionEnvironment, info.getConfigure());

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
