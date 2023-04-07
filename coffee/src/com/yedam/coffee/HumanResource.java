package com.yedam.coffee;

import java.util.Scanner;

public class HumanResource {
	Scanner sc =new Scanner(System.in);
	coffeeService cs = new coffeeService();
	
	public HumanResource() { run(); }
	
	private void run() {
		int menu = 0 ;
		while(true) {
			System.out.println("1.메뉴조회 | 2.메뉴상세조회 | 3.메뉴등록 | 4.판매 | 5.메뉴삭제 | 6.매출 | 7.종료");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				cs.getAllCoffeeInfo();
			}else if (menu == 2) {
				cs.getCoffeeInfo();
			}else if (menu == 3) {
				cs.coffeeAdd();
			}else if (menu == 4) {
				cs.coffeeSale();
			}else if (menu == 5) {
				cs.coffeeDelete();
			}else if (menu == 6) {
				cs.getAllCoffeeSale();
			}else if (menu == 7) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		
	}
}
