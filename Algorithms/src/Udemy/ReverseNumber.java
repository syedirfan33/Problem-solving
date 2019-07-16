package Udemy;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 578;
		int result;
		StringBuilder reversed = new StringBuilder(Integer.valueOf(num).toString()).reverse();
		if(num<0) {
			result = Integer.valueOf(reversed.toString().replaceFirst("-", ""))* -1;
		}else {
			result = Integer.valueOf(reversed.toString());
		}
		System.out.println(result);
	}

}
