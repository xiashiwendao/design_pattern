package design.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		IMobileSoftware software = new AppStore();
		AbstractMobileBrand mobile = new OppoMobile(software);
		PlayMobile pg = new PlayMobile(mobile);
		pg.play();
	}

}
