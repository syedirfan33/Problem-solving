package Udemy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Rail safetys";
		String s2 = "fairy!! taless";
		boolean isAn = true;
		Map<Character, Integer> m1 = getRepCharCount(s1);
		Map<Character, Integer> m2 = getRepCharCount(s2);

		if(m1.size()!=m2.size()) {
			System.out.println("here"+false);
		}else {
			for(Character c:m1.keySet()) {
				if(m1.get(c)!=m2.get(c)) {
					isAn = false;
				}
			}
			System.out.println(isAn);
		}
	}
	
	private static Map<Character,Integer> getRepCharCount(String s){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		String in = s.trim().toLowerCase();
		for(int i=0;i<in.length();i++) {
			int c = in.charAt(i);
			if(c>=97 && c<=122) {
				Character cha= in.charAt(i);
				map.put(cha, map.get(cha)!=null?map.get(cha)+1:1);
			}
		}
		return map;
	}
}
