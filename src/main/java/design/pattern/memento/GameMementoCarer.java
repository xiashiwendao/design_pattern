package design.pattern.memento;

public class GameMementoCarer {
	private static GameMemento memento;

	public static GameMemento getMemento() {
		return memento;
	}

	public static void storeMemento(GameMemento memento) {
		GameMementoCarer.memento = memento;
	}
}
