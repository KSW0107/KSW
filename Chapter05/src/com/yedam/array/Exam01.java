package com.yedam.array;

public class Exam01 {

	public static void main(String[] args) {
		//배열 선언
		//1. 데이터가 6개 들어갈 수 있는 공간 생성, 1~6 데이터 넣음
		//int[] intArray = {1,2,3,4,5,6};

		//2. new 연산자 활용, 배열 생성
		//int[] intArray = new int[6];
		//intArray[0] =1;
		//intArray[1] =2;
		//intArray[2] =3; //...
		
		//문자열 10개의 공간을 입력하는 배열
		String[] strArray= new String[10];
		
		int[] intArray2;
		intArray2 = new int[5];
		
		int[] scores = {83,90,87};
		
		System.out.println("scores 첫 번째 값 :" + scores[0]);
		System.out.println("scores 마지막 값 :" + scores[2]);
		
		//반복문 활용한 배열 사용
		//총합
		int sum = 0;
		
		for(int i = 0; i<3; i++) {
			System.out.println(scores[i]+ " - i 값 :"+ i);
			sum += scores[i];
		}
		System.out.println("총 합계 : "+sum);
		
		//new 연산자 활용 배열 생성
		//1)
		int[] point;
		point = new int[] {83,90,87};
		
		//2)
		int[] arr1 = new int[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]); //초기값을 초기화
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i =0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
		arr3[0] = "3월";
		arr3[1] = "4월";
		arr3[2] = "5월";
		
		for(int i =0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
		
		
		
////////////////////////////////////////////////////////////////
	}

}
