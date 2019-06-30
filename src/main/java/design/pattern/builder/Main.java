package design.pattern.builder;

import design.pattern.utils.Utils;

public class Main {
	public static void main(String[] args) {
		Product p = Director.create(new MachineABuilder());
		Utils.log(p.getInfo());

		Product p2 = Director.create(new MachineBBuilder());
		Utils.log(p2.getInfo());
	}
}
