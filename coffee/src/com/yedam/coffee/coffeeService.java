package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class coffeeService {
	Scanner sc = new Scanner(System.in);

	public void getAllCoffeeInfo() {
		
		List<coffeeDTO> list = coffeeDAO.getInstance().getAllCoffeeInfo();

		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("메뉴 : " + list.get(i).getCofName());
			System.out.println("가격 : " + list.get(i).getCofPrice());
		}
	}

	public void getCoffeeInfo() {
		System.out.println("메뉴 입력 > ");
		String coffeeName = sc.nextLine();
		coffeeDTO cofDto = coffeeDAO.getInstance().getCoffeeInfo(coffeeName);

		if (cofDto == null) {
			System.out.println("해당 메뉴는 존재하지않음");
		} else {
			System.out.println(
					"메뉴 : " + cofDto.getCofName() + " 가격 : " + cofDto.getCofPrice() + " 설명 : " + cofDto.getCofExpain());
		}
	}

	public void coffeeAdd() {
		coffeeDTO cofDto = new coffeeDTO();

		System.out.println("추가하려는 메뉴 이름 >");
		String cofName = sc.nextLine();
		System.out.println("추가하려는 메뉴 가격 >");
		int cofPrice = Integer.parseInt(sc.nextLine());
		System.out.println("추가하려는 메뉴 설명 >");
		String explain = sc.nextLine();

		cofDto.setCofName(cofName);
		cofDto.setCofPrice(cofPrice);
		cofDto.setCofExpain(explain);

		int result = coffeeDAO.getInstance().coffeeAdd(cofDto);

		if (result == 1) {
			System.out.println("메뉴 등록 성공");
		} else {
			System.out.println("메뉴 등록 실패");
		}
	}

	public void coffeeDelete() {
		System.out.println("삭제하려는 메뉴 이름 >");
		String coffeeName = sc.nextLine();

		int result = coffeeDAO.getInstance().coffeeDelete(coffeeName);

		if (result == 1) {
			System.out.println("메뉴 삭제 성공");
		} else {
			System.out.println("메뉴 삭제 실패");
		}
	}

	public void coffeeSale() {
		coffeeDTO cofDto = new coffeeDTO();
		System.out.println("판매하려는 메뉴 이름 > ");
		String coffeeName = sc.nextLine();
		
		cofDto.setCofName(coffeeName);

		int result = coffeeDAO.getInstance().coffeeSale(cofDto);

		if (result == 1) {
			System.out.println("메뉴 판매 성공");
		} else {
			System.out.println("메뉴 판매 실패");
		}
	}

	public void getAllCoffeeSale() {
		List<coffeeDTO> list = coffeeDAO.getInstance().getAllCoffeeSale();

		for (int i = 0; i < list.size(); i++) {
			System.out.println("메뉴 : " + list.get(i).getCofName());
			System.out.println("판매갯수 : " + list.get(i).getCofsales());
			System.out.println("판매금액 : " + list.get(i).getAllsales());
		}
	}
}
