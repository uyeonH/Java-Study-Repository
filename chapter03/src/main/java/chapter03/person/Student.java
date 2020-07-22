package chapter03.person;

public class Student extends Person {
	
	public Student() {
		//자식생성자에 부모 생성자를 명시하지 않으면
		//Compiler가 자식생성자 코드 맨 앞에 부모 default 생성자를 자동으로 넣는다.
		//super();
		System.out.println("Student() Called");
	}
	public void test() {
		// 자식에서 부모의 private 필드나 메소드에 접근 불가
		// name="둘리";

		// 자식에서 부모의 protected 필드나 메소드에 접근 가능
		height = 140;

		// 자식에서 부모의 public 필드나 메소드에 접근 가능
		weight = 30;
	}
}
