package com.yedam.loop;

import java.util.Scanner;

public class WhilerExample01 {

	public static void main(String[] args) {
		
		//1~100 ���̿��� 2�� ����� ���
		int i = 1;
		while (i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		//�޴� Ȱ��
		Scanner sc = new Scanner(System.in);
//		int menuNo = 0;
//		while(menuNo !=4) {
//			System.out.println("1.���� | 2.���� | 3.���� | 4.����");
//			System.out.println("�޴����� >");
//			//1~4
//			menuNo = sc.nextInt();
//			switch(menuNo) {
//			case 1:
//				System.out.println("���� ����");
//				break;
//			case 2:
//				System.out.println("���� ����");
//				break;
//			case 3:
//				System.out.println("���� ����");
//				break;
//			case 4:
//				System.out.println("���α׷� ����");
//				break;
//			}
//		}
		
		
//		//������
//		int money;
//		int menu = 0;
//		System.out.println("=====Insert Coin=====");
//		money = sc.nextInt();
//		//����
//		//1)���� 1ȸ ����� �ݾ� 500�� ����
//		//2)���� ������ �ݾ׸�ŭ�� �ݺ����� ������. �ݾ��� ������ �� �� ���� �ݾ��̸�, �ݺ��� ����
//		//3)������ ��ȸ�� ��� ���Ҵ��� ǥ���ϴ� ���
//		
//		while(money >= 0) {
//			if(money < 500) {
//				System.out.println("�ݾ��� �����մϴ�");
//				break;
//			}else {
//				//3)
//				System.out.println(money/500+"���� ��ȸ�� ���ҽ��ϴ�.");
//				
//				System.out.println("1. ���������� | 2. �� �� ���߱� | 3. ����");
//				System.out.println("�Է� > ");
//				menu = sc.nextInt();
//				if(menu==1) {
//					System.out.println("����������");
//					money -= 500;
//				}else if(menu==2) {
//					System.out.println("�� �� ���߱�");
//					money -= 500;
//				}else if(menu==3) {
//					System.out.println("������ ����");
//					break;
//				}else {
//					System.out.println("���� �޴��Դϴ�");
//				}
//			}
//			
//		}
		
		
//		int month;
//		do {
//			System.out.println("�ùٸ� ���� �Է��ϼ���");
//			month = sc.nextInt();
//		}while(month<1 || month>12);

		
		
		//break, continue
		//���� ���� -> �׻� true -> �׻� ���Ǹ��� -> �ݺ����� ��� ����
//		while(true) {
//			int num = (int)(Math.random()*6+1);
//			if(num==6) {
//				System.out.println("while ����");
//				break;
//			}
//		}
		
		//��ø for�� �ȿ����� break;
		//���Ե� for���� ���� �ٱ� for�� ��ø for�� ���� ��� ����
		for(int j = 0 ;j <=10 ; j++) {
			for(int k=0;k<=10;k++) {
				if(j+k==4) {
					System.out.println("j + k = "+(j+k));
					break;
				}
			}
		}
		
		
		//��(�̸�)
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
				break Outter;
				}
			}
		}
		
		//continue
		//continue �������� �ݺ��� *�����*
		for(int j = 0; j<=10; j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
		
///////////////////////////////////////////////
	}
}
