package com.mycompany.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1="김대겸";
		String str2="김대겸";
		String str3=new String("김대겸");
		
		boolean result1=(str1==str2);
		System.out.println(result1);	//true

		boolean result2=(str1==str3);
		System.out.println(result2);	//false
		
		//문자열 비교함수 equals
		System.out.println("str1.equals(str2): "+ str1.equals(str2));	//==(X)true 
		System.out.println("str1.equals(str3): "+ str1.equals(str3));	//==(X)true
		
	}

}
