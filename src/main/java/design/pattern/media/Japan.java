package design.pattern.media;

import design.pattern.utils.Utils;

public class Japan implements Country {
	private UNAgency unAgency;

	public Japan(UNAgency un) {
		this.unAgency = un;
	}

	public void notify(String message) {
		this.unAgency.transferMessage(this, message);
	}

	public void receivedMessage(String message) {
		Utils.log("日本已经收到了消息: " + message);
	}

}
