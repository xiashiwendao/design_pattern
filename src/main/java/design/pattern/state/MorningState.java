package design.pattern.state;

import design.pattern.utils.Utils;

public class MorningState implements State {

	public MorningState() {
	}

	public void writeProgram(Work work) {
		if (work.Hour < 12) {
			Utils.log("���Ͼ���״̬��ã�������");
		}else {
			work.setStatus(new AfternoonState());
			work.info();
		}
	}
}
