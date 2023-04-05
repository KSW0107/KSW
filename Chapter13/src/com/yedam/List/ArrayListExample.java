package com.yedam.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//String 문자열을 넣을 수 있는 ArrayList
		List<String> list = new ArrayList<>();
		
		//list 데이터 추가
		list.add("Java"); //인덱스 0
		list.add("JDBC"); // 인덱스 1
		list.add("Sevelet/JSP"); //인덱스 2
		
		list.add(2, "DataBase"); //기존 인덱스 2 데이터 -> 인덱스 3
		list.add("iBatis");
		
		//list.size() -> list의 크기, 객체의 수(배열의 length와 비슷)
		for(int i=0; i<list.size();i++){
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		
		
		//*향상된 for문* 사용 
		for(String str : list) {
			System.out.println(str);
		}
		
		
		System.out.println("===================================");
		//list에 있는 인덱스 2번 객첵 삭제
		list.remove(2);
		
		for(String str : list) {
			System.out.println(str);
		}
		
		//list에 저장된 객체를 활용해 삭제
		list.remove("JDBC");
		
		System.out.println("===================================");
		for(String str : list) {
			System.out.println(str);
		}
		
		list.clear();
		System.out.println("===================================");
		System.out.println("list 사이즈 : "+list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
