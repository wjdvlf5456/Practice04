package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numArray = new int[5];

		numArray[0] = sc.nextInt();
		numArray[1] = sc.nextInt();
		numArray[2] = sc.nextInt();
		numArray[3] = sc.nextInt();
		numArray[4] = sc.nextInt();

		double sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}

		System.out.println(sum / 5);
		sc.close();
	}

}
