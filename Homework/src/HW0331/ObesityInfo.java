package HW0331;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public void getInformation() {
		String strBmi = "";
		
		if(getObesity()<=18.5) {
			strBmi = "저체중";
		}else if(getObesity()<=22.9) {
			strBmi = "정상";
		}else if(getObesity()<=24.9) {
			strBmi = "과체중";
		}else {
			strBmi = "비만";
		}		
		System.out.println("이름 : "+name+" | 키 : "+height+" | 몸무게 : "+weight+" | 비만도 : "+ strBmi);
	}
	
	public double getObesity() {
		return (weight - getStandardWeight(height))/getStandardWeight(height)*100;
	}
}
