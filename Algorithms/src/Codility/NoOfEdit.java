package Codility;

public class NoOfEdit {

	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "aledfs";
		boolean isEdit = false;
		if(s1.length() == s2.length()) {
			isEdit = isReplace(s1,s2);
		}else if(s1.length()>s2.length()) {
			isEdit = isInsertOrRemove(s1,s2);
		}else {
			isEdit = isInsertOrRemove(s2, s1);
		}
		System.out.println(isEdit);
	}
		
		
	static boolean isInsertOrRemove(String s1, String s2) {
		if(s1.length()-s2.length()!=1) {
			return false;
		} 
		boolean isEdit = s1.contains(s2);
		for (int i = 0; i < s1.length()-1; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				String str = s1.replaceFirst(s1.substring(i, i+1), "");
				if(s2.equalsIgnoreCase(str)) isEdit = true;
			}
		}
		return isEdit;
	}
	
	static boolean isReplace(String s1, String s2) {
		
		boolean isEdit = false;
		char c = ' ';
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				String str = s2.substring(i+1, s2.length());
				if(s1.contains(str)) isEdit = true;
			}
		}	
		return isEdit;
	}
}
