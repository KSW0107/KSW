package com.yedam.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	private Scanner sc = new Scanner(System.in);
	int menu = 0;
	int[] lotto = new int[6];
	List<int[]> list = new ArrayList<>();
	int money;

	public LottoApp() {
		run();
	}

	// 메뉴 선택 로또 프로그램
	private void run() {
		while (menu != 99) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.로또 생성 | 2.로또 조회 | 99.프로그램 종료");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				// 로또 번호 조회
				showInfo();
				break;
			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	private void showInfo() {
		System.out.println("구매한 금액 : " + money);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println("------------------------------");
			}
			System.out.print((i % 5 + 1) + "번 > ");
			for (int j = 0; j < list.get(i).length; j++) {
				System.out.printf("%-4d", list.get(i)[j]);
			}
			System.out.println();
		}
	}

	private void makeLotto() {
		// 1. 입력한 금액만큼 로또 번호 생성
		// 예시) 10,000원 -> 6개짜리 번호 10개
		// list에 저장
		System.out.println("금액 투입 (1000원 1줄) > ");
		money = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= money / 1000; i++) {
			list.add(makeNumber());
		}
	}

//	private void makeNumber() {
//		// 로또 번호 6개 출력, 중복 X, 정렬 X
//		for (int i = 0; i < lotto.length; i++) {
//			int lottoNum = (int) (Math.random() * 45 + 1);
//			boolean check = true;
//
//			for (int j = 0; j < i; j++) {
//				if (lottoNum == lotto[j]) {
//					check = false;
//					i--;
//					break;
//				}
//			}
//			if(check) {
//				lotto[i] = lottoNum;
//			}
//
//		}
//		System.out.println(Arrays.toString(lotto));
//	}

	private int[] makeNumber() {
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int lottoNum = (int) (Math.random() * 45 + 1);
			lotto[i] = lottoNum;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lottoNum) {
					i--;
				}
			}
		}
		return lotto;
	}
}
