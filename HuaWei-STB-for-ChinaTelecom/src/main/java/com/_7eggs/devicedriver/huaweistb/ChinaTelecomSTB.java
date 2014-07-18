package com._7eggs.devicedriver.huaweistb;

import com.deviceyun.yunos.device.AbstractDevice;
import com.deviceyun.yunos.device.DeviceApi;
import com.deviceyun.yunos.deviceApi.transmitter.IrTransmitter;
import com.deviceyun.yunos.deviceApi.tv.TV;

public class ChinaTelecomSTB extends AbstractDevice implements TV {
	private IrTransmitter controller;
	private Configure configure;

	private static long CODE_CHANNEL[] = { 0x12345, 0x123456 };

	public ChinaTelecomSTB() {

		configure = new Configure();

		configure.setBits(24);
		configure.setRepeat(1);
		configure.getControllerRef().setType(
				"com.deviceyun.yunos.api.device.transmitter.IrTransmitter");
	}

	public void setController(IrTransmitter controller) {
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
		controller.transmit(IrTransmitter.TYPE_NEC, code, configure.getBits(),
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
