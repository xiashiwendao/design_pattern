package design.pattern.state;

public class Work {
	public int Hour = 0;
	public boolean finish = false;
	private State state;

	public Work(State state) {
		this.setStatus(state);
	}

	public void setStatus(State state) {
		this.state = state;
	}

	public void info() {
		state.writeProgram(this);
	}
}
