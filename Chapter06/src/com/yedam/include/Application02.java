package com.yedam.include;

//import java.util.Scanner;

import com.yedam.access.Access;

public class Application02 {
	public static void main(String[] args) {
		Access ac = new Access();
//		Scanner sc = new Scanner(System.in);
		
		//public
		ac.free = " public";
		//protected -> 다른 패키지 사용 불가
//		ac.parent = "protected";
		//default -> 다른 패키지 사용 불가 
//		ac.basic = "default";
		//private -> 다른 패키지 사용 불가
//		ac.privacy = "private"
		
	}
}
