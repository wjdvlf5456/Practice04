package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] num = new int[6];

//		num[0] = (int) (Math.random() * 45) + 1;
//		num[1] = (int) (Math.random() * 45) + 1;
//		num[2] = (int) (Math.random() * 45) + 1;
//		num[3] = (int) (Math.random() * 45) + 1;
//		num[4] = (int) (Math.random() * 45) + 1;
//		num[5] = (int) (Math.random() * 45) + 1;
		
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		num[4] = 4;
		num[5] = 5;

		for (int i = 0; i < num.length; i++) {

			for (int j = 1; j <= 45; j++) {
				if (num[i] != num[i + 1] && num[i] == j && i < num.length) {		//	num[i+1]에서 오류
					num[i] = j;
					System.out.println("skdjflskdjfslkdjflksjflsfsf");
				}else{	
					
					System.out.println("나머지");
				}

			}
			System.out.print(num[i] + "\t");

		}

	}

}
