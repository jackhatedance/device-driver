package net.abstractfactory.yunos.deviceApi.transmitter;

import net.abstractfactory.yunos.driver.device.FunctionalDevice;

public interface RfTransmitter extends FunctionalDevice {
	static final String ORGANIZATION_ID = "Generic";
	static final String ARTIFACT_ID = "RfTransmitter";
	
	
	static final int FREQUENCY_315 = 315;
	static final int FREQUENCY_433 = 433;

	void transmit(int frequency, int pulseLength, long code, int bits);
}
