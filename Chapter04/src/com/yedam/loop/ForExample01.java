package com.yedam.loop;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
//		//�ݺ��� ��� X
//		int sum = 0;
////		sum = sum+1;
////		sum = sum+2;
////		sum = sum+3;
////		sum = sum+4;
////		sum = sum+5;
//		
//		System.out.println(sum);
//
//		//�ݺ���(for) ���
//		for(int i =1 ; i<=5; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
//		
//		//1~100 ������ ¦�� ���ϱ�
//		//¦�� ��Ģ = ¦��%2 = 0
//		//Ȧ�� ��Ģ = ¦��%2 != 0
//		
//		for(int i = 1; i <=100; i++) {
//			if(i%2==0) {
//				System.out.println(i + "�� ¦��");
//			}else {
//			System.out.println(i + "�� Ȧ��");
//		} 
//		}
//		
//		//�Է��� ���ڿ� ���� ������
//		
//		//�����ܸ� ��� -> �Է� ������ ���
//		//2��
//		for(int i =1; i<=9 ; i++) {
//			System.out.println("2 X"+i+"=" + (2*i));
//		}
//		
//		//�Է� ������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է� > ");
//		int gugu = sc.nextInt();
//		
//		for(int i =1; i<=9 ; i++) {
//			System.out.println(gugu+"X"+i+"=" + (gugu*i));
//		}
//		
//		//�� ������
//		for(int i =1; i<=9 ; i++) {
//			for(int j =1; j<=9 ; j++) {
//				System.out.println(i+"X"+j+"="+(i*j));
//			}
//		}
//		
//		//�Է��� ���� ���� ����, ���, �ִ밪, �����͸� ���� ���� ��ĳ�� Ȱ���ؼ� ������ �Է�
//		//���� : �Է� ���ڸ��� �����̶�� ������ ���� �հ�
//		//��� : ���� / ������ �Է� ����
//		//�ִ밪 : �Է� �����Ϳ� ���� �����͸� ���� �� ū �� 
//		//�ּҰ� : �Է� �����Ϳ� ���� �����͸� ���� �� ���� �� 
//		int total = 0;;
//		double avg = 0;
//		int max = 0;
//		int min = 0;
//		
//		//������ �Է�
//		System.out.println("������ �Է� ���� >");
//		
//		//�Է��� ������ ���� �Է� ����
//		int count = sc.nextInt();
//		
//		for(int i =0 ; i<count; i++) {
//			System.out.println("������ �Է� >");
//			int data = sc.nextInt();
//			//����
//			total += data;
//			
//			//�ִ밪, �ּҰ� �ʱⰪ ����
//			if(i==0) {
//				max = data;
//				min = data;
//			//�ִ밪, �ּҰ� �� �� �Է�
//			}else {
//				if(max < data) {
//					max = data;
//				}
//				if(min > data) {
//					min = data;
//				}
//			}
//		}
//		avg = total/count;
//		
//		System.out.printf("���� : %d, ��� : %5.1f,�ִ밪 : %d,�ּҰ� : %d",total, avg, max, min);
//		
		
		//up & down
		//���� ������ 1~100 ������ �ϳ��� ������ �����ؼ�
		//5�� ��ȸ �ȿ� �������� ���ߴ� ���α׷� ����
		
		int answer = (int)(Math.random()*100+1);
		
		Scanner quiz = new Scanner(System.in);
		for(int i=5; i>=1; i--) {
			System.out.printf("���� �Է� >");
			int input = quiz.nextInt();
			
			if(i!=1) {
				if(input>answer) {System.out.println("down");}
				else if(input<answer) {System.out.println("up");}
				else {System.out.println("�����Դϴ�"); break;}
				if(i>1) {System.out.println("������ȸ :" + (i-1));}					
			}else if(i==1) {
				System.out.println("�����Ͽ����ϴ�");
			}
		}
		
		
//////////////////////////////////////////////////////////////////////
	}

}
