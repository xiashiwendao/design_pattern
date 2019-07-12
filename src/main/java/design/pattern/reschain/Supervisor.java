package design.pattern.reschain;

import design.pattern.utils.Utils;

public class Supervisor extends Manager {
	public Supervisor() {
		this.name = "总监";
	}

	public void handleApplication(Request request) {
		if (request.requestType.equals("leave") && request.leaveDays < 10) {
			String message = String.format("%s 已经批准", this.name);
			Utils.log(message);
		} else {
			this.successor.handleApplication(request);
		}
	}
}
