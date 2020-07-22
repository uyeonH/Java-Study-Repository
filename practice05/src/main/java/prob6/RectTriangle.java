package prob6;

public class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double h = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
		return h + width + height;
	}

}
