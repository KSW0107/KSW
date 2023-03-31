package HW0331;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new StandardWeightInfo ("홍길동", 168, 45);
		Human human2 = new ObesityInfo ("박둘이", 168, 90);
		
		human1.getInformation();
		human2.getInformation();
	}

}
