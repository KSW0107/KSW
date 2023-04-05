package Test0405;

public class DGBCard extends Card{

	String company = "대구은행";
	String cardStaff;
	
	public DGBCard(int cardNo, String vaildDate, int cvc, String cardStaff) {
		super(cardNo, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO :"+ cardNo +", 유효기간 : "+validDate+" CVC : "+cvc+")" );
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
}
