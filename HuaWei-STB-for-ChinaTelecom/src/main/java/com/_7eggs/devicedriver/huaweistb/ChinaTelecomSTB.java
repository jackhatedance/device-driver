package com._7eggs.devicedriver.huaweistb;

import com.driverstack.yunos.device.AbstractPhysicalDevice;
import com.driverstack.yunos.device.DeviceApi;
import com.driverstack.yunos.deviceApi.transmitter.IrTransmitterV1_0;
import com.driverstack.yunos.deviceApi.tv.TV;

public class ChinaTelecomSTB extends AbstractPhysicalDevice implements TV {
	private IrTransmitterV1_0 controller;
	private Configure configure;

	private static long CODE_CHANNEL[] = { 0x12345, 0x123456 };

	public ChinaTelecomSTB() {

		configure = new Configure();

		configure.setBits(24);
		configure.setRepeat(1);
		configure.getControllerRef().setType(
				"com.driverstack.yunos.api.device.transmitter.IrTransmitter");
	}

	public void setController(IrTransmitterV1_0 controller) {
		this.controller = controller;
	}

	@Override
	public DeviceApi getApi() {

		return null;
	}

	@Override
	public String getApiVersion() {
		return "1.0";
	}

	@Override
	public void on() {
		transmit(-1);

	}

	@Override
	public void off() {
		transmit(-1);

	}

	@Override
	public void setVolume(int vol) {
		transmit(-1);

	}

	private void transmit(long code) {
		controller.transmit(IrTransmitterV1_0.TYPE_NEC, code, configure.getBits(),
				configure.getRepeat());

	}

	@Override
	public void switchToChannel(int channel) {
		transmit(CODE_CHANNEL[channel]);

	}

	@Override
	public Object getConfigure() {

		return configure;
	}

	@Override
	public void setConfigure(Object arg0) {
		// TODO Auto-generated method stub

	}
}
