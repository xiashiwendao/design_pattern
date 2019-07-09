package design.pattern.bridge;

abstract class AbstractMobileBrand {
	public AbstractMobileBrand(IMobileSoftware software) {
		this.software = software;
	}

	protected IMobileSoftware software;

	public abstract String info();
}
