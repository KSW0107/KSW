package com.yedam.oop;

public class Car {
	//필드 -> 객체의 정보
	String name;
	int price;
	String company = "현대자동차";
	
	//생성자
	//기본 생성자
	public Car(){
		
	}
	//매개변수 생성자
	//오버로딩 -> 순서,타입,갯수를 다르게 한 같은 이름의 생성자 
	//-> 같은 이름으로 여러방식으로 객체 생성하기 위함
	public Car(String name) {
		this(name,10000,"기아자동차");
	}
	
	public Car(int price) {
		this.price= price;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Car(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, int price, String company) {
		this.name =name;
		this.price = price;
		this.company = company;
	}
	
}
