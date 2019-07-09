package design.pattern.bridge;

import design.pattern.utils.Utils;

public class AppStore implements IMobileSoftware {

	public void run() {
		Utils.log("App Store starting...");
	}

	public String info() {
		return "App Store";
	}

}
