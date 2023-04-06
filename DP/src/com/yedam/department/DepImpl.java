package com.yedam.department;

import java.util.List;
import java.util.Scanner;

public class DepImpl {
	Scanner sc = new Scanner(System.in);
	
	
	public void getDepartmentsList() {
		List<DepDTO> list = DepDAO.getInstance().getDepartmentsList();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("부서번호 : "+list.get(i).getDepartmentId());
			System.out.println("부서이름 : "+list.get(i).getDepartmentName());
			System.out.println("관리자 번호 : "+list.get(i).getManagerId());
			System.out.println("지역 번호 :"+list.get(i).getLocationId());
		}		
	}
	
	
	
	public void getDepartment() {
		System.out.println("조회할 부서번호 >");
		int departmentId = Integer.parseInt(sc.nextLine());
		DepDTO dep = DepDAO.getInstance().getDepartment(departmentId);
		
		System.out.println("부서번호 : " +dep.getDepartmentId()); 
		System.out.println("부서명 :" +dep.getDepartmentName());
		System.out.println("관리자 번호 : " +dep.getManagerId());
		System.out.println("지역 번호 : "+dep.getLocationId());
		
	}
	
	public void depAdd() {
		DepDTO dep = new DepDTO();
		
		System.out.println("부서번호 > ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("부서이름 >");
		String depName = sc.nextLine();
		
		dep.setDepartmentId(depId);
		dep.setDepartmentName(depName);
		
		int result = DepDAO.getInstance().depAdd(dep);
	}
	
	public void depUpdate() {
		DepDTO dep = new DepDTO();
		System.out.println("부서번호 입력 >");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("수정 관리자 번호 > ");
		int manId = Integer.parseInt(sc.nextLine());
		
		dep.setDepartmentId(depId);
		dep.setManagerId(manId);
		
		
		int result = DepDAO.getInstance().depUpdate(dep);
		
		if (result > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		
		
	}
	
	public void depDelete() {
		System.out.println("삭제 부서번호 >");
		int depId = Integer.parseInt(sc.nextLine());

		int result = DepDAO.getInstance().depDelete(depId);

		if (result > 0) {
			System.out.println("정상 삭제");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
}
