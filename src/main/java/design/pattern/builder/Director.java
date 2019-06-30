package design.pattern.builder;

public class Director {
	private Builder builder = null;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Product create() {
		Product p = this.builder.addpart1();
		p = this.builder.addpart2();
		
		return p;
	}
}
