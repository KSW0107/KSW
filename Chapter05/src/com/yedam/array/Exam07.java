package com.yedam.array;

public class Exam07 {

	public static void main(String[] args) {
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			/* 해당 부분 한줄로 코딩 */
			counter[answer[i] - 1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			/* 해당 부분 코딩 */
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		///////////////////////////////////////////
//		
//		for (int i = 0; i < answer.length; i++) {
//			/* 해당 부분 한줄로 코딩 */
//			counter[answer[i]-1]++;
//			//answer[0] =1
//			//counter [answerp0[-1]++ = counter[0]++
//			}
//		
//		for (int i = 0; i < counter.length; i++) {
//			/* 해당 부분 코딩 */
//			for(int j = 0; j<counter[i]; j++) {
//				System.out.print("*");
//		}
//			System.out.println();

//	}
	}
}