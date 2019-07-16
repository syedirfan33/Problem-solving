package Udemy;

public class FIb1 {

	public static void main(String[] args) {
		int n = 5;
		int first = 0;
		int last = 1;
		int fib = 0;
		if(n==0) {
			fib = 0;
		}
		if(n==1) {
			fib = 1;
		}
		for(int i=2;i<=n;i++) {
			fib = first + last;
			first = last;
			last = fib;
			System.out.println(fib);
		}
		System.out.println(fib);
	}

}

//0 1 1 2 3 5 8