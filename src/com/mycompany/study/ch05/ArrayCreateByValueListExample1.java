package com.mycompany.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"장원영", "장동건", "고소영"};
		
		//scoreChemistry 의 평균을 구해서 출력 하시오
		int sum=0;
		for(int i=0; i<scoreChemistry.length; i++) {
			sum=sum+scoreChemistry[i];
		}
		double average = (double)sum/(scoreChemistry.length);
		
		System.out.println("화학점수의 평균 점수는 "+ average + "점 입니다.");
		
		System.out.println("--------------------------------------");
		
		System.out.println("명지님 화학성적 : " + scoreChemistry[0]);
		
		System.out.println("누굴까 : "+ name[2]);		
		

	}

}
