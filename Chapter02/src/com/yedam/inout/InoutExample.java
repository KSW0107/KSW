package com.yedam.inout;

import java.io.IOException;
import java.util.Scanner;

public class InoutExample {

	public static void main(String[] args) throws IOException {
		int value =123;
		String name = "��ǰ";
		double price = 1000.10;
		System.out.printf("��ǰ�� ���� : %d\n", value);
		System.out.printf("%s�� ���� : %d\n", name, value);
		System.out.printf("%s�� ���� : %d, %f \n",name, value, price);
		
		//1)���� ���
		value = 11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		//2)�Ǽ� ���
		price = 321.4567;
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		
		//3)���ڿ� ���
		System.out.printf("%s\n", "���ڻ��");
		System.out.printf("%6s\n", "���ڻ��");
		System.out.printf("%-6s\n", "���ڻ��");
		
		
		//�⺻ ��¹�
		System.out.println("�ƹ��͵� ���� print\n");
		
		//�Է�
//		int keyCode;
//		System.out.println("���ϴ� �� �Է� >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		System.out.println("���ϴ� �� �Է� >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		System.out.println("���ϴ� �� �Է� >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		System.out.println("���ϴ� �� �Է� >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
		
		//��ĳ��(Scanner)
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������ �Է� >");
		
		String word = sc.nextLine();
		
		System.out.println(word);
		
		//1 == 1
		//String.wquals() - ���ڿ� ��
		if(word.equals("test")) {
			System.out.println("equal : �Է��Ͻ� ���ڿ��� �� ���ڿ� ����");
		}
		if(word == "test") {
			System.out.println("== : �Է��Ͻ� ���ڿ��� �� ���ڿ� ����");
		}
		
		
	}

}
