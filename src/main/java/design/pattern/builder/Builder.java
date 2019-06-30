package design.pattern.builder;

public interface Builder {
	Builder addpart1();

	Builder addpart2();
	
	Product getProduct();
}
