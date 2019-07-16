package Codility;

public class StringReverse {

	public static void main(String[] args) {
		String s = "ReverseMe1";
		StringBuilder b = new StringBuilder("");
		for(int i=s.length()-1;i>=0;i--) { 
		 b.append(s.charAt(i));
		}
			System.out.println(b.toString());
	}

}
