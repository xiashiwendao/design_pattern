package design.pattern.state;

public class Main {

	public static void main(String[] args) {
		Work work = new Work(new MorningState());
		work.Hour = 9;
		work.info();
		work.Hour = 17;
		work.info();
		work.Hour = 21;
		work.info();
		work.Hour = 5;
		work.info();
		work.Hour = 22;
		work.info();
		work.finish = true;
		work.info();
	}

}
