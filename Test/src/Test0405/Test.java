package Test0405;

public class Test {
	public static void main(String[] args) {
		Card card = new TossCard(123, "221010", 333, "신빛용");
		
		card.showCardInfo();
		
		int price = 10000;
		
		card = new DGBCard(123, "221010", 333, "신빛용");
		
		card.showCardInfo();
		
		System.out.println("===================================================");
		
		Payment payment = new CardPayment(0.08);
		payment.showInfo();
		System.out.println("온라인 결제 금액 : "+payment.online(price));
		System.out.println("오프라인 결제 금액 : "+payment.offline(price));
		
		payment = new SimplePayment(0.05);
		payment.showInfo();
		System.out.println("온라인 결제 금액 : "+payment.online(price));
		System.out.println("오프라인 결제 금액 : "+payment.offline(price));
		
	}
}
