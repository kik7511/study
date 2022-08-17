package com.mycompany.study.ch05;

import java.util.Arrays;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[5];
		
		arr1[0] = 77;
		arr1[1] = 15;
		arr1[2] = 53;
		System.out.println(Arrays.toString(arr1));
		
	}

}
