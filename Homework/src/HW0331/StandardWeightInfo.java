package HW0331;

public class StandardWeightInfo extends Human{
	
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	public void getInformation() {
		System.out.println("이름 : "+name+" | 키 : "+height+" | 몸무게 : "+weight+" | 표준체중 : "+ getStandardWeight(height));
	}
	
	public double getStandardWeight(int height) {
		return ((height-100) * 0.9);
	}
}
