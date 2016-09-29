package net.abstractfactory.yunos.deviceApi.transmitter;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface MySwitch extends FunctionalDevice {

	void on();
	void off();
}
