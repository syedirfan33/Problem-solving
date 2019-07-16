package com.practice;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = Integer.toBinaryString(439);
			System.out.println(s);
			int count = 0;
			int maxCount = 0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1') {
					count++;
					if(count>maxCount) {
						maxCount = count;
						}
				}else {
					if(count>maxCount) {
					maxCount = count;
					}
					count = 0;
				}
			}
			System.out.println(maxCount);
	}

}
