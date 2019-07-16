package Technical;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String input2 = "\"testcase, second\", sg Grab,\"Changi, Singapore\"";
		convertToken("\"testcase, second\", sg Grab,\"Changi, Singapore\"");
		
		String input = "sg Grab,\" \"\"Changi\"\", Singapore";
		StringTokenizer stringArr =  new StringTokenizer(input,"\"");
		while(stringArr.hasMoreTokens()) {
		System.out.println("=="+stringArr.nextToken());
		}
		

	}
	
	public static String[] convertToken(String stringInput) {
		StringTokenizer stringArr =  new StringTokenizer(stringInput,"\"");
		String[] str = new String[stringArr.countTokens()];

		int i=0;
		while(stringArr.hasMoreTokens()) {
			StringBuilder token = new StringBuilder(stringArr.nextToken()) ;
			if(token.length()>0 && token.charAt(0) == ',') {
				token.replace(0, 1, "");
			}
			if(token.length()>0 && token.charAt(token.length()-1) == ',') {
				token.replace(token.length()-1, token.length(), "");
			}
			String strTok = token.toString();
			strTok = "\"" + token + "\"";
			str[i] = strTok.trim();
			i++;
		}
		
		System.out.println(Arrays.toString(str));
		return str;
	}

}
