package com.yedam.exe;

import java.util.Scanner;

import com.yedam.student.StudentService;

public class Humansource {
		StudentService ss = new StudentService();
		Scanner sc = new Scanner(System.in);


	public Humansource() {
		run();
	}
	
	public void run() {
		System.out.println("1.학생조회 | 2.학생등록 | 3.전공수정 | 4.학생삭제 | 5. 종료");
		int menu = Integer.parseInt(sc.nextLine());
		
		while(true) {
			if(menu==1) {
				ss.getStudentInfo();
			}else if(menu==2) {
				ss.studentAdd();
			}else if(menu==3) {
				ss.studentUpdate();
			}else if(menu==4) {
				ss.studentDelete();
			}else if(menu==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
	}

}
