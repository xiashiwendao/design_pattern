package design.pattern.visitor;

public interface IModem {
	void dial();
	void send();
	void receive();
	void reception(IModemVisitor v);
}
