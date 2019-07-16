package com.practice;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int maxSum = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				
				int sum = 0;
				if(i<4 && j<4) {
					sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				}
				if(sum>maxSum) {
					maxSum = sum;
				}
			}
		}
		
		System.out.println(maxSum);
	}

}
