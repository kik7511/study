package com.mycompany.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		//강제 형변환 : casting : (원하는 형) 변수명
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891;	//7자리 이상인 경우에는 e로 표현
		System.out.println("doubleValue2: " + doubleValue2);
		
		//float 변수에 double 대입
		float floatValue = (float)doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		long longValue = (long)floatValue;
		int intValue = (int)longValue;
		short shortValue = (short)intValue;
		byte byteValue = (byte)shortValue;
		
		System.out.println("longValue: " + longValue);
		System.out.println("intValue: " + intValue);
		System.out.println("shortValue: " + shortValue);
		System.out.println("byteValue: " + byteValue);
		
		// string을 int로 변환
		int i =1;
		String s = String.valueOf(i);
		System.out.println(s);
		
		int o=2;
		String a = Integer.toString(o);
		System.out.println(a);
		
		//	int를 string로 변환
		String b = "123";
		//int c=Integer.parseInt(b);
		int c = Integer.valueOf(b);
		System.out.println(c);
	
		
	}

}
