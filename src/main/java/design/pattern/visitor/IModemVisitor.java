package design.pattern.visitor;

public interface IModemVisitor {
	void visit(HayModem modem);
	void visit(EstinModem modem);
	void visit(QuotaModem modem);
}
