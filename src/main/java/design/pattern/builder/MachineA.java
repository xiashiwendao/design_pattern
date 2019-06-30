package design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class MachineA implements Product {
	List<String> parts = new ArrayList<String>();

	public void addPart(String partName) {
		this.parts.add(partName);
	}

	public String getInfo() {
		return "Machine A, parts size:" + parts.size();
	}
}
