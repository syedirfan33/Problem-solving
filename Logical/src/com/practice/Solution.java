package com.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.net.*;
//import com.google.gson.*;

public class Solution {
	/*
	 * Complete the function below.
	 */
	static String[] getMovieTitles(String substr) {
		
		List<String> li = new ArrayList<String>();
		
		li.add("Italian Spiderman");
		li.add("Superman, Spiderman or Batman");
		li.add("Spiderman");
		li.add("Spiderman");
		li.add("Fighting, Flying and Driving: The Stunts of Spiderman 3");
		li.add("Spiderman and Grandma");
		li.add("The Amazing Spiderman T4 Premiere Special");
		li.add("Amazing Spiderman Syndrome");
		li.add("Hollywood's Master Storytellers: Spiderman Live");
		li.add("Spiderman 5");
		li.add("They Call Me Spiderman");
		li.add("The Death of Spiderman");
		li.add("Spiderman in Cannes");
		Collections.sort(li);
		String[] arr = li.toArray(new String[0]);
		for(int arr_i=0;arr_i<arr.length;arr_i++) {
			System.out.println(arr[arr_i]);
		}
		
		
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//final String fileName = System.getenv("OUTPUT_PATH");
		//BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String[] res;
		String _substr;
		try {
			_substr = in.nextLine();
		} catch (Exception e) {
			_substr = null;
		}
		res = getMovieTitles(_substr);
		for (int res_i = 0; res_i < res.length; res_i++) {
			//bw.write(String.valueOf(res[res_i]));
			//bw.newLine();
			System.out.println(res[res_i]);
		}
		//bw.close();
	}
}