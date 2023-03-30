package com.yedam.oop;

public class Book {
	//book 이라는 클래스는 아래의 정보를 가집니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	String name;
	String category;
	int price;
	String no;
	String company;
	
	//생성자는 3개
	//1)기본 생성자
	public Book(){
	}
	//2)모든 데이터를 초기화할 수 있는 생성자
	Book(String name,String category,int price,String no,String company){
		this.name = name;
		this.category = category;
		this.price = price;
		this.no= no;
		this.company = company;
	}
	//3)책이름, 책가격, 도서번호를 받아오는 생성자
	Book(String name,int price,String no){
		this.name = name;
		this.price = price;
		this.no= no;
	}
	
	
	//메소드는 getInfo() 메소드 가짐
	//getInfo() 메소드 클래스 외부에서 실행하였을 때,
	//다음과 같은 출력물이 나오도록 구현
	//객체.getInfo()
	void getInfo() {
		System.out.printf(" #책이름 : %s\n #내용 :\n 1) 종류 : %s\n 2) 가격 : %d원\n 3) 출판사 : %s\n 4) 도서번호 : %s\n"
				,name,category,price,company,no);
	}
	
	//#책이름 : 혼자 공부하는 자바
	//#내용
	//1) 종류 : 학습서
	//2) 가격 :24000원
	//3) 출판사 : 한빛 미디어
	//4) 도서번호 : yedam001
	
	//#책이름 : HTML
	//#내용
	//1) 종류 : 학습서
	//2) 가격 :15000원
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam002
	
	//#책이름 : JavaScript
	//#내용
	//1) 종류 : 학습서
	//2) 가격 : 20000원
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam003
}
