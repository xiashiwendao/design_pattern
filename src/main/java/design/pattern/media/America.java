package design.pattern.media;

import design.pattern.utils.Utils;

public class America implements Country {
	private UNAgency unAgency;

	public America(UNAgency un) {
		this.unAgency = un;
	}

	public void notify(String message) {
		this.unAgency.transferMessage(this, message);
	}

	public void receivedMessage(String message) {
		Utils.log("美国已经收到了消息: " + message);
	}
}
