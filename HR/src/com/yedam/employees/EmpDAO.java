package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO extends DAO {
	// java -> JDBC -> DB -> Employees Table에 접근
	// Employees 조회,추가,수정,삭제 (CRUD)

	// SingleTon
	private static EmpDAO empDao = null;

	private EmpDAO() {

	}

	public static EmpDAO getInstance() {
		if (empDao == null) {
			empDao = new EmpDAO();
		}
		return empDao;
	}

	// CRUD
	// 1. 전체 조회
	// = SELECT * FROM employees;
	// EmpDTO 객체 1개 = 1개 row
	// list -> EmpDTO 객체를 담아서 사용 -> 전체 row 조회

	public List<EmpDTO> getEmployeesList() {
		// list, set, map
		// list -> 순서 사용 위해 사용

		List<EmpDTO> list = new ArrayList<>();
		// list[0] -> 첫번째 row

		EmpDTO emp = null;

		try {
			conn();
			String sql = "SELECT * FROM employees";
			// 1. statement => where절 조건 없으면 편함
			// "SELECT * FROM employees WHERE hire_date" +data
			// 2. preparedStatement => where절 조건 있어도 편함

			stmt = conn.createStatement(); //실행하도록 연결

			// SQL 실행
			rs = stmt.executeQuery(sql); // 조회결과 -> rs

			// sql 결과 조회
			// ResultSet -> next() - 다음 row가 존재하면 true, false
			while (rs.next()) {
				// 서로 다른 row를 서로 다른 객체에 저장하기위해 EmpDTO 새로 생성
				emp = new EmpDTO();

				emp.setEmployeeId(rs.getInt("employee_id")); // <- 조회된 컬럼명 그대로 입력/as시에 as이름이 들어가야함
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				// Char타입은 문자열로 받기

				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 2.단건조회
	public EmpDTO getEmployee(int employeeId) {
		EmpDTO emp = null;
		try {
			conn();

			String sql = "SELECT * FROM employees WHERE employee_id = ?";

			pstmt = conn.prepareStatement(sql); // sql 넣어 실행준비
			pstmt.setInt(1, employeeId); // (? 위치에 , 넣을 데이터)

			rs = pstmt.executeQuery();

			if (rs.next()) {
				emp = new EmpDTO();

				emp.setEmployeeId(rs.getInt("employee_id")); // <- 조회된 컬럼명 그대로 입력/as시에 as이름이 들어가야함
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));

				// 한건만 조회하기 때문에 list에 담지 않음
			}

		} catch (Exception e) {
			e.printStackTrace(); // 오류 추적해 출력
		} finally {
			disconn();
		}
		//emp == null -> rs.next() = false -> 데이터 조회 X
		//emp != null -> rs.next() = true -> 데이터 조회 O
		return emp;
	}

	
	//3. 추가
	public int empAdd(EmpDTO emp) {
		//데이터 입력 후 제대로 들어갔는지 사용하기 위한 용도
		//1행이 입력되었습니다
		//result = 1;
		
		
		
		int result = 0;
		try{
			conn();
			String sql = "INSERT INTO employees(employee_id, last_name, email, hire_date, job_id)"+
						 "VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			
			//DML 사용 할 때 쓰는 메소드
			//반환 1 또는 0
			//1: 데이터 정상 입력
			//0: 데이터 입력 안됨
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		
		return 0;
	}
	//4. 수정
	public int empUpdate(EmpDTO emp) {
		int result = 0;
		try {
			conn();
			String sql = "update employees set salary = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}	
		return result;
	}
	
	
	//5. 삭제
	public int empDelete(int employeeId) {
		int result = 0 ;
		try {
			conn();
			
			String sql = "delete from employees where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}
