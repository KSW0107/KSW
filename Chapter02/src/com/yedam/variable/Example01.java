package com.yedam.variable;

public class Example01 {
	public static void main(String[] args) {
		//int
		int var1 = 0b1011; // 2���� (0b)
		int var2 = 0206; //8���� (0)
		int var3 = 365; //10����
		int var4 = 0xB3; // 16���� (0x)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//byte 127
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		int bVal4 = 500;
	
		System.out.println(bVal4);
		
		//long
		//���� -> ���� int
		long lVal = 10;
		long lVal2 = 20;
		//���� int�� ������ ������ �����, L�� ����
		long lVal3 = 1000000000000L;
		
		//char(�����ڵ�)
		//����  �ϳ��� ���ڸ� ���� ��� ex) 'A' 'B'
		//���ڿ� �ϳ� �̻��� ���ڰ� ���� ��� ex) "apple"
		
		char charVal1 = 'A';
//		char charVal2 = 'B';
		char charVal3 = 67;
		char charVal4 = 0x0041;
		
		System.out.println(charVal1);
//		System.out.println(charVal2);
		System.out.println(charVal3);
		System.out.println(charVal4);
	
		//String
		char charVal5 = 'ȫ';
		String str1 = "ȫ�浿";
		String str2 = "�� �� �� �� ��";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//�̽�������
		//�Ǹ�ŭ ���
		System.out.println("��ȣ\t�̸�\t����");
		//����Ű
		System.out.println("�� ���� ���\n");
		//�������� ���
		System.out.println("�츮�� \"������\" �Դϴ�.");
		//Ư������ ���2
		System.out.println("��\\����\\����\\�ܿ�");
		
		//�Ǽ�Ÿ��
		//float
		float fVal = 3.14f;
		//double
		double dVal = 3.14;
		
		//e ����ϱ�
		double dVal2 = 3e6; // 3.0 * 10�� 6��
		float fVal2 = 3e6f; // 3.0 * 10�� 6��
		double dVal3 = 2e-3; // 2.0 * 10�� -3��
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		//�� Ÿ�� - true false
		boolean stop = true;
		if(stop) {
			System.out.println("�����մϴ�");
		}else {
			System.out.println("�����մϴ�");
		}
		
		
	}
}
