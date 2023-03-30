
public class hw1 {

	public static void main(String[] args) {
		//Q1
		int aa = 37;
		int bb = 91;
		System.out.printf("변수명1: %d, 변수명2: %d/n", aa, bb);

		//Q2
		System.out.println(bb+aa);
		System.out.println(bb-aa);
		System.out.println(bb*aa);
		System.out.println(bb/aa);
		
		//Q3
		int var1 = 128;
		System.out.printf("%d,%s \n", var1, "int");
		String var2 = "B";
		System.out.printf("%s,%s \n", var2, "String");
		int var3 = 44032;
		System.out.printf("%d,%s \n", var3,"int");
		long var4 = 100000000000L;
		System.out.printf("%d,%s \n", var4 , "long");
		double var5 = 43.93106;
		System.out.printf("%8.5f,%s \n", var5, "double");
		float var6 = 301.3f;
		System.out.printf("%5.1f,%s \n", var6, "float");
		
		//Q4
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		long result1 = a + c + d;
		System.out.println(result1);
		
		int result2 = a + b + c;
		System.out.println(result2);
		
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);	
		
		//Q5
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		System.out.printf("%s%d%d%s%4.1f\n", charValue,intValue1+intValue2,intValue3,strValue,(float)intValue4);
		
		//추가 문제
		int value = 485;
		System.out.println((value/100) + ((value-(value/100)*100)/10) + (value-((value/100)*100)-(((value-(value/100)*100)/10))*10));
	}

}
