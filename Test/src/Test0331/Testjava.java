package Test0331;

import java.util.Scanner;

public class Testjava {
	public static void main(String[] args) {

		// Q1.
		int a = 10;
		double b = 2.0;

		System.out.println((int) (a + b));
		System.out.println((int) (a - b));
		System.out.println((int) (a * b));
		System.out.println((int) (a / b));

		// Q2.
		// false
		// true
		// false

		// Q3.
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money = " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.print(coinUnit[i] + "원 :" + (money / coinUnit[i]) + " 개 ");
			money = money % coinUnit[i];
		}
		System.out.println();
		// Q4.
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		// Q5.
		// 1)
		int maxDice = 0;
		int dice = 0;
		int countAry[] = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=== 1. 주사위 크기 2. 주사위 굴리기 3. 결과보기 4. 가장 많이 나온 수 5. 종료 ===");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("5~10 사이의 주사위의 최대숫자를 입력하시오 >");
				maxDice = sc.nextInt();
				if (maxDice < 5 || maxDice > 10) {
					System.out.println("5~10 사이의 숫자가 아닙니다.");
					maxDice = 0;
				}
			} else if (menu == 2) {
				countAry = new int[maxDice];
				int count = 0;
				do {
					dice = (int) (Math.random() * maxDice + 1);
					count++;
					for (int i = 0; i < maxDice; i++) {
						if ((i + 1) == dice) {
							countAry[i]++;
						} //for문 countAry[dice-1]++; 변환 가능
					}
				} while (dice != 5);
				System.out.println("5가 나올때까지 주사위를" + count + "번 굴렸습니다.");
			} else if (menu == 3) {
				for (int i = 0; i < maxDice; i++) {
					System.out.println((i + 1) + "은" + countAry[i] + "번 나왔습니다");
				}
			} else if (menu == 4) {
				int max = countAry[0];
				int maxnum = 1;
				for (int i = 0; i < maxDice; i++) {
					if (max < countAry[i]) {
						max = countAry[i];
						maxnum = i + 1;
					}
				}
				System.out.println("가장 많이 나온 수는 " + maxnum + "입니다.");
			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("숫자를 잘못 입력하였습니다.");
			}
		}
	}

}
