package net.abstractfactory.yunos.deviceApi._switch;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface LegacyOnOffDevice extends FunctionalDevice{
	void on();
	void off();
}
