package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO -> Data Access Object 
	//JDBC 연결
	//1) ojdbc를 추가
	//2) DAO
	
	//java -> DB 연결할 떄 쓰는 객체 1
	protected Connection conn =null;
	
	//Select(조회) 결과값 반환 받는 객체  3
	//Select 한 결과를 자바로 전달
	protected ResultSet rs = null;
	
	//Query문(sql문)을 가지고 실행하는 객체 2
	//1) sql문 실행해주는 객체
	protected PreparedStatement pstmt = null;
	
	//2) sql문 실행해주는 객체
	protected Statement stmt = null;
	
	
	//DB 접속 정보
	String driver = "oracle.jdbc.driver.OracleDriver"; //그대로 사용
	//                            |@접속할 아이피:접속할 포트:DB이름 -> 디벨로퍼 관리자 우클릭 속성 아래 세부정보에서 확인 
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	String id = "hr"; // 관리자 아이디 패스워드
	String pw = "hr";
	
	//DB 연결
	public void conn() {
		try {
			//1. 드라이버 로딩
			Class.forName(driver); //try/catch문 사용
			//2.DB연결
			conn= DriverManager.getConnection(url, id, pw); //try/catch문 사용
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//DB 연결 해제 / 실행 반대로 해제
	public void disconn() {
		try {
			//결과 조회
			if(rs != null) { // null -> 한번이라도 사용시 null X
				rs.close();
			}
			//sql 실행
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			//db 연결
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
