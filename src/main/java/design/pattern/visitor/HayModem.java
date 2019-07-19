package design.pattern.visitor;

public class HayModem implements IModem {

	public String UnixConfig;

	public void dial() {
		// TODO Auto-generated method stub

	}

	public void send() {
		// TODO Auto-generated method stub

	}

	public void receive() {
		// TODO Auto-generated method stub

	}

	public void reception(IModemVisitor v) {
		v.visit(this);
	}

}
