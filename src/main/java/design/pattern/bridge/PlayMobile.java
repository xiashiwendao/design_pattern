package design.pattern.bridge;

import design.pattern.utils.Utils;

public class PlayMobile {
	AbstractMobileBrand mobile;

	public PlayMobile(AbstractMobileBrand mobile) {
		this.mobile = mobile;
	}

	public void play() {
		String brand = this.mobile.info();
		String software = this.mobile.software.info();
		String message = String.format("this mobile is: %s, software name is: %s", brand, software);
		Utils.log(message);
		this.mobile.software.run();
	}
}
