package com.yedam.reference;

public class Exam02 {

	public static void main(String[] args) {
		//String = 변종
		
		String strVal1 = "yedam";
		String strVal2 = "yedam";

		//참조 타입의 ==는 데이터가 아닌 주소,객체를 비교하는 것
		
		//String 주소 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2 는 메모리 주소 동일");
		}else {
			System.out.println("strVal1과 strVal2 는 메모리 주소 틀림");
		}
		
		//문자열 간의 데이터 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2 는 데이터 동일");
		}else {
			System.out.println("strVal1과 strVal2 는 데이터 틀림");
		}	
			
		//new 연산자 활용, 주소.객체.데이터 같은지 확인	
		String strVal3 = new String ("yedam");
		String strVal4 = new String ("yedam");
			
		if(strVal3==strVal4) {
			System.out.println("strVal3과 strVal4 는 메모리 주소 동일");
		}else {
			System.out.println("strVal3과 strVal4 는 메모리 주소 틀림");
		}
			
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal1과 strVal2 는 데이터 동일");
		}else {
			System.out.println("strVal1과 strVal2 는 데이터 틀림");
		}
			
		if(strVal1==strVal3) {
			System.out.println("strVal1과 strVal3 는 메모리 주소 동일");
		}else {
			System.out.println("strVal1과 strVal3 는 메모리 주소 틀림");
		}	
			
		}
	}


