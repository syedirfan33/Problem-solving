package Udemy;

import java.util.LinkedList;

public class MidPointOfLL {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);

		double d = li.size();
		double mid = d/2;
		System.out.println(Math.round(mid)-1);
	}

}
