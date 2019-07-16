package design.pattern.media;

public class Main {
	public static void main(String[] args) {
		UNCouncil un = new UNCouncil();
		Country c1 = new America(un);
		Country c2 = new Japan(un);
		un.c1 = c1;
		un.c2 = c2;
		
		c1.notify("America need Japan help");
		c2.notify("Japa can help USA in South Asian");
	}
}
