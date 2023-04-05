package com.yedam.Set;

import java.util.HashSet;
import java.util.Set;

public class HashExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("또치",10 ));
		set.add(new Member("또치",10 )); // 데이터는 같지만 해쉬코드 값이 달라 다른 객체
		
		System.out.println("총 객체 수 : " + set.size());
		
	}
}
