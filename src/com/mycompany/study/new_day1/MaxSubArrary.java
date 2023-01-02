package com.mycompany.study.new_day1;

public class MaxSubArrary {
	public static int maxSubArrary(int[] nums) {
		int answer = nums[0];
		int curSum = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			int num = nums[i];
			curSum = Math.max(curSum + num, num);
			answer = Math.max(answer, curSum);
		}
			
		return answer;
	}

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArrary(nums));
	}

}

