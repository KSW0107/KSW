package com.yedam.department;

import java.util.Scanner;

public class HumanResource {
	
	DepImpl di = new DepImpl();
	Scanner sc = new Scanner(System.in);
	
	public HumanResource() {run();}
	
	private void run() {
		while(true) {
			System.out.println("1.전체조회 | 2.부서정보조회 | 3.부서생성 | 4.부서수정 | 5.부서삭제 | 99.종료");
			System.out.println("입력 >");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				di.getDepartmentsList();
			}else if(menu==2) {
				di.getDepartment();
			}else if(menu==3) {
				di.depAdd();
			}else if(menu==4) {
				di.depUpdate();
			}else if(menu==5) {
				di.depDelete();
			}else if(menu==99) {
				System.out.println("종료");
				break;
			}
		}
	}
	
}
