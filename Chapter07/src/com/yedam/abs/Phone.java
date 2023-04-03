package com.yedam.abs;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	//추상 ㅔㅁ소드 : 상속받은 실체 ㅋ클래스(자식 클래스)에서 반드시 구현
	public abstract void turnOff();
	
}
