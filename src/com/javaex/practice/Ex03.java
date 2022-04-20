package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};		//	intA의 주소는 하나이고 배열수는 3개이다.
		
		int[] intB;		//	intB는 intA와 같은 주소값을 가진다.
		intB = intA;	
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		/*
		예상
		
		inB의 배열값은 intA에 영향을 주지 않으므로 
		3
		6
		9
		가 출력 될 것이다.
		 */
		
		/*
		정답
		20
		6
		10
		
		new int[] 를 새로 만든 게 아니라 같은 주소를 가졌다.
		
		 */
	}

}
