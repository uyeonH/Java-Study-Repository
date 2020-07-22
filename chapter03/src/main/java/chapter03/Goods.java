package chapter03;
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countofGoods = 0;
	
	//리팩토링, 중복 줄이기
	//생성자, 작성하지 않았을 경우 자동 생성
	//주로 변수를 초기화하는 용도
	
	public Goods() {
		countofGoods++; 
	}
	public Goods(String name) {
		this();//기본생성자 실행
		this.name=name;
	}

	//생성자 오버로딩, 다형성
	public Goods(String name,int price, int countStock,int countSold) {
		this();//기본생성자 실행
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println(
			"상품이름 :" + name + 
			",가격:" + price +
			",재고개수:" + countStock + 
			",팔린 개수:" + countSold
		);
	}
	
	public int calculateDiscountPrice(double percentage) {
		return (int)(price * percentage);
	}
}