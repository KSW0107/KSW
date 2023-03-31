package HW0331;

public class Human {
	String name;
	int height;
	int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation(){
		System.out.println("이름 : "+name+" | 키 : "+height+" | 몸무게 : "+weight);
	}
}
