package HW0404;

import java.util.Scanner;

public class WordGameExam {

	Scanner sc = new Scanner(System.in);

	boolean run = true;
	StringGame game = new StringGame();

	while(run){
		System.out.println("---------------------------------------------");
		System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
		System.out.println("---------------------------------------------");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("입력 값 > ");
			String alp = sc.nextLine();
			game.setCharData(alp);
			break;
		case 2:
//			game.setStrData();
			break;
		case 3:
//			game.showCharData();
			break;
		case 4:
//			game.init();
			break;
		case 5:
			run = false;
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴를 입력하셨습니다.");

		}
	}
}}