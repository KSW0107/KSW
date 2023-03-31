package com.yedam.inheri;

public class Exam extends OverrideExam{

	@Override
	public void method1() {
		System.out.println("자식 클래스의 메소드 1");
		super.method1();
		super.method2();
	}
	//자식 클래스
	
	
}
