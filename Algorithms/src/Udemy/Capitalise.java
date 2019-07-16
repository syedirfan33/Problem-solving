package Udemy;

public class Capitalise {

	public static void main(String[] args) {
		String in = "look, it's working";
		String a = in.trim();
		String out = "";
		for(int i=0;i<a.length();i++) {
			if(i==0) {
				Character c = (java.lang.Character)a.charAt(0);
				out = a.replaceFirst(c.toString(), c.toString().toUpperCase());
				System.out.println("comitng"+out);
			}
			if(a.charAt(i)==' ') {
				Character c = (java.lang.Character)a.charAt(i+1);
				out = out.replaceFirst(c.toString(), c.toString().toUpperCase());
			}
		}
		System.out.println(out);
	}

}
