package design.pattern.builder;

public class Director {
	public static Product create(Builder builder) {
		Product p = builder.addpart1().addpart2().getProduct();
		
		return p;
	}
}
