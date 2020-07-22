package paint;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(200);
		
		drawPoint(point1);
	}

	public static void drawPoint(Point pt) {
		pt.show();
	}
}
