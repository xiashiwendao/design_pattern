package design.pattern.media;

public class UNCouncil implements UNAgency {
	public Country c1;
	public Country c2;

	public void transferMessage(Country sender, String message) {
		if (sender.getClass().equals(c1.getClass())) {
			c2.receivedMessage(message);
		} else {
			c1.receivedMessage(message);
		}
	}

}
