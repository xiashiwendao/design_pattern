package design.pattern.bridge;

public class NokiaMobile extends AbstractMobileBrand {

	public NokiaMobile(IMobileSoftware software) {
		super(software);
	}

	@Override
	public String info() {
		return "Nokia Mobile";
	}
}
