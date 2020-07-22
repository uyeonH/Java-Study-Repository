package prob02;

public class Book {
	private int stateCode;
	private int bookNo;
	private String title;
	private String author;

	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}

	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");
	}

	public void print() {
		String[] str = { "대여중", "재고 있음" };
		System.out.println("책 제목: " + title + ", 작가: " + author + ", 대여 유무:" + str[stateCode]);
	}

	public int getBookNo() {
		// TODO Auto-generated method stub
		return bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

}
