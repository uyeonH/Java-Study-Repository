package chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		Point point1 = new Point(100,200);
		Point point2 = new Point(50,50);
		
		point1.setX(100);
		point1.setY(200);
		
		drawPoint(point1);
		drawPoint(point2);
		
		ColorPoint point3=new ColorPoint();
		point3.setX(40);
		point3.setY(100);
		
		point3.setColor("yellow");
		drawPoint(point3);
		
		System.out.println("//========================");
		Rect rect = new Rect();
		//drawShape(rect);
		draw(rect);
		
		System.out.println("//========================");
		Triangle triangle = new Triangle();
		//drawShape(triangle);
		draw(triangle);
		
		System.out.println("//========================");
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
	
		draw(new GraphicText("HelloWorld"));
	}

	public static void drawPoint(Point pt) {
		pt.show();
	}
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
}
