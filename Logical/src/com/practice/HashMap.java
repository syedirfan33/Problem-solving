package com.practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> phoneDir = new java.util.HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneDir.put(name, phone);
		}
		while (in.hasNext()) {
			String findName = in.next();
			if(phoneDir.containsKey(findName)) System.out.println(findName+"="+phoneDir.get(findName));
			else System.out.println("Not found");

		}
		in.close();
		

	}

}
