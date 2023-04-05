package Test0405;

public class CardPayment implements Payment{
	double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	@Override
	public int online(int price) {
		return (int)(price - (price*(ONLINE_PAYMENT_RATIO+cardRatio)));
	}

	@Override
	public int offline(int price) {
		return(int)(price - (price*(OFFLINE_PAYMENT_RATIO+cardRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO+cardRatio));
		System.out.println("온라인 결제 시 총 할인율 : "+ (OFFLINE_PAYMENT_RATIO+cardRatio));
	}
	
}
