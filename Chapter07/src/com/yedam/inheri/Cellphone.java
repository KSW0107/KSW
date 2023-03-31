package com.yedam.inheri;

public class Cellphone {
	//핸드폰의 기본 기능을 구현
	//부모 클래스
	
	//필드 
	String model;
	String color;
	//생성자
	//가본 생성자
//	public Cellphone() {
//		
//	}
//	
	public Cellphone(String model, String color) {
		this.model = model;
		this.color =color;
	}
	//메서드
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void bell() {
		System.out.println("전화가 옵니다");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
