package com.practice;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double total = s.nextDouble();
		int tip = s.nextInt();
		int tax = s.nextInt();
		
		double totalVal = total+((total*tip)/100)+((total*tax)/100);
		System.out.println(totalVal);
		int i = (int)Math.round(totalVal);
		System.out.println(i);
	}

}
