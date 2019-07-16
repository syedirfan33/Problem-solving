package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int n=2;
		int[][] arr = new int[n][n];
		int counter = 1;
		int start_row = 0;
		int start_column = 0;
		int end_row = n-1;
		int end_column = n-1;
		while(counter<=n*n) { // or while(start_row<=end_row && start_column<=end_column)
			for(int i=start_row;i<=end_column;i++) {
				arr[start_row][i] = counter;
				counter++;
			}
			start_row++;
			for(int j=start_row;j<=end_row;j++) {
				arr[j][end_column] = counter;
				counter++;
			}
			end_column--;
			for(int k=end_column;k>=start_column;k--) {
				arr[end_row][k] = counter;
				counter++;
			}
			end_row--;
			for(int l=end_row;l>=start_row;l--) {
				arr[l][start_column] = counter;
				counter++;
			}
			start_column++;
		}
		System.out.println(Arrays.deepToString(arr));
	}
}

//[[1,2,3,4],
//[12,13,14,5],
//[11,16,15,6]
//[10,9,8,7]

	/*public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
		int start_row = 0;
		int end_row = n-1;
		int start_column = 0;
		int end_column = n-1;
		int counter = 1;
		while(counter<=n*n) {
			for(int i=start_row;i<=end_column;i++) {
				arr[start_row][i] = counter;
				counter++;
			}
			start_row++;
			for(int j=start_row;j<=end_row;j++) {
				arr[j][end_column] = counter;
				counter++;
			}
			end_column--;
			for(int k=end_column;k>=start_column;k--) {
				arr[end_row][k] = counter;
				counter++;
			}
			end_row--;
			for(int l=end_row;l>=start_row;l--) {
				arr[l][start_column] = counter;
				counter++;
			}
			start_column++;
		}
		System.out.println(Arrays.deepToString(arr));

	}
}*/



		
