package HW0331;

public class EmpDept extends Employee{
	//필드
	String depatmentName;
	
	//생성자
	EmpDept(String name, int salary, String depatmentName){
		super(name, salary);
		this.depatmentName = depatmentName;
	}

	public String getDepatmentName() {
		return depatmentName;
	}
	
	//getter
	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}

	@Override
	public void getInfomation() {
		System.out.println("이름 : "+name +" | 연봉 : "+salary+" | 부서 : "+depatmentName);
	}

	@Override
	public void print() {
		System.out.println("Employee Class\nEmpDept Class");
	
	}
	
	
		
}
