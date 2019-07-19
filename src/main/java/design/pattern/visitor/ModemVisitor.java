package design.pattern.visitor;

public class ModemVisitor implements IModemVisitor {

	public void visit(HayModem modem) {
		modem.UnixConfig = "ls -l";
	}

	public void visit(EstinModem modem) {
		modem.UnixConfig = "dir";
	}

	public void visit(QuotaModem modem) {
		modem.UnixConfig = 42;
	}
}
