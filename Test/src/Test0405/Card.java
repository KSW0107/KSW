package Test0405;

public class Card {
	int cardNo;
	String validDate;
	int cvc;
	
	public Card(int cardNo, String vaildDate, int cvc) {
		this.cardNo = cardNo;
		this.cvc = cvc;
		this.validDate = vaildDate;
	}

	public int getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	
	public void showCardInfo() {
		System.out.println("Card NO :" + cardNo + "유효기간 : " + validDate + "CVC : " + cvc);
	}
	
}
