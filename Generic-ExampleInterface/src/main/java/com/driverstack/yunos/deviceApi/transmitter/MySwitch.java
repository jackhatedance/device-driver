package com.driverstack.yunos.deviceApi.transmitter;

import com.driverstack.yunos.driver.device.FunctionalDevice;

public interface MySwitch extends FunctionalDevice {

	void on();
	void off();
}
