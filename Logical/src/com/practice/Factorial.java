package com.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(factorial(n));
	}

	public static int factorial(int n) {
		int number = 0;
		if (n==0) return 1;
		else {
			number = n*factorial(n-1);
		}
		return number;
	}
}
