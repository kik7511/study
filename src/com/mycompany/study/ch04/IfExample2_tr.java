package com.mycompany.study.ch04;

public class IfExample2_tr {

	public static void main(String[] args) {

		int rank = 3;
		int cost = 10000;		

		if(rank == 1){
			double price = cost*(1-0.05);
			System.out.println("정가가" +cost+"원인 일반 등급의 할인가는: "+(int)price+"원 입니다.");
			}else if(rank == 2){
			double price = cost*(1-0.1);
			System.out.println("정가가" +cost+"원인 일반 등급의 할인가는: "+(int)price+"원 입니다.");
			}else if(rank == 3){
			double price = cost*(1-0.15);
			System.out.println("정가가" +cost+"원인 일반 등급의 할인가는: "+(int)price+"원 입니다.");
			}else if(rank == 4){
			double price = cost*(1-0.2);
			System.out.println("정가가" +cost+"원인 일반 등급의 할인가는: "+(int)price+"원 입니다.");
			}else if(rank == 5){
			double price = cost*(1-0.027);
			System.out.println("정가가" +cost+"원인 일반 등급의 할인가는: "+(int)price+"원 입니다.");
			}else{
				System.out.println("1~5까지의 grade만 가능합니다");
			}
		}
		
		
		
 

	}

}
