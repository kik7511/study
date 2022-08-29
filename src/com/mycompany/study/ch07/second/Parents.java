package com.mycompany.study.ch07.second;

public class Parents {
	
	int sum = 0;
	int[] arr = new int[3];
	
	public void SortByAsc(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
	
	public int getSum(int arr[]) {
		sum = arr[0]*arr[1]+arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

}
