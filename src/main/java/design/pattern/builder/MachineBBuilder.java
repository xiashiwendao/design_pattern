package design.pattern.builder;

import design.pattern.utils.Utils;

public class MachineBBuilder implements Builder {
	Product product = new MachineB();

	public Builder addpart1() {
		product.addPart("part1");
		Utils.log("MachineB added the part 1");

		return this;
	}

	public Builder addpart2() {
		product.addPart("part2");
		Utils.log("MachineB added the part 2");

		return this;
	}

	public Product getProduct() {
		return product;
	}
}
