package com._7eggs.devicedriver.huaweistb;

import com.deviceyun.yunos.device.DeviceReference;

public class Configure {
	private int bits;
	private int repeat;
	private DeviceReference controllerRef = new DeviceReference();

	public int getBits() {
		return bits;
	}

	public void setBits(int bits) {
		this.bits = bits;
	}

	public int getRepeat() {
		return repeat;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	public DeviceReference getControllerRef() {
		return controllerRef;
	}

	public void setControllerRef(DeviceReference controllerRef) {
		this.controllerRef = controllerRef;
	}

}
