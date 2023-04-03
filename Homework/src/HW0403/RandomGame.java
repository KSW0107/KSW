package HW0403;

import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Keypad keypad = null;
		int game = (int)(Math.random()*2); 
		Scanner sc = new Scanner(System.in);
		
		
		if(game==1) {
			keypad = new ArcadeGame(); 	
		}else if(game==0) {
			keypad = new RPGgame(); 	
		}
		
		while(true) {
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			int menu = sc.nextInt();
			
			if(menu==1) {
				keypad.leftUpButton();
			}else if(menu==2) {
				keypad.leftDownButton();
			}else if(menu==3) {
				keypad.rightUpButton();
			}else if(menu==4) {
				keypad.rightDownButton();
			}else if(menu==5) {
				keypad.changeMode();
			}else if(menu==0) {
				if(keypad instanceof ArcadeGame) {
					keypad = new RPGgame(); 	
				}else if(keypad instanceof RPGgame) {
					keypad = new ArcadeGame(); 	
				}
			}else if(menu==9) {
				System.out.println("EXIT");
				break;
			}else {
				System.out.println("숫자를 잘 못입력했습니다");
			}
		}

	}
}
