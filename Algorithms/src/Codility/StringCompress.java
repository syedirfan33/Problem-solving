package Codility;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class StringCompress {

	public static void main(String[] args) {
		System.out.println(compressByNonRepeatative("aabbaacccceeeeeeffg"));

	}
	
	static String compressByRepeatative (String s) {
		StringBuilder com = new StringBuilder("");
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))!=null) map.put(s.charAt(i), map.get(s.charAt(i))+1);
			else map.put(s.charAt(i), 1);
		}
		
		for (Entry e : map.entrySet()) {
			com.append(e.getKey()+""+e.getValue());
		}
		if(com.toString().length()>s.length()) return s;
		else return com.toString();
	}
	
	static String compressByNonRepeatative (String s) { 
		StringBuilder sb = new StringBuilder("");
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
			if(i+1 >=s.length() || s.charAt(i)!=s.charAt(i+1) ) {
				sb.append(s.charAt(i)+""+count++);
				count = 0;
			}
			
		}
	
		if(sb.toString().length()>s.length()) return s;
		else return sb.toString();
	}
}
