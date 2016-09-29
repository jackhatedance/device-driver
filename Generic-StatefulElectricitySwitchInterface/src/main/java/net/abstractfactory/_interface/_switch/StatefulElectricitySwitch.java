package net.abstractfactory._interface._switch;

import net.abstractfactory.yunos.device.api.generic.switch_.ElectricitySwitch;

public interface StatefulElectricitySwitch extends ElectricitySwitch {

	boolean isOn();
}
