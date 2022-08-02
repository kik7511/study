package com.mycompany.study.ch03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x=100;
		int result1=+x;
		int result2=-x;
		System.out.println(result1);
		System.out.println(result2);
		
		int v1=5;
		int v2=2;
		
		int result3 = v1+v2;
		int result4 = v1-v2;
		int result5 = v1*v2;
		int result6 = v1/v2;
		int result7 = v1%v2;
		double result8 = v1/v2;
		double result9 = (double)v1/v2;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
	}

}
