package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {

		double[] nums = new double[3];	// 주소 개수

		nums[0] = 6.7;
		nums[1] = 3.3;
		nums[2] = 1.2;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		/*	
		출력 결과:
		
		6.7
		3.3
		1.2
		*/
	}

}
