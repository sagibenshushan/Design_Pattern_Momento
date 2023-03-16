package Question_number_2;

public class Memento {

	private Shape state;

	public Memento(Shape state) {
		this.state = state;
	}

	public Shape getState() {
		return state;
	}

	public void setState(Shape state) {
		this.state = state;
	}
}
