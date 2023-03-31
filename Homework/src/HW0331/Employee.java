package HW0331;

public class Employee {
	//필드
	String name;
	int salary;
	//생성자
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	//메소드
	public void getInfomation() {
		System.out.println(name+" | "+ salary);
	}
	
	public void print() {
		System.out.println("Employee Class");
	}
	
}
