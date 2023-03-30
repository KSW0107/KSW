package com.yedam.loop;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
//		//반복문 사용 X
//		int sum = 0;
////		sum = sum+1;
////		sum = sum+2;
////		sum = sum+3;
////		sum = sum+4;
////		sum = sum+5;
//		
//		System.out.println(sum);
//
//		//반복문(for) 사용
//		for(int i =1 ; i<=5; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
//		
//		//1~100 사이의 짝수 구하기
//		//짝수 규칙 = 짝수%2 = 0
//		//홀수 규칙 = 짝수%2 != 0
//		
//		for(int i = 1; i <=100; i++) {
//			if(i%2==0) {
//				System.out.println(i + "는 짝수");
//			}else {
//			System.out.println(i + "는 홀수");
//		} 
//		}
//		
//		//입력한 숫자에 대한 구구단
//		
//		//구구단만 출력 -> 입력 구구단 출력
//		//2단
//		for(int i =1; i<=9 ; i++) {
//			System.out.println("2 X"+i+"=" + (2*i));
//		}
//		
//		//입력 구구단
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 입력 > ");
//		int gugu = sc.nextInt();
//		
//		for(int i =1; i<=9 ; i++) {
//			System.out.println(gugu+"X"+i+"=" + (gugu*i));
//		}
//		
//		//총 구구단
//		for(int i =1; i<=9 ; i++) {
//			for(int j =1; j<=9 ; j++) {
//				System.out.println(i+"X"+j+"="+(i*j));
//			}
//		}
//		
//		//입력한 값에 대한 총합, 평균, 최대값, 데이터를 받을 개수 스캐너 활용해서 데이터 입력
//		//총합 : 입력 하자마자 총합이라는 변수에 누적 합계
//		//평균 : 총합 / 데이터 입력 개수
//		//최대값 : 입력 데이터와 기존 데이터를 비교해 더 큰 것 
//		//최소값 : 입력 데이터와 기존 데이터를 비교해 더 작은 것 
//		int total = 0;;
//		double avg = 0;
//		int max = 0;
//		int min = 0;
//		
//		//데이터 입력
//		System.out.println("데이터 입력 개수 >");
//		
//		//입력한 데이터 갯수 입력 받음
//		int count = sc.nextInt();
//		
//		for(int i =0 ; i<count; i++) {
//			System.out.println("데이터 입력 >");
//			int data = sc.nextInt();
//			//총합
//			total += data;
//			
//			//최대값, 최소값 초기값 설정
//			if(i==0) {
//				max = data;
//				min = data;
//			//최대값, 최소값 비교 후 입력
//			}else {
//				if(max < data) {
//					max = data;
//				}
//				if(min > data) {
//					min = data;
//				}
//			}
//		}
//		avg = total/count;
//		
//		System.out.printf("총합 : %d, 평균 : %5.1f,최대값 : %d,최소값 : %d",total, avg, max, min);
//		
		
		//up & down
		//임의 랜덤값 1~100 사이의 하나의 정수를 추출해서
		//5번 기회 안에 랜덤값을 맞추는 프로그램 구현
		
		int answer = (int)(Math.random()*100+1);
		
		Scanner quiz = new Scanner(System.in);
		for(int i=5; i>=1; i--) {
			System.out.printf("숫자 입력 >");
			int input = quiz.nextInt();
			
			if(i!=1) {
				if(input>answer) {System.out.println("down");}
				else if(input<answer) {System.out.println("up");}
				else {System.out.println("정답입니다"); break;}
				if(i>1) {System.out.println("남은기회 :" + (i-1));}					
			}else if(i==1) {
				System.out.println("실패하였습니다");
			}
		}
		
		
//////////////////////////////////////////////////////////////////////
	}

}
