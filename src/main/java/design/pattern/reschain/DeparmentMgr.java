package design.pattern.reschain;

import design.pattern.utils.Utils;

public class DeparmentMgr extends Manager {
	public DeparmentMgr() {
		this.name = "部门经理";
	}

	public void handleApplication(Request request) {
		if (request.requestType.equals("leave") && request.leaveDays < 3) {
			String message = String.format("%s 已经批准", this.name);
			Utils.log(message);
		} else {
			this.successor.handleApplication(request);
		}
	}
}
