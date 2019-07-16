package Udemy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainProgram {

	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(5);
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.pop();
		s.pop();
		System.out.println(s.toString());


	}

}
