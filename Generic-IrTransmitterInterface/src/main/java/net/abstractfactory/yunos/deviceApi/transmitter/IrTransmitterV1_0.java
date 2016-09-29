package net.abstractfactory.yunos.deviceApi.transmitter;

import com.driverstack.yunos.driver.device.FunctionalDevice;

public interface IrTransmitterV1_0 extends FunctionalDevice {

	static final String TYPE_SHARP = "Sharp";
	static final String TYPE_NEC = "Nec";
	static final String TYPE_SONY = "Sony";

	void transmit(String type, long code, int bits, int repeat);
}
