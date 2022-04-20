package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					continue;
				} else if (num[i] != num[j]) {
					System.out.print(num[i] + "\t");		// 마지막 값이 안 나오는 것을 해결해야함
					break;

				}
				//else if	end

			}//2nd for end

		}//1st for end
	}

}
