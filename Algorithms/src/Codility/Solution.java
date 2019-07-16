package Codility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	static int initCount = 0;
	static int maxCount = 0;
	public static Set<Integer> s = new HashSet<Integer>();
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		sol.solution(10,20);
		System.out.println(initCount+"is");
		System.out.println(maxCount+"was");

	}
	
	public int solution(int A,int B) {
		int count = 0;
		
		int reps = B-A;
		while(reps>=0) {
			Solution sol = new Solution();
			sol.hasMoreSquares(A);
			reps--;
			A++;
			if(initCount>maxCount) {
				maxCount = initCount;
				initCount = 0;
			}
		}
		return count;
	}
	
	public int hasMoreSquares(double A) {
		double r = Math.sqrt(A);
		if(r - Math.floor(r) != 0) {
			return 0;
		}
        else {
				initCount+=1;	
				return hasMoreSquares(r);			
        }
 
	}

}
