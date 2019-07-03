package design.pattern.memento;

public class GameMemento {
	
	public int Quantity; // 体力
	public int Speed; // 速度
	public int Blood; // 剩下的血
	
	public GameMemento(int quantity, int speed, int blood) {
		this.Quantity = quantity;
		this.Speed = speed;
		this.Blood = blood;
	}
}
