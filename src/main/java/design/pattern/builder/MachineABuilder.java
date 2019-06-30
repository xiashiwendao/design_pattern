package design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import design.pattern.utils.Utils;

public class MachineABuilder implements Builder {
	Product product = new MachineA();

	public Product addpart1() {
		product.addPart("part1");
		Utils.log("MachineA added the part 1");

		return product;
	}

	public Product addpart2() {
		product.addPart("part2");
		Utils.log("MachineA added the part 2");

		return product;
	}

}
