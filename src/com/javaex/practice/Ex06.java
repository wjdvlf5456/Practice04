package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };		// 16개

		char c2[] = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println("");
		for (int i = 0; i < c.length; i++) {
			c2[i] = c[i];
			c2[4] = ',';
			c2[7] = ',';
			c2[9] = ',';
			System.out.print(c2[i]);
		}

	}

}
