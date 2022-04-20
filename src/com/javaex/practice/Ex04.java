package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {

		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };	// 배열은 13개

		int sum = 0;
		int jsum = 0;

		for (int i = 0; i < data.length; i++) {
			sum = sum + jsum;
			for (int j = 1; j <= data[i]; j++) {
				if (j % 3 == 0) {
					jsum = jsum + j;

				}

			}

			System.out.println("주어진 배열에서 3의 배수의 개수=>" + data[i] / 3);
			System.out.println("주어진 배열에서 3의 배수의 합=>" + jsum);
		}

	}

}
