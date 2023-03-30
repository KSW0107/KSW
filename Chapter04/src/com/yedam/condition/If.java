package com.yedam.condition;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		//������ ����
		//Math.random() -> 0 <= Math.random() <1 : �Ǽ�
		//���� : 0 ~ 1 -> 0.1111,0.44444...
		
		//40 ~ 99 ���� �����͸� ���� ����
		
		//0 <= Math.random() < 1
		
		//1) 0*60 <= Math.random()*60 < 1*60
		//1) 0<= Math.random()*60 < 60
		
		//2) 0 +40 <= Math.random()*60+40 < 60+40
		//2) 40 <= Math.random()*60+40 < 100
		
		//3)(int)40 <= (int)(Math.random()*60+40) < (int)100
		// -> 40 ~ 99
		int score = (int)(Math.random()*60+40);
		
		System.out.println(score);
		if(score >= 60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		//���� ������ �̿�
		String pass = (score>=60) ? "�հ�" : "���հ�";
		System.out.println(pass);
		
		//����
		//90 �̻� : A , 80�̻� : B, 70�̻� : C, 70�̸� : D
		if(score >= 90) {
			pass = "A";
		}else{
			if(score>=70) {
				pass = "C";
			}else {
				pass = "D";
			}
		}
		
		//if-esle
		if(score>=90) {
			pass= "A";
		}else if(score >=80) {
			pass = "B";
		}else if(score >=70) {
			pass = "C";
		}else {
			pass = "D";
		}
		
		
		//if-else + Math.random()
		//�ֻ��� ����
		//random �� - 0 <= Math.random() < 1
		//0*6 <= Math.random()*6 < 1*6
		//0 <= Math.random()*6 < 6
		//0+1 <= Math.random()*6+1 < 6+1
		//1 <= Math.random()*6+1 < 7
		//(int)1 <= (int)(Math.random()*6+1) < (int)7
		
		int number = (int)(Math.random()*6+1);
		
		if(number == 1) {
			System.out.println("1��");
		}else if(number ==2) {
			System.out.println("2��");
		}else if(number ==3) {
			System.out.println("3��");
		}else if(number ==4) {
			System.out.println("4��");
		}else if(number ==5) {
			System.out.println("5��");
		}else {
			System.out.println("6��");
		}
		
		
		//Scanner Ȱ��
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���ĺ� �Է� > ");
		
		String alp = sc.nextLine();
		//String -> char
		char alpabet = alp.charAt(0);
		//'A'(65) ~ 'Z'(90)
		//'a'(97) ~ 'z'(122)
		//'0'(48) ~ '9'(57)
		System.out.println(alpabet);
		if(alpabet >= 65 && alpabet <=90) {
			System.out.println(alp + "�� �빮���Դϴ�.");
		}else if (alpabet >= 97 && alpabet <=122) {
			System.out.println(alp + "�� �ҹ����Դϴ�.");
		}else {
			System.out.println("�Է��� ���ڴ� ��,�ҹ��ڰ� �ƴմϴ�");
		}
		
		
	}

}
