package com.mycompany.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		/*작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다*/
		//byte < short < int< long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue: "+ byteValue);
		
		/*
		int intValue = byteValue;
		System.out.println("intValue: "  + intValue);
		
		int inValue2 = 1234567890;
		System.out.println("intValue: "  + intValue);
		*/
		
		int intValue3 = 200;
		System.out.println("intValue3: " + intValue3 + "입니다.!!!");
		
		double intValue = intValue3;
		System.out.println("intValue: " + intValue + "입니다.!!!");
	}

	
}