package design.pattern.state;

import design.pattern.utils.Utils;

public class ResetState implements State {

	public void writeProgram(Work work) {
		Utils.log("�����Ѿ���ɣ�������Ϣ��");
	}
}
