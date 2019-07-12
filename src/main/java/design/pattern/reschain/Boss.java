package design.pattern.reschain;

import design.pattern.utils.Utils;

public class Boss extends Manager {
	public Boss() {
		this.name = "老板";
	}

	public void handleApplication(Request request) {
		if (request.requestType.equals("leave")) {
			String message = String.format("%s 已经批准", this.name);
			Utils.log(message);
		} else {
			this.successor.handleApplication(request);
		}
	}
}
