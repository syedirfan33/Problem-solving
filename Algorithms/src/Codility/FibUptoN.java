package Codility;

public class FibUptoN {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {		 
			System.out.println(fib(i)+" ");
		}
	}
	static int fib(int k) {	
		if(k<=0) return 0;
		else if(k==1) return 1;
		return fib(k-1)+fib(k-2);
	}
}
