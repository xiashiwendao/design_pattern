package design.pattern.observer;

public class Workmate implements Observer {
//	private static Logger logger = LoggerFac
	private String name;
	private AbstractSubject subject;
	
	public Workmate(String name, AbstractSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	public void update() {
		String message = String.format("workermate: %s, receive the notify: %s!", 
				this.name, this.subject.SubjectStat);
		System.out.println(message);
	}
}
