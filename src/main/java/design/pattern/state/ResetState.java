package design.pattern.state;

import design.pattern.utils.Utils;

public class ResetState implements State {

	public void writeProgram(Work work) {
		Utils.log("工作已经完成，可以休息了");
	}
}
