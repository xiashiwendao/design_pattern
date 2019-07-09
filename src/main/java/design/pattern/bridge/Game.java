package design.pattern.bridge;

import design.pattern.utils.Utils;

public class Game implements IMobileSoftware {

	public void run() {
		Utils.log("game start running... ...");

	}

	public String info() {
		return "Game";
	}
}
