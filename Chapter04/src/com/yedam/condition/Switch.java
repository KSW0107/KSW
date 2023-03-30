package com.yedam.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int number = (int)(Math.random()*6+1);
		
		System.out.println(number);
		
		switch(number) {
		case 1 :
			System.out.println("1�� ����");
			break;
		case 2 :
			System.out.println("2�� ����");
			break;
		case 3 :
			System.out.println("3�� ����");
			break;
		case 4 :
			System.out.println("4�� ����");
			break;
		case 5 :
			System.out.println("5�� ����");
			break;
		default:
			System.out.println("6�� ����");
			break;
		}
		
		//���� Ȯ��
		char grade = 'B';
		
		switch (grade) {
		case 'A' :
			System.out.println("A���� ���");
			break;
		case 'B' :
			System.out.println("B���� ���");
			break;
		case 'C' :
			System.out.println("C���� ���");
			break;
		case 'D' :
			System.out.println("D���� ���");
			break;
			
			
		}
		//���ڿ� Ȱ�� switch
		String position = "����";
		
//		switch (position) {
//		case "����" :
//			System.out.println("������ : 1000����");
//			break;
//		case "����" :
//			System.out.println("������ : 500����");
//			break;
//		case "����" :
//			System.out.println("������ : 300����");
//			break;
//		default :
//			System.out.println("������ : 100����");
//			break;
//		}
		
		//�Է��� ������ ������� ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�>");
		int score = sc.nextInt();
		//90�� �̻� A
		//80�� �̻� B
		//70�� �̻� C
		//60�� �̻� D
		
//		char score1 = String.valueOf(score).charAt(0);
//		
//		switch(score1) {
//		case '9':
//			System.out.println("A");
//			break;
//		case '8':
//			System.out.println("B");
//			break;
//		case '7':
//			System.out.println("C");
//			break;
//		case '6':
//			System.out.println("D");
//			break;
//		default :
//			System.out.println("E");
//			break;
//		}
		
		int score2 = score/10;
		switch(score2) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("E");
			break;
		}
	}

}
