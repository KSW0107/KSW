package practice;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1] 문자열 뒤집기
		// 예시 : 입력 > "12345678"
		// 출력 > "87654321"
		System.out.println("Q1. 입력 > ");
		String str = sc.nextLine();
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);

		// 문제 2] 문자열 개수 세기
		// 입력되는 문자열을 뒤집어 출력하라
		// 알파벳, 숫자, 공백의 갯수
		System.out.println("Q2. 입력");
		str = sc.nextLine();
		int aph = 0;
		int num = 0;
		int blink = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				aph++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				aph++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num++;
			} else if (str.charAt(i) == ' ') {
				blink++;
			}
		}
		System.out.println("알파벳 : " + aph + " 숫자 : " + num + " 공백 : " + blink);

		// 문제 3] 문자열 압축
		// 예시 : 입력 >"YYYEEDDDYYYMMMAAA";
		// 출력 >Y3E2D3Y3M3A3
		
		// 문제 4] 생년월일 입력 후 나이 출력하기(220101 -> 2022년생, 230202 -> 1923년생)
		// (단, 오늘 날짜 기준으로 생일이 지났으면 +1살, 안 지났으면 +0로 한다.)
		// (올해 기준 +- 100살까지만 구한다.)
		// 예시)
		// 입력> 950101
		// 출력> 29
		// 입력> 001013
		// 출력> 23

		System.out.println("Q4 입력 ex) 000101 > ");
		str = sc.nextLine();
		String birthYear = str.substring(0, 2);
		String birthDay = str.substring(2);

		if (Integer.parseInt(birthYear) < 23) {
			birthYear = "20".concat(birthYear);
		} else {
			birthYear = "19".concat(birthYear);
		}

		if (Integer.parseInt(birthDay) < 0404) {
			System.out.println(2023 - Integer.parseInt(birthYear) + 1);
		} else {
			System.out.println(2023 - Integer.parseInt(birthYear));
		}

		// 문제 5] 알파벳 중복 문자 갯수 세기
		// 입력> aaabbccceedddd
		// 출력> a 3개, b 2개, c 3개, e 2개, d 4개
		System.out.println("Q5. 입력 > ");
		str = sc.nextLine();
		int[] count1 = new int[26];

		for (int i = 0; i < str.length() - 1; i++) {
			char comparison = str.charAt(i);
			count1[comparison - 'a']++;
		}

		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != 0) {
				System.out.println((char) (97 + i) + " " + count1[i] + "개");
			}
		}

	}

}
