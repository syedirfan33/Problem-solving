package Codility;

import java.util.Scanner;

public class AandB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder out = new StringBuilder(a + b);
		int c = a;
		int d = b;
		if (a > b) {

			while (a > 0) {
				out.append("a");
				a--;
			}
			for (int i = 2; i < c + d; i = i + 4) {
				while (b > 0) {
					if (b == 1) {
						out.insert(i, "b");
						b--;
					} else {
						out.insert(i, "bb");
						b -= 2;
						break;
					}
				}
			}
			int e = out.length();
			if (e < c + d) {
				int num = c + d - e;
				while (num > 0) {
					out.append("b");
					num--;
				}
			}
		} else if (a < b) {

			while (b > 0) {
				out.append("b");
				b--;
			}

			for (int i = 2; i < c + d; i = i + 4) {
				while (a > 0) {
					if(a ==1) {
						out.insert(i, "a");
						a--;
					} else {
						out.insert(i, "aa");
						a -= 2;
						break;
					}
				}
			}
			int e = out.length();
			if (e < c + d) {
				int num = c + d - e;
				while (num > 0) {
					out.append("a");
					num--;
				}
			}
		} else {
			while (a > 0) {
				out.append("a");
				out.append("b");
				a--;
			}
		}
		System.out.println(out);

	}
}
