package chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point(100,200);
		Point point2 = new Point(50,50);
		
		point1.setX(100);
		point1.setY(200);
		
		drawPoint(point1);
		
		drawPoint(point2);
	}

	public static void drawPoint(Point pt) {
		pt.show();
	}
}
