package com._7eggs.devicedriver.myswitch;


import net.abstractfactory.yunos.ExecutionEnvironment;
import net.abstractfactory.yunos.deviceApi.transmitter.MySwitch;
import net.abstractfactory.yunos.driver.device.AbstractPhysicalDevice;
import net.abstractfactory.yunos.driver.device.FunctionalDevice;
import net.abstractfactory.yunos.driver.device.TimerListener;

public class MySwitchPD extends AbstractPhysicalDevice implements TimerListener {

	private Config config;

	public MySwitchPD() {

	}

	@Override
	public void init(ExecutionEnvironment executionEnvironment, Object config) {

		super.init(executionEnvironment, config);

		this.config = (Config) config;

		executionEnvironment.getTimerService().subscribe(this, 1000 * 10, 1);

		createFD();
	}

	@Override
	public void destroy() {
		executionEnvironment.getTimerService().unsubscribe(this);
		super.destroy();
	}

	public void createFD() {

		FunctionalDevice fd = new MySwitch() {

			@Override
			public void on() {

			}

			@Override
			public void off() {

			}
		};

		functionalDevices.add(fd);
	}

	@Override
	public void onTimerEvent(int code) {
		System.out.println("MySwitch: on timer event");
	}
}
