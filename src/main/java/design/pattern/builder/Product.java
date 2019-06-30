package design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public interface Product {
	public void addPart(String partName);
	public String getInfo();
}
