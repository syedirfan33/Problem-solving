package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestJava8 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("aa");
		li.add("sds");
		li.add("cc");
		li.remove("sds");
		li.forEach(action->System.out.println(action));
	}

}
