package Udemy;

import java.util.Arrays;

public class ChunkSimplified {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		int size = 3;
		int first = 0;
		int last = size;
		int counter = 0;
		int i = 0;
		Object[] out;
		if(input.length<=size) {
			out = new Object[1];
			int[] arr = input;
			out[1] = arr;
		}else {
			if(input.length%size==0) {
				counter = input.length/size;
				out = new Object[counter];
			}else {
				counter = input.length/size+1;
				out = new Object[counter];
			}
			
			while(counter>0) {
				if(input.length%size!=0 && counter==1) {
					last = input.length;
				}
				int[] sub = Arrays.copyOfRange(input, first,last);
				first = last;
				last = first+size;
				out[i] = sub;
				i++;
				
				
				counter--;
				
			}
		}
		
		System.out.println(Arrays.deepToString(out));
	}

}
