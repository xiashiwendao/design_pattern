package design.pattern.observer;

public interface Subject {
	void add(Observer observer);
	void detach(Observer observer);
	void notifyObservers();
}
