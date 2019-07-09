package design.pattern.bridge;

public class OppoMobile extends AbstractMobileBrand {

	public OppoMobile(IMobileSoftware software) {
		super(software);
	}

	@Override
	public String info() {
		return "Oppo Mobile";
	}

}
