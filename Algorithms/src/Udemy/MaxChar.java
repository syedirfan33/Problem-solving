package Udemy;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {

	public static void main(String[] args) {
		String input = "cdddaabb";
		Character[] out = {' '} ;
		int[] max = {0};
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<input.length();i++) {
			Character curr = input.charAt(i);
			if(map.get(curr)!=null) {
				map.put(curr, map.get(curr)+1);
			}else {
				map.put(curr, 1);
			}
		}

		map.forEach((k,v)->{
			if(v > max[0]) {
				max[0] = v;
				out[0] = k;
			}
		});
		System.out.println(out[0]);
	}

}
