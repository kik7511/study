package com.mycompany.study.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		//++/-- 피연산자 : 다른 연산 수행 전에 피연산자 1증가/감소
		//피연산자 ++/-- : 다른 연산 수행 후에 피연산자 1증가/감소
		
		int i=0;
		int j=0;
		
		++i;
		j++;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
		/*
		 int 변수 a,b 를 선언하고 초기값을 1을 넣어준다.
		 a 앞에 감소연산
		 b 뒤에 감소연산
		 두 변수의 결과를 출력
		 */
		
		int a=1;
		int b=1;
		--a;
		b--;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int k=i++; 
		System.out.println("i: "+i);
		System.out.println("k: "+k);
		
		int m = ++j;
		System.out.println("m: "+m);
		System.out.println("j: "+j);
		
		int z=++i + j++;
		System.out.println("z: "+z);
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
	}

}
