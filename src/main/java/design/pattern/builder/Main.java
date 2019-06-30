package design.pattern.builder;

import design.pattern.utils.Utils;

public class Main {
	public static void main(String[] args) {
		Builder mab = new MachineABuilder();
		Builder mbb = new MachineBBuilder();
		
		Director d = new Director(mab);
		Product p = d.create();
		Utils.log(p.getInfo());
		
		Director d2 = new Director(mbb);
		Product p2 = d2.create();
		Utils.log(p2.getInfo());
	}
}
