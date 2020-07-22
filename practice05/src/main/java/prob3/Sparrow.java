package prob3;

public class Sparrow extends Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	String toString() {
		String s;
		s = "참새(" + name + ")가 날라다닙니다.";
		return s;
	}

}
