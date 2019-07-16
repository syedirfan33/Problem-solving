package com.practice;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int i = sc.nextInt();
//		for(int j=0;j<i;j++) {
//			String s = sc.next();
//			StringBuffer b = new StringBuffer("");
//			StringBuffer c = new StringBuffer("");
//			for(int k=0;k<s.length();k++) {
//				if(k%2==0) b.append(s.charAt(k));
//				else c.append(s.charAt(k));
//			}b.append(" ");
//			System.out.println(b.append(c));
//		}
//	}
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for(int j=n-1;j>=0;j--) {
        System.out.print(arr[j]+" ");
        }

        scanner.close();
    }

}
