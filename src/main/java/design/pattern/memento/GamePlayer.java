package design.pattern.memento;

public class GamePlayer {
	private int quantity;
	private int speed;
	private int blood;
	
	public GameMemento save() {
		return new GameMemento(this.getQuantity(), this.getSpeed(), this.getBlood());
	}
	
	public void restore(GameMemento memento) {
		this.setQuantity(memento.Quantity);
		this.setSpeed(memento.Speed);
		this.setBlood(memento.Blood);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
}
