package net.abstractfactory.yunos.device.api.generic.switch_;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface ElectricitySwitch extends FunctionalDevice{
	void on();
	void off();
}
