package Udemy;

public class Fib2 {

	public static void main(String[] args) {
		int n = 26;
		int[] arr = new int[n+1];
		System.out.println(Integer.MAX_VALUE);
		System.out.println(fib(n,arr));
	}
	static int fib(int n,int[] arr) {
		if(n==0) {
			arr[0] = 0;
			return 0;
		}
		else if(n==1) {
			arr[1] = 1;
			return 1;
		}
		else if(arr[n]!=0) {
			return arr[n];
		}
		else {
			int fibVal = fib(n-1,arr)+fib(n-2,arr);
			arr[n] = fibVal;
			return fibVal;
		}
	}
}
