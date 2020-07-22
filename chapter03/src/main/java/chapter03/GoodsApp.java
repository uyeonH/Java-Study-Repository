package chapter03;
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods("nikon",20000,20,30);
		
		camera.setName("nikon");
		camera.setPrice(200000);
		camera.setCountSold(20);
		camera.setCountStock(30);
		
		Goods camera1 = new Goods("nikon",20000,20,30);
		Goods camera2 = new Goods("nikon",20000,20,30);
		Goods camera3 = new Goods("nikon",20000,20,30);
		
		camera.showInfo();
		System.out.println(camera.calculateDiscountPrice(0.5));
	}

}