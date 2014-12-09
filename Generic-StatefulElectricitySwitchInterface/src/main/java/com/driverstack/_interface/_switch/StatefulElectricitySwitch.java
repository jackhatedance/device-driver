package com.driverstack._interface._switch;

import com.driverstack.yunos.deviceApi._switch.ElectricitySwitch;


public interface StatefulElectricitySwitch extends ElectricitySwitch {

	boolean isOn();
}
