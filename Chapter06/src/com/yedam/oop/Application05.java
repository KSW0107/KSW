package com.yedam.oop;

import java.util.Scanner;

public class Application05 {
	public static void main(String[] args) {
		// 클래스 + 배열 -> Student[] ary = new Student[10] -> 10개의 공간에 학생 객체 저장
		// int + 배열 -> int[] ary = new int[10]; -> 10공간에 정수

		// 1. 학생 수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료
		Scanner sc = new Scanner(System.in);
		int stdCount = 0;
		Student[] stdAry = null;

		while (true) {
			System.out.println("1. 학생 수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료");
			System.out.println("메뉴 입력 >");
			String selectNo = sc.nextLine();

			if (selectNo.equals("1")) {
				System.out.println("학생 수를 입력 >");
				stdCount = Integer.parseInt(sc.nextLine());
			} else if (selectNo.equals("2")) {
				// 입력 받은 학생의 수 만큼의 배열 생성
				stdAry = new Student[stdCount];
				for (int i = 0; i < stdCount; i++) {
					//i번째 배열에 학생클래스를 활용한 객체생성
					stdAry[i] = new Student();
					// 학생들의 정보를 입력
					// 객체를 생성하고 객체의 정보를 저장한 다음 -> 배열에 보관
					System.out.println((i+1)+"번째 학생 이름 >");
					String name =sc.nextLine();
					stdAry[i].name = name;
					
					System.out.println("국어 성적 >");
					int kor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = kor;
					
					System.out.println("영어 성적 >");
					int eng = Integer.parseInt(sc.nextLine());
					stdAry[i].math = eng;
					
					System.out.println("수학 성적 >");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math = math;
				}
			} else if (selectNo.equals("3")) {
				for(int i=0; i<stdCount; i++) {
					System.out.println(stdAry[i].name + "의 학생성적");
					System.out.println("총점 : "+ (stdAry[i].kor+stdAry[i].math+stdAry[i].eng));
					System.out.println("총점 : "+ (stdAry[i].kor+stdAry[i].math+stdAry[i].eng)/3);
				}
			} else if (selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
}
