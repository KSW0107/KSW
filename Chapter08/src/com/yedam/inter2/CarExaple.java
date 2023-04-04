package com.yedam.inter2;

public class CarExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("===========================");
		myCar.frontLeftTire = new KumHoTire();
		myCar.frontRightTire = new KumHoTire();
		
		
		
		myCar.run();
		
		
	}

}
