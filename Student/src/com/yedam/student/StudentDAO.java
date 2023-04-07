package com.yedam.student;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{
	private static StudentDAO studentDao = null;
	
	private StudentDAO() {}
	
	public static StudentDAO getInstance() {
		if(studentDao == null) {
			studentDao = new StudentDAO();
		}
		return studentDao;	
	}
	
	//학생 조회
	public List<StudentDTO> getStudentInfo() {
		List<StudentDTO> list = new ArrayList<>();
		StudentDTO stu = null;
		
		try {
			conn();
			String sql = "SELECT * FROM student";
			pstmt = conn.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				stu = new StudentDTO();
				
				stu.setStudentNo(rs.getInt("student_no"));
				stu.setStudentName(rs.getString("student_name"));
				stu.setMajor(rs.getString("major"));
				stu.setScore(rs.getInt("score"));
				
				list.add(stu);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//학생 등록
	
	public int StudentAdd(StudentDTO stu) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO student VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,stu.getStudentNo());
			pstmt.setString(2, stu.getStudentName());
			pstmt.setString(3, stu.getMajor());
			pstmt.setInt(4, stu.getScore());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		return result;
	}
	
	public int studentDelete(int studentNo) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM student WHERE student_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, studentNo);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	public int studentUpdate(StudentDTO stu) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET major = ? WHERE student_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stu.getMajor());
			pstmt.setInt(2, stu.getStudentNo());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
