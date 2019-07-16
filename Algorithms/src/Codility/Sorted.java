package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		int noOfWays = 0;
		int[] arr = {5,5,4,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
			li.remove(i);
			boolean eq = li.stream().sorted().collect(Collectors.toList()).equals(li);
			if(eq) {
				noOfWays++;
			}
		}
		System.out.println(noOfWays);

	}

}
