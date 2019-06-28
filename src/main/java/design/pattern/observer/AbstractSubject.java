package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class AbstractSubject implements Subject {
	public String SubjectStat = "";
	List<Observer> lst = new ArrayList<Observer>();
	public void add(Observer observer) {
		lst.add(observer);
	}

	public void detach(Observer observer) {
		lst.remove(observer);
	}

	public void notifyObservers() {
		for(Observer obs : this.lst){
			obs.update();
		}
	}
}
