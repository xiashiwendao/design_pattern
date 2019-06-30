package design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class MachineB implements Product {
	List<String> parts = new ArrayList<String>();

	public void addPart(String partName) {
		this.parts.add(partName);
	}
	
	public String getInfo() {
		return "Machine B, parts size:" + parts.size();
	}
}
