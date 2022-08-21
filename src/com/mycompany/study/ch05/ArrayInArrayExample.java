package com.mycompany.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores= {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		System.out.println("scroes[2][1]: "+scores[2][1]);
		System.out.println("scroes[3][2]: "+scores[3][2]);
		System.out.println("scroes[1][2]: "+scores[1][2]);
		System.out.println("scroes[0][1]: "+scores[0][1]);
		System.out.println(scores[0].length);
	
		
		//1,2
		//내 정담
		/*
		String[] name = {"장원영", "장동건", "고소영", "김대겸", "김윤지"};
		double kor = 0, eng= 0, math =0;
		
		for(int i=0; i<scores.length; i++) {
			double avg=0;
			int sum=0;
			kor += scores[i][0];
			eng += scores[i][1];
			math += scores[i][2];
			for(int j=0; j<scores[i].length; j++ ) {
				sum=sum+scores[i][j];				
			}
			avg=(double)sum/(scores[i].length);
			System.out.println(String.format(name[i]+"의 평균점수는 "+"%.2f", avg)+"점");			
		}
			System.out.println(kor/scores.length);
			System.out.println(eng/scores.length);
			System.out.println(math/scores.length);
			*/

		//다른 정답		
		//1
		
		String[] name = {"장원영", "장동건", "고소영", "김대겸", "김윤지"};
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i=0; i<scores.length; i++) {
			int sum=0;
			for(int j=0; j<scores[i].length; j++ ) {
				sum=sum+scores[i][j];				
			}
			System.out.println(name[i]+"의 평균점수는: "+(double)sum/scores[i].length);			
		}
		System.out.println("------------------------------------------");
		//2
		//2 과목별 평균
		for(int j=0; j<3; j++) {
			int sum=0;
			for(int i=0; i<5; i++) {
				sum +=scores[i][j];
			}
			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
		}

		
	}
	
}


