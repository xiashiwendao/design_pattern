package design.pattern.visitor;

import design.pattern.utils.Utils;

public class Main {

	public static void main(String[] args) {
		
		EstinModem modem = new EstinModem();
		Utils.log("before visit: " + modem.UnixConfig);
		IModemVisitor visitor = new ModemVisitor();
		modem.reception(visitor);
		
		Utils.log("after visit: " + modem.UnixConfig);
	}

}
