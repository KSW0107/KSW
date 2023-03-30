package com.yedam.variable;

public class Example02 {
	public static void main(String[] args) {
		//자동 타입 변환
		char charVal = 'A' +1;
		System.out.println(charVal);
		
		int iVar = charVal;
		System.out.println(iVar);
		
		double dVar = iVar;
		System.out.println(dVar);
		System.out.println();
		//강제 타입 변환
		iVar = (int)dVar; //실수 -> 정수 66
		System.out.println(iVar);
		charVal = (char)iVar; // 'B'
		System.out.println(charVal);
		
		double dVar2 = 3.14444444;
		int iVar2 = (int) dVar2; //3
		System.out.println(iVar2);
	
	}
}
