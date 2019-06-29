package design.pattern.observer;

public class MainForObserver {
	public static void main(String[] args) {
		Boss boss = new Boss();
		Workmate wm = new Workmate("wm1", boss);
		Workmate wm2 = new Workmate("wm2", boss);
		boss.add(wm);
		boss.add(wm2);
		boss.notifyObservers("I come back, :)");
	}
}
