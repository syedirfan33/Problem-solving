package Codility;

import java.util.Arrays;

public class ArrUnpaired {

	public static void main(String[] args) {
		int[] arr = {3,7,7,3,7,7,9}; 
		System.out.println(sort(arr));
	}

	public static int sort(int [] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1 && arr[i]==arr[i+1]) i = i+1;
			else return arr[i];
		}
		return 0;
	}
}
