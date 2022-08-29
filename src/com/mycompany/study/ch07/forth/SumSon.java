package com.mycompany.study.ch07.forth;

import java.util.Arrays;

public class SumSon extends Sumparent{
	public static final int parentSum = 1;
	public static final int sonSum = 2;
	public int sum;
	
	public int plusMode = parentSum;
	
	@Override
	public int plus(int a, int b, int c) {
		if(plusMode == sonSum) {
			int num[] = {a, b, c};
			Arrays.sort(num);
			sum = (num[0]*num[1])+num[2]+10;
			//sum = super.plus(a, b, c) + 10;
			
		}else {
			sum = super.plus(a, b, c);
		}
		return sum;
	}
}
