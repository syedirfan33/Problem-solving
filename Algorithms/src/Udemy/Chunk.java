package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chunk {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		getChunks(input,3);

	}
	
	public static Object[] getChunks(int[] arr, int size) {
		Object[] out;
		if(size>=arr.length) {
			out = new Object[1];
			int[] sub = arr;
			out[0] = sub;
			System.out.println(Arrays.deepToString(out));
			return out;
		}
		int length = arr.length / size;
		if(arr.length%size ==0) {	
			out = new Object[length];
		}else {
			out = new Object[length+1];
		}
		int j=0;
		int l=0;
		int count = size;
		List<Integer> sub = new ArrayList<>();
		while(count>0 && j<arr.length) {
			sub.add(arr[j]);
			j++;
			count--;
			if(count==0) {
				count = size;
				out[l] = sub;
				sub = new ArrayList<>();
				l++;
			}
			if(j==arr.length-1) {
				out[l] = sub;
			}
		}
		
		System.out.println(Arrays.deepToString(out));
		return out;
		
	}

}
