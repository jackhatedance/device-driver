package com._7eggs.devicedriver.legacyOnOffDevice;

import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.driver.device.AbstractPhysicalDevice;
import net.abstractfactory.yunos.driver.device.TimerListener;

public class PD extends AbstractPhysicalDevice implements TimerListener {

	final int ON = 1;
	final int OFF = 2;

	private Config config;
	private FD fd;

	Object onJobId;
	Object offJobId;

	@Override
	public void init(ExecutionEnvironment executionEnvironment, Object config) {

		super.init(executionEnvironment, config);

		this.config = (Config) config;

		createFD();

		String cronOn = this.config.getScheduleOnAt();
		if (cronOn != null && !cronOn.trim().isEmpty()) {

			onJobId = executionEnvironment.getTimerService().subscribe(this,
					cronOn, ON);

		}

		String cronOff = this.config.getScheduleOffAt();
		if (cronOff != null && !cronOff.trim().isEmpty()) {
			offJobId = executionEnvironment.getTimerService().subscribe(this,
					cronOff, OFF);

		}
	}

	@Override
	public void destroy() {
		if (onJobId != null)
			executionEnvironment.getTimerService().unsubscribe(onJobId);

		if (offJobId != null)
			executionEnvironment.getTimerService().unsubscribe(offJobId);

		super.destroy();
	}

	private void createFD() {
		fd = new FD(config);

		functionalDevices.add(fd);
	}

	@Override
	public void onTimerEvent(int code) {

		switch (code) {
		case ON:
			fd.on();
			break;
		case OFF:
			fd.off();
			break;
		}
	}
}
