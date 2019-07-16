package Udemy;

public class Triangle1 {

	public static void main(String[] args) {
		int n = 4;
		triangleUsingRecursion(3);
	}

	static void pattern1(int n) {
		int count = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<count;j++) {
				System.out.print("#");
			}
			count++;
			System.out.println();
		}
	}
	
	static void pattern1Alternative(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static int triangleUsingRecursion(int n) {
		return printStar(4,0,"");
	}
	
	static int printStar(int n, int row, String out) {
		if(n==row) {
			return 0;
		}
		
		if(n==out.length()) {
			System.out.println(out);
			
			printStar(n,row+1,"");
		}
		if(n==row) {
			System.out.println("Still coming???");
		}
		if(out.length()<=row) {
			out = out + "#";
		}else {
			out = out + " ";
		}
		printStar(n,row,out);
		return 0;
	}
}
