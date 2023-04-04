package com.yedam.API;

public class SystemExample {

	public static void main(String[] args) {

		// System 클래스
		// System.exit(0) -> 최대한 사용 X

//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.exit(0); // 프로그램 강제 종료
//			}
//			System.out.println("프로그램 종료"); // 강제종료 당해 여기까지 도달하지 못함
//		}

		
		//현재 시간 읽기
		long time = System.nanoTime(); //시작점
		
		int sum = 0;
		
		for(int i=0;i<=1000000; i++) {
			sum += i;
		}
		
		
		long time2 = System.nanoTime(); //끝점
		
		System.out.println(time);
		System.out.println(time2);
		System.out.println("1~1000000의 합 : " + sum);
		System.out.println("소요 시간 : " +(time2- time)+" 나노 초 소요");
		
		System.out.println(System.currentTimeMillis());
		
	
		
		
	}

}
