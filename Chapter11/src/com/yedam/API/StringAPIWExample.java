package com.yedam.API;

import java.io.UnsupportedEncodingException;

public class StringAPIWExample {
	public static void main(String[] args) {
		//byte[] -> String 변환
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //<-아스키 코드
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//내가 원하는 위치를 선정(6)하고 그 갯수만큼 출력(4)
		String str2 = new String (bytes, 6, 4);
		System.out.println(str2);
		
		
		//charAt()
		//인덱스 값(문자위치)를 입력해서 해당위치에 있는 문자를 가져오기
		String ssn = "010645-159874";
		char gender = ssn.charAt(7);
		System.out.println(gender);
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
			
			
		//문자열 비교
		//equals()
			
		String str3 = "김또치";
		String str4 = "김또치";
		String str5 = new String("김또치");
		
		if (str3.equals(str4)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
			
		if (str3.equals(str5)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}	
			
			
		//바이트 배열로 변환 : getBytes()
		//String -> byte로 변환
		
		String str6 = "helloWorld";
		byte[] byte1 = str6.getBytes();
		for(byte temp : byte1) {
			System.out.println(temp);
		}
		
		//byte -> String
		String str7 = new String(byte1);
		System.out.println(str7);
		
		
		//byte <-> String + encoding type
		try {
			//String -> byte + EUC-KR
			//UTF-8, MS949....
			byte[] byte2 =str6.getBytes("EUC-KR");
			System.out.println("byte2.length : "+ byte2.length);
			
			for(byte temp : byte2) {
				System.out.println(temp);				
			}
			
			//byte -> String 
			String str8 = new String(byte2, "EUC-KR");
			System.out.println(str8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//문자열 찾기
		//indexOf 
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("그래밍"); //-> 없을 시 -1
		System.out.println(index); //-> 0부터 시작
		
		
		//문자열 길이
		System.out.println(subject.length());
		
		String ssn2 = "000012-393939";
		if(ssn2.length()==14) {
			System.out.println("주민번호 자릿수 맞음");
		}else {
			System.out.println("주민번호 자릿수 틀림");
		}
		
		
		//문자열 대치(바꾸기)
		//replace
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		
		
		//문자열 자르기
		//substring
		//매개병수레 따라서 자르는 방법이 다름
		//1) 매개변수가 1개 일 때 -> 해당 위치로부터 뒤로 다 자름
		String ssn3 = "123456-1234567";
		String firstNum = ssn3.substring(7);
		System.out.println(firstNum);
		
		//2)매개변수가 2개 일 때 -> 시작위치~ 끝나는 위치 '앞'까지 자름
		String secondNum = ssn3.substring(0,6);
		System.out.println(secondNum);
		
		//대문자 -> 소문자
		String dae = "ABCDEFG";
		System.out.println(dae.toLowerCase());
		
		//소문자 -> 대문자
		String so = "abcdefg";
		System.out.println(so.toUpperCase());
		
		//양쪽 공백 제거
		//trim
		String name = "    고희동     ";
		System.out.println(name.trim());
		
		//기본타입 -> 문자열 변환
		//String.valueOf
		String temp = String.valueOf(123);
		temp= String.valueOf(true);
		System.out.println(temp);
		System.out.println();
		
		//문자열 분리하기
		//split() - 조건문자 (구분자) 를 통한 문자열 분리
		String value = "1,2,3,4,5,6,7,8,9";
		String[] strAry = value.split(",");
		
		for(String data : strAry) {
			System.out.println(data);
		}
		
		
		//contains - 포함하고 있는 문자열 확인
		String var = "또치";
		if(var.contains("또"))
		System.out.println("또 포함 됨");
		else 
		System.out.println("또 포함 안됨");
		
		//isEmpty 
		String empty = "";
		if(empty.isEmpty()) {
			System.out.println("비었음");
		}else {
			System.out.println("안 비었음");
		}
		
		//String 단점을 보완해 줄 수 있는 API
		//StringBuffer
		//StringBuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append("ye");
		sb.append("dam");
		System.out.println(sb);
		
		
		}
	}

