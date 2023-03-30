package com.yedam.oop;

public class Student {
	//학생이름 ,학번 ,국영수 점수
	//기본 생성자와 모든 데이터 초기화 가능
	//학생 정보 출력 getInfo()
	//1) 총점
	//2) 평균
	//이름 : 김또치
	//학번 : 20230330
	//총점 : 200
	//평균 : 68.xxxx
	String name;
	String no;
	int kor;
	int eng;
	int math;
	
	Student(){	
	};
	
	Student(String name, String no, int kor, int eng, int math){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+no);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(double)(kor+eng+math)/3);
	}
	
	
}
