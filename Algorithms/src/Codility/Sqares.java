package Codility;

public class Sqares {

	public static void main(String[] args) {
		int n = 10;
		int curr = 2;
		int result = 1;
		for(int i=1;i<=n;i++) {
			System.out.println(result);
			result = curr*curr;	
			curr = result;
		}

	}

}
