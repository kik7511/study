package com.mycompany.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		String a="플래티넘";
		int result = 10000;
		
		switch(a) {
			case "일반" : 
				System.out.println((double)result-(result*0.05));
				break;
			case "브론즈" : 
				System.out.println((double)result-(result*0.1));
				break;
			case "실버" : 
				System.out.println((double)result-(result*0.15));
				break;
			case "골드" : 
				System.out.println((double)result-(result*0.20));
				break;
			case "플래티넘" : 
				System.out.println((double)result-(result*0.27));				
				break;
		
		}
		
 

	}

}
