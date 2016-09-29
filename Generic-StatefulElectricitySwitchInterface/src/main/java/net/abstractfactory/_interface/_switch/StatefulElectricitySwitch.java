package net.abstractfactory._interface._switch;

import net.abstractfactory.yunos.deviceApi._switch.ElectricitySwitch;

public interface StatefulElectricitySwitch extends ElectricitySwitch {

	boolean isOn();
}
