package design.pattern.state;

import design.pattern.utils.Utils;

public class AfternoonState implements State {

	public void writeProgram(Work work) {
		if (work.Hour < 18) {
			Utils.log("�����ˣ��Ƿ���Կ��������...");
		} else {
			work.setStatus(new EveningState());
			work.info();
		}
	}

}
