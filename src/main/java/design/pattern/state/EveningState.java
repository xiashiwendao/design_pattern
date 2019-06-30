package design.pattern.state;

import design.pattern.utils.Utils;

public class EveningState implements State {

	public void writeProgram(Work work) {
		if (work.finish) {
			work.setStatus(new ResetState());
			work.info();
		} else {
			if (work.Hour > 18) {
				Utils.log("�����ˣ��Ը������ؼҰɣ�");
			} else {
				work.setStatus(new MorningState());
				work.info();
			}
		}
	}

}
