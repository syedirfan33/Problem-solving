package Udemy;

import java.util.Arrays;

public class AnagramSimple {

	public static void main(String[] args) {
		String s1 = "Rail safety";
		String s2 = "fairy   tales";
		
		
		char[] arr = s1.toLowerCase().replace(" ", "").toCharArray();
		char[] arr2 = s2.toLowerCase().replace(" ", "").toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		if(String.valueOf(arr).equals(String.valueOf(arr2))) {
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	

	}

}
