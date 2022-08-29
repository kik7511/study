package com.mycompany.study.ch07.forth;

import java.util.Arrays;

public class Sumparent {
	public int sum;	
	
	public void up(int a, int b, int c) {
		int num[] = {a, b, c};
		Arrays.sort(num);
	}
	
	public int plus(int a, int b, int c) {
		int num[] = {a, b, c};
		Arrays.sort(num);
		sum = (num[0]*num[1])+num[2];
		return sum;
	}
}
