package com.yedam.loop;

public class ForExample2 {

	public static void main(String[] args) {
		//��ø �ݺ���
		//������ ���
		for(int i =2; i<=9 ; i++) {
			for(int j =1; j<=9 ; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		
		//������ �����
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(""); //����
		
		for(int i = 1; i<=5 ; i++) {
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();//����
		
		for(int i = 1; i<=5 ; i++) {
			for(int j = 5 ; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////
	}

}
