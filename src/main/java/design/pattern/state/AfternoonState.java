package design.pattern.state;

import design.pattern.utils.Utils;

public class AfternoonState implements State {

	public void writeProgram(Work work) {
		if (work.Hour < 18) {
			Utils.log("下午了，是否可以考虑下午茶...");
		} else {
			work.setStatus(new EveningState());
			work.info();
		}
	}

}
