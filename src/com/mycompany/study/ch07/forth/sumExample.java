package com.mycompany.study.ch07.forth;

public class sumExample {

	public static void main(String[] args) {
		
		Sumparent sumparent = new Sumparent();
		int result1 = sumparent.plus(5, 3, 2);
		System.out.println("result1의 값은 " + result1 + "입니다.");
		
		SumSon sumson = new SumSon();
		sumson.plusMode = SumSon.sonSum;
		int result2 = sumson.plus(5, 3, 2);
		System.out.println("result2의 값은 " + result2 + "입니다.");
		
		int result3 = Integer.compare(result1, result2);
		System.out.println(result3);
		
		int result4 = result1 - result2;
		
		int result5 = Math.abs(result4); 
		System.out.println("result1과 result2의 차이는 " + result5 + "입니다.");

	}

}
