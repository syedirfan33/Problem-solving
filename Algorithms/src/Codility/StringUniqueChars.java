package Codility;

public class StringUniqueChars {

	public static void main(String[] args) {
		boolean isUnique = true;
		String s = "Syed Irfan     n";
		if(s.length()>128) {
			isUnique = false;
		}
		String trimmed = s.trim();
		for(int i=0;i<trimmed.length();i++) {		
			String str = trimmed.substring(i+1);
			if(str.contains(trimmed.substring(i, i+1))) isUnique = false;
		}
		System.out.println(isUnique);
	}

}
