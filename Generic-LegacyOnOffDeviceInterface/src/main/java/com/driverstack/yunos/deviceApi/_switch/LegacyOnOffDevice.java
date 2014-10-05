package com.driverstack.yunos.deviceApi._switch;

import com.driverstack.yunos.driver.device.FunctionalDevice;

public interface LegacyOnOffDevice extends FunctionalDevice{
	void on();
	void off();
}
