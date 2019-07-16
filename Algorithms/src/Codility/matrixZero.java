package Codility;

import java.util.Scanner;

public class matrixZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter rows and columns:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int _row = 0;
		int _column = 0;
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 0) {
					_row = i;
					_column = j;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				if(j==n-1) {
				System.out.print("\n");
				}
			}
		}
		System.out.println("Output is:");
		
		int[][] outArr = makeZero(arr,_row,_column,m,n);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(outArr[i][j]+" ");
				if(j==n-1) {
					System.out.print("\n");
					}
			}
		}

	}
	
	static int[][] makeZero(int[][] arr, int _row, int _column, int m, int n){
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==_row || j==_column) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}

}
