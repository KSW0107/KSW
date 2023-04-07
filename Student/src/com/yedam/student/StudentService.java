package com.yedam.student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	public void getStudentInfo() {
		int scoreSum = 0;
		int count = 0;
		List<StudentDTO> list = StudentDAO.getInstance().getStudentInfo();
		
		for(StudentDTO stu : list) {
			System.out.println("학생 번호 : "+stu.getStudentNo());
			System.out.println("학생 이름 : "+stu.getStudentName());
			System.out.println("학생 전공 : "+stu.getMajor());
			System.out.println("학생 점수 : "+stu.getScore());			
			scoreSum += stu.getScore();
			count++;
		}
			System.out.println("학생들의 총점 :" + scoreSum);
			System.out.println("학생들의 평균 :" + scoreSum/(double)count);
	}
	
	public void studentAdd() {
		StudentDTO stu = new StudentDTO();
		
		System.out.println("추가할 학생 번호 >");
		int studentNo = Integer.parseInt(sc.nextLine());
		System.out.println("추가할 학생 이름 >");
		String studentName = sc.nextLine();
		System.out.println("추가할 학생 전공 >");
		String major = sc.nextLine();
		System.out.println("추가할 학생 점수 >");
		int score = Integer.parseInt(sc.nextLine());
		
		stu.setStudentNo(studentNo);
		stu.setStudentName(studentName);
		stu.setMajor(major);
		stu.setScore(score);
		
		int result = StudentDAO.getInstance().StudentAdd(stu);
		
		if(result == 1) {
			System.out.println("추가 성공");
		}else if(result == 0){
			System.out.println("추가 실패");
		}
	}
	
	public void studentUpdate() {
		StudentDTO stu = new StudentDTO();
		
		System.out.println("수정하려는 학생 번호 >");
		int studentNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 전공 이름 >");
		String major = sc.nextLine();
		
		stu.setStudentNo(studentNo);
		stu.setMajor(major);
		
		int result = StudentDAO.getInstance().studentUpdate(stu);
		
		if(result == 1) {
			System.out.println("수정 성공");
		}else if(result == 0){
			System.out.println("수정 실패");
		}
		
	}
	
	public void studentDelete() {
		System.out.println("삭제하려는 학생 번호 >");
		int studentNo = Integer.parseInt(sc.nextLine());
		
		int result = StudentDAO.getInstance().studentDelete(studentNo);
		
		if(result == 1) {
			System.out.println("삭제 성공");
		}else if(result == 0){
			System.out.println("삭제 실패");
		}
	}
	
}
