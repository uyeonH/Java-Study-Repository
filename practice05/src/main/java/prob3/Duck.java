package prob3;

public class Duck extends Bird {
	protected String name;

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		return "오리(" + name + ")은";
	}
}
