package Codility;

public class Permutation {

	public static void main(String[] args) {
		boolean isPerm = true;
		String s = "moamom";
		char[] c = new char[128];
		for(int i=0;i<s.length();i++) {
			c[s.charAt(i)]++;
		}
		for(int i=0;i<s.length()/2;i++) {
			if(c[s.charAt(i)]%2!=0) isPerm = false;
		}
		System.out.println(isPerm);
	}

}
