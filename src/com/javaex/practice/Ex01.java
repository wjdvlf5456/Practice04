package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//	예상: 조건식이 i <= intArray.length 이기 때문에 하나가 더 입력되어 오류가 나온다.

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;

		for (int i = 0; i <= intArray.length; i++) {
			result = result + intArray[i];

		}
		System.out.println(result);
		
		
	}

}
