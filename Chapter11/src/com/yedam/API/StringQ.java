package com.yedam.API;

public class StringQ {

	public static void main(String[] args) {
		// 문제 1] 문자열 뒤집기
		// 12345678

		String q1 = "987654321";
		byte[] q1byte = q1.getBytes();

		for (int i = 0; i < q1byte.length / 2; i++) {
			byte tmp;
			tmp = q1byte[i];
			q1byte[i] = q1byte[q1byte.length - (i + 1)];
			q1byte[q1byte.length - (i + 1)] = tmp;
		}
		System.out.println(new String(q1byte));

		
		//풀이 배열 사용 X
		
		
		// 문제 2] 문자열 개수 세기
		// 입력되는 문자열을 뒤집어 출력하라
		// 알파벳, 숫자, 공백의 갯수

		String q2 = "asd";
		byte[] q2byte = q2.getBytes();
		int numcount = 0;
		int charcount = 0;
		int blinkcount = 0;
		for (int i = 0; i < q2byte.length; i++) {

			if (q2byte[i] >= 48 && q2byte[i] <= 57) {
				numcount++;
			}
			if ((q2byte[i] >= 65 && q2byte[i] <= 90) || (q2byte[i] >= 97 && q2byte[i] <= 122)) {
				charcount++;
			}
			if (q2byte[i] == 32) {
				blinkcount++;
			}
		}
		
		
		System.out.println("알파벳 : " + charcount + " 공백 : " + blinkcount + " 숫자 :" + numcount);
		
		
		//배열 사용,아스키 코드 X -> charAt
		
		
		// 문제 3] 문자열 압축
		// 예시 : 입력 >"YYYEEDDDYYYMMMAAA";
		// 출력 >Y3E2D3Y3M3A3

		
		
		
		
		
		
		// 문제 4] 생년월일 입력 후 나이 출력하기(220101 -> 2022년생, 230202 -> 1923년생)
		// (단, 오늘 날짜 기준으로 생일이 지났으면 +1살, 안 지났으면 +0로 한다.)
		// (올해 기준 +- 100살까지만 구한다.)

		String birth = "000107";
		
		String birth1 = "";
		String birthYear = birth.substring(0, 2);
		if ((Integer.parseInt(birthYear) <= 23)) {
			birth1 = "20".concat(birthYear);
		} else {
			birth1 = "19".concat(birthYear);
		}
		
		int birthday = Integer.parseInt(birth.substring(2));
		int age = (Integer.parseInt(birth1) - 2023);
		
		if (age < 0) {
			age = -(age);
		}
		if (birthday < 0404) {
			age++;
		}
		System.out.println(age);

		// 문제 5] 중복 문자 갯수 세기
		// 입력> aaabbccceedddd
		// 출력> a 3개, b 2개, c 3개, e 2개, d 4개

//		String q5 = "aaabbccceedddd";
//		byte[] q5bytes = q5.getBytes();
//		int count5 = 0;
//		byte q5byte = q5bytes[0];
//
//		for (int i = 0; i < q5.length(); i++) {
//				if(q5bytes[i] == q5byte) {				
//					count5++;
//				}
//				if (q5bytes[i] != q5byte) {
//					System.out.print((char) (q5byte) + "의 갯수 : " + count5 + " ");
//					q5byte = q5bytes[i];
//					i--;
//					count5 = 0;
//				}
//			}
		
		
		
		
	//중복 문자가 몇개?
	//a~z:26개
	// 배열 인덱스 -> 0~26개 크기의 배열 (0->a)
	//아스키 코드 a=97 / b-a=1 b의 index = 1
		
			
		}

	}


