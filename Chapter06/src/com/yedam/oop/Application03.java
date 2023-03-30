package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		// 메소드 호출
		cal.sum(10, 20);

		int result = cal.sum3(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		System.out.println("sum3 : " + result);

		result = cal.sum4(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
		System.out.println("sum4 : " + result);

		Bycle bycle = new Bycle();
		bycle.setGas(5);
		boolean gasState = bycle.isLeftGas();

		if (gasState) {
			System.out.println("출발");
			bycle.run();
		}

		if (bycle.isLeftGas()) {
			System.out.println("gas 주입 필요없음");
		} else {
			System.out.println("가스 주입 필요");
		}
		
		
		
		double result2 = cal.avg();
		
		System.out.println("평균 : " + result2);
		
		
		
		
		double result3 = cal.areaRectangle(10);
		
		double result4 = cal.areaRectangle(10,20);
		
		
		System.out.println("정사각형의 넓이 : " + result3);		
		System.out.println("정사각형의 넓이 : " + result4);
		
		
		Book one = new Book("책이름",10000,"yedam011");
		one.getInfo();
		
		Book two = new Book("혼자 공부하는 자바","학습서",24000,"yedam001","한빛미디어");
		two.getInfo();
		
		Book three = new Book("HTML","학습서",15000,"yedam002","길벗");
		three.getInfo();
		
		Book four = new Book("JacaScript","학습서",20000,"yedam003","길벗");
		four.getInfo();
		
		Student a = new Student("또치", "20320330", 80,70,77);
		a.getInfo();
	}
}
