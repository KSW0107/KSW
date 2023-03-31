package com.yedam.access;

public class Student {
	// 이름,학과,학년,과목별 점수
	// programing, database, os 과목
	// 모든 필드 -> 접근 제한자 private
	// setter을 통해 필드 초기롸
	// getter를 통해서 필드(데이터)reading
	// fetInfo 활용해서 학생 정보 출력

	// 필드
	private String stdName;
	private String major;
	private String stdGrade;
	private int programing;
	private int database;
	private int os;

	// 생성자

	// 메소드
	// setter
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	// getter
	public String getStdName() {
		return stdName;
	}

	// 우클릭 > 소스 > 게터 세터 셋팅
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStdGrade() {
		return stdGrade;
	}

	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}

	public int getPrograming() {
		//programing 점수를 0.5배 해서 성적을 표현
		return (int)(programing*1.5);
	}

	public void setPrograming(int programing) {
		// 만약 programing 점수가 0미만의 점수가 들어올 경우
		// 그 점수를 0으로 처리, 그렇지 않으면 입력한점수 객체에 저장
		//1)
//		if (programing < 0) {
//			this.programing = 0;
//			return;
//		} else {
//			this.programing = programing;
//		}
		//2)
		this.programing = (programing<0) ? 0 : programing;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

}
