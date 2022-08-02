package com.mycompany.study.ch02;

public class OperationsProgramExample {

	public static void main(String[] args) {
		
		byte byteValue = 12;
		byte byteValue2 = 12;
		int byteValue3 = byteValue + byteValue2;
		System.out.println(byteValue);
		
		short shortValue=12;
		short shortValue2=12;
		int shortValue3 = shortValue + shortValue2;
		System.out.println(shortValue3);
		
		int intValue=12;
		int intValue2=12;
		int intValue3=intValue+intValue2;
		System.out.println(intValue3);
		
		long longValue=12;
		long longValue2=12;
		long longValue3=longValue+longValue2;
		System.out.println(longValue3);
		
		float floatValue=12;
		float floatValue2=12;
		float floatValue3=floatValue+floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue=12;
		double doubleValue2=12;
		double doubleValue3=doubleValue+doubleValue2;
		System.out.println(doubleValue3);
		
		int byteValue4= byteValue + intValue;
		int intValue4 = byteValue + intValue;
		System.out.println(intValue4);
		
		//int intValue5 = invValue+doubleValue;
		double doubleValue4 = intValue+doubleValue;
		System.out.println(doubleValue4);
		
	}

}
