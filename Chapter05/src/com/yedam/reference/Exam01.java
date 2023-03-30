package com.yedam.reference;

public class Exam01 {
	public static void main(String[] args) {
		//stack 영역에  intVal 저장
		int intVal = 10;
		
		//참조타입
		//stack 영역에 array가 생성 (참조:[I@182decdb)되고 다음과 같은
		//주소가 저장되어 있다
		int [] array = {1,2,3,4,5,6};
		int [] array2 = {1,2,3,4,5,6};
		int [] array3 = null;
		
		//데이터가 같아도 저장된 공간은 다름 (힙영역)
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array == array2);
		System.out.println(array3.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////////////////////
	}
}
