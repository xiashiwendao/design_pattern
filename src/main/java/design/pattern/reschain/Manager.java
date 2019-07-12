package design.pattern.reschain;

public abstract class Manager {
	protected String name;
	protected Manager successor;
	public void setSuccessor(Manager manager) {
		this.successor = manager;
	}

	public abstract void handleApplication(Request request);

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
}
