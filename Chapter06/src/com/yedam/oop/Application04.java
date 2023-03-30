package com.yedam.oop;

public class Application04 {

	static int a = 1;

	static void info() {
		System.out.println("info 출력");
	}

	int field1;

	// 메소드 영역에 포함되어 있는 정적 메서드 ,main문
	public static void main(String[] args) {
		// static 메서드 실행 후 a가 생성되기 때문
		System.out.println(a);

		info();

		Application04 temp = new Application04();
		temp.field1 = 1;

		System.out.println(StaticCal.PI);
		System.out.println(StaticCal.earthRadius);

		int result = StaticCal.plus(10, 20);
		
		StaticCal cal = new StaticCal();
		
		
	}
}
