package com.yedam.operator;

public class Example01 {

	public static void main(String[] args) {
		//��ȣ ������
		int x = -100;
		int result1 = -x;
		int result2 = +x;
		System.out.println("resylt1 : " +result1);
		System.out.println("resylt2 : " +result2);
		
		byte b = 100;
		//byte result3 = -b; -> (-) ���� �Ŀ� int�� �ڵ�����ȯ �Ǳ� ����
		//byte result3 = (byte)-b; -> ���� Ÿ�� ��ȯ
		int result3 = -b; //-> �ڵ� Ÿ�� ��ȯ
		
		//���� ������ ++,--
		// ��ġ�� ���� ���� Ÿ�̹��� �ٸ�
		int value = 100;
		
		//��¹� ���� �� 1 ����
		System.out.println(value++);
		//��¹� ���� �� 1 ����
		System.out.println(++value);
		
		//�� ���� ������(not), !
		//not(!) + true = false
		//not(!) + false = true
		
		boolean flag = false;
		
		if(!flag) {
			System.out.println("false");
		}
		if(!(value < 100)) {
			System.out.println("true");
		}
		
		
		//���׿�����(��Ģ����)
		int v1 = 10;
		int v2 = 5;
		
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);
		
		//�����Ⱑ 2�� ���� ( /:�� , %:������ )
		System.out.println("/ : "+ (v1 / v2));
		System.out.println("% : "+ (v1 % v2));
		
		//���ڿ� ���� ������(+)
		System.out.println("�ڹ�"+"JDK"+11);
		
		//�� ������
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1==num2); //false 
		System.out.println(num1!=num2); //true
		System.out.println(num1 >= num2); //false
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		
		System.out.println(char1 > char2);
		
		//���ڿ� �� -> ==�� �ƴϰ�, equals
		
		//�� ������
		//&&,&,||,|
		
		//�ڵ� Ÿ�� ��ȯ���� ���� ���� A -> 65
		int charCode = 'A';
		
		//'A' ~ 'Z'�� ���� �Ǵ��� Ȯ��
		if(charCode >= 65 && charCode <= 90) {
			System.out.println("�빮��");
		}
		
		//'0'(�ƽ�Ű�ڵ� 48) ~ '9'(�ƽ�Ű�ڵ� 57)
		//���1 : charCode >= 48 && charCode <= 57
		//���2 :
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9������ ����");
		}
		
		//���� ������ =, +=, -= ...
		int result5 = 0;
		result5 += 1;
		result5 -= 1;
		result5 *= 3;
		result5 /= 10;
		System.out.println("result5 : " +result5);
		
		//���� ������
		int score = 95;
		
		//90������ ������ A, ������ B
		if(score>90) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
		
		char grade = (score>90) ? 'A' : 'B';
		System.out.println(grade);
		
		System.out.println((score>90) ? 'A' : 'B');
	}

}
