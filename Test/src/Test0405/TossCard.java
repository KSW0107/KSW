package Test0405;

public class TossCard extends Card{

	String company = "Toss";
	String cardStaff;

	
	public TossCard(int cardNo, String vaildDate, int cvc, String cardStaff) {
		super(cardNo, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}


	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO,"+ cardNo);
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
	
	
}
