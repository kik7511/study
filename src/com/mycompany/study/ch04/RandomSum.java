package com.mycompany.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
        //랜덤한 정수 2개 중 최대값과 최소값 사이의 합을 구하시오 - 내꺼
       /* 
        double num1=1.0;
        double num2=100.0;
        int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
        int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
        int sum=0;

        if(random1>random2){
            for(int i=random2; i<=random1; i++){
                sum=sum+i;   
                System.out.println(i+" : "+sum);                             
            }            
            System.out.println(random2+" ~ " +random1+"의 합은"+ sum + "입니다.");                
        }else if(random2>random1){
            for(int i=random1; i<=random2; i++){
                sum=sum+i;                
                System.out.println(i+" : "+sum);                
            }
            System.out.println(random1+" ~ " +random2+"의 합은"+ sum + "입니다.");                
        }else{
            //random1==random2
            System.out.println("최대값과 최소값이 같네요?");
        }
        */

        // 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라 -하늘이꺼
		
		double num1 = 1.0;
		double num2 = 100.0;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
		
		if (random1 < random2) {
			max = random2;
			min = random1;
		} else if (random1 > random2) {
			max = random1;
			min = random2;
		} else {
			System.out.println("서로 다른 값을 입력하세요.");
			return ;
		}
		
		System.out.println("min : " + min + ", " + "max : " + max);
		
		for (int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println("total : " + sum);    


//        여기서 부터 정민님 소스 - Random import 해야함(컨트롤+쉬프트+F5)
//		Random rand = new Random();
//		
//		int num1 = rand.nextInt(100);
//		int num2 = rand.nextInt(100);
//		
//		int sum = 0;
//		
//		if(num1 > num2) {
//			for(int i = num2 ; i <= num1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num1) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
//		} else {
//			for(int i = num1 ; i <= num2; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num2) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
////			System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
		
	}
    
	

}
