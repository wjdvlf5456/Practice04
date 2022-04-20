package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] num = new int[7];

		num[0] = (int) (Math.random() * 45) + 1;
		num[1] = (int) (Math.random() * 45) + 1;
		num[2] = (int) (Math.random() * 45) + 1;
		num[3] = (int) (Math.random() * 45) + 1;
		num[4] = (int) (Math.random() * 45) + 1;
		num[5] = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < num.length - 1; i++) {

			for (int j = 1; j <= 45; j++) {
				if (num[i] != num[i + 1] && num[i] == j && i < num.length) {
					num[i] = j;
				} else {
					
				}

			}
			System.out.print(num[i] + "\t");

		}

	}

}
