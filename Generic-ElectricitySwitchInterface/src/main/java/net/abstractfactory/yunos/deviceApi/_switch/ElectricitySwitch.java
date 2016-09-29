package net.abstractfactory.yunos.deviceApi._switch;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface ElectricitySwitch extends FunctionalDevice{
	void on();
	void off();
}
