package com.mycompany.study.ch03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		
		//+-
		int result = 0;
		int result1 = 0;
		int result2 = 0;
		
		result += 10;
		//result = result +10;
		
		System.out.println("result: " + result);
		
		result1 -= 10;
		System.out.println("result1: " + result1);
		
		result2*=10;
		System.out.println("result2: " + result2);
	}

}
