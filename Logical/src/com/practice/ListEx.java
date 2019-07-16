package com.practice;

import java.util.ArrayList;
import java.util.List;


public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>();
		List<String> sList2 = new ArrayList<String>();
		List<String> sList3 = new ArrayList<String>();
		sList3.add("1");
		sList2.add("3");
		sList2.add("4");
		sList.addAll(sList2);
		sList.addAll(sList3);
		System.out.println(sList.size());	

	}

}
