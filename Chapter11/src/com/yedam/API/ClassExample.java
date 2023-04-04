package com.yedam.API;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//class 클래스
		//class에서 정보 얻기
		
		Class clazz = Member.class;
		System.out.println("Member Class 정보 : " + clazz);
		System.out.println("=============================");
		//클래스 경로 입력해서 정보 얻기
		clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		System.out.println("=============================");
		//객체를 통한 정보 얻기
		Member member = new Member ("또치");
		clazz = member.getClass();
		System.out.println(clazz);
		
		System.out.println("============================");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		
		//절대경로
		System.out.println("=============================");
		String photoPath = clazz.getResource("img_19975_1.jpg").getPath();
		System.out.println(photoPath);
		
		
		
		
		
	}
}
