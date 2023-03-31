package com.yedam.poly;

public class Application01 {
	public static void main(String[] args) {
		//자동 형변환
//		Child child = new Child();
//		Parent parent = child;
		//자동 형변환 간단
		
		//다형성
		/*
		 * 부모 클래스에 있는 내용을 사용을 하되 만약
		 * 자식클래그에 부모 클래스가 재정의(오버라이딩)이 되어 있다면
		 * 부모 클래스에 메소들르 사용하지 않고 자식 클래스의 메소드를 사용
		 * - 위에 성질(자동타입변환)을 사용해서 하나의 타입(부모)로 
		 * 다양한 형태,객체의 모습을 만든다.
		 * 많은 자식들이 있다면, 그 숫자만큼 다양한 형태,객체 사용 가능
		 * =>다형성.
		 */
		Parent parent = new Child();
		
		parent.field = "A";
		parent.method1();
		parent.method2();
		
		System.out.println("------------------------");
		parent = new Child02();
		parent.method1();
		parent.method2();
	}
}
