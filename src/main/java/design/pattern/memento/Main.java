package design.pattern.memento;

import design.pattern.utils.Utils;

public class Main {

	public static void main(String[] args) {
		Utils.log("开始我的战场了！");
		GamePlayer player = new GamePlayer();
		player.setQuantity(10);
		player.setBlood(100);
		player.setSpeed(50);
		String message = String.format("quantity: %d, blood: %d, speed: %d", player.getQuantity(), player.getBlood(),
				player.getSpeed());
		Utils.log(message);
		GameMementoCarer.storeMemento(player.save());
		
		Utils.log("拼杀减分了...");
		player.setQuantity(5);
		player.setBlood(50);
		player.setSpeed(25);
		
		message = String.format("quantity: %d, blood: %d, speed: %d", player.getQuantity(), player.getBlood(),
				player.getSpeed());
		Utils.log(message);
		
		player.restore(GameMementoCarer.getMemento());
		Utils.log("满血复活了!");
		message = String.format("quantity: %d, blood: %d, speed: %d", player.getQuantity(), player.getBlood(),
				player.getSpeed());
		Utils.log(message);
	}

}
