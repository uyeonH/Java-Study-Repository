package prob6;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		width = width * rate;
		height = height * rate;
	}

}
