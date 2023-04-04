package HW0404;

public class StringGame {
	String answer;
	byte[] answerAry = null;
	char[] inputanswerAry = null;
	String inputanswer = "";
	String data = "";

	StringGame() {
		resetGame();
	};
	
	void resetGame() {
		
		answerAry = null;
		inputanswerAry = null;
		inputanswer = "";
		data = "";
		
		int wordNum = (int) (Math.random() * 4);
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
		
	}

	void setCharData(char alp) {
		answerAry = answer.getBytes();

		data += alp + " ";

		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다");
		System.out.println(inputanswer);

		if (answer.indexOf(alp) != -1) {
			System.out.println("문자열을 구성하는 문자입니다.");
			inputanswer += alp + " ";
		} else {
			System.out.println("문자열을 구성하는 문자가 아닙니다");
		}
	}

	void setStrData(String input) {
		if (input.equals(answer)) {
			System.out.println("정답입니다");
		} else if (answer.length() != input.length()) {
			System.out.println("문자열의 길이가 맞지않습니다");
		} else {
			for (int i = 0; i < answer.length(); i++) {
				if (answer.charAt(i) == input.charAt(i)) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}

	void showCharData() {
		System.out.println("현재까지 입력된 문자열의 문자들은 다음과 같습니다");
		System.out.println(data);
	}

	void init() {
		System.out.println("게임을 새로 진행합니다");
		resetGame();
	
	}
}
