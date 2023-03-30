package com.yedam.access;

public class Application1 {

	public static void main(String[] args) {
		Access ac = new Access();
		
		//public
		ac.free = "public";
		//protected 
		ac.parent = "parent";
		//default
		ac.basic = "default";
		//private -> 사용 불가
//		ac.privacy = "private";
	}

}
