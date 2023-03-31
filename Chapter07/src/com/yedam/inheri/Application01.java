package com.yedam.inheri;

public class Application01 {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		child.lastName = "이";
		child.getInfo();
		
		//private는 상속 불가
//		child.money = 1000;
	}

}
