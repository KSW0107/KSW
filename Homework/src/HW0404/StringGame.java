package HW0404;

public class StringGame {
	String answer;
	byte[] answer1;
	String alp;
	char[] inputAlp = null;
	
	StringGame(){
		String[] word = {"Orange", "Game", "Phone", "Smart"};
		
		int wordNum  = (int)(Math.random()*4);
		
		switch (wordNum) {
		case 0:
			answer = "Orange";
			break;
		case 1:
			answer = "Game";
			break;
		case 2:
			answer = "Phone";
			break;
		case 3:
			answer = "Smart";
			break;
		}
	};
	
	void setCharData(String alp){
		answer1 = answer.getBytes();
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다");
		
		
		for(int i=0 ; i<answer.length(); i++) {
			if(alp == String.valueOf(answer1[i])) {
				System.out.println("문자열을 구성하는 문자입니다");
				this.alp += alp;
				byte[] answer1 = this.alp.getBytes();
			} else {
				System.out.println("문자열을 구성하는 문자가 아닙니다");
			}
		}
	}
	
//	setStrData();
//	
//	showCharData();
//	
//	init();
}
