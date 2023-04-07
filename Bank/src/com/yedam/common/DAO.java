package com.yedam.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	protected Connection conn = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstmt = null;
	protected Statement stmt = null;

	
	//외부파일로 데이터 이동
	Properties pro = new Properties();
	String driver = ""; 
	String url = "";
	String id = ""; 
	String pw = "";
	
	
	
	public void conn() {
		getProperties();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		public void disconn() {
			try {			
				if(rs != null) { 
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
}
		
		//DB 접속 정보 호출 메소드 외부파일로 연결
		private void getProperties() {
			try {	
				FileReader resource = new FileReader("src/config/db.properties");
				pro.load(resource);
				driver = pro.getProperty("driver");
				url = pro.getProperty("url");
				id= pro.getProperty("id");
				pw = pro.getProperty("pw");
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
