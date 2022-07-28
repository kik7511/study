package com.mycompany.study.ch02;

public class CharExample {

	public static void main(String[] args) {
		
		char c1= 'A';
		char c2= 65;
		char c3= '\u0041';
		
		System.out.println(c1); //문자를 저장	
		System.out.println(c2);	//십진수로 저장
		System.out.println(c3);	//16진수로 저장
		
		char c4= '가';
		char c5= 44032;
		char c6= '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode =c1;
		System.out.println(uniCode);
		
		int uniCode2=c4;
		System.out.println(uniCode2);
	}

}
