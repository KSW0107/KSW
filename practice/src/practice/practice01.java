package practice;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		//Multiples of 3 and 5 //233168
		int sum = 0;
		for(int i = 1; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		//문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 
		//입력받은 문자를 이어서 출력하는 프로그램 
		
		int[] number = new int[10];
		String answer = "";
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<number.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하시오");
			number[i] = sc.nextInt();
			answer += number[i];
		}
		System.out.println(answer);
		
	}

}
