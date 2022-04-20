package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		
		int[] num = new int[6];
		
		 
		
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
//		num[5] = 60;
		
		
		
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(i+"=i값 같을때");
					System.out.println(j+"=j값 같을 때");
					continue;
				}else if(num[i]!=num[j]){
					System.out.println(i+"=i값 다를때");
					System.out.println(j+"=j값 다를때");
					break;
					
				}
				
			}
			System.out.print(num[i]+"\t");
			//System.out.println(num[i]+"=num[i]값");
			//System.out.println("");
			
		
		}
		System.out.println("sdfsdfs");
	}



}
