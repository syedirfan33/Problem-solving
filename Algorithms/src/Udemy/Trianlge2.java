package Udemy;

public class Trianlge2 {

	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++) {
			String out = "";
			int mid = (int) Math.floor((2*n-1)/2);
			for(int j=0;j<(2*n)-1;j++) {
				if(j>=mid-i && j<=mid+i) {
					out = out + "#";
				}else {
					out = out + " ";
				}
			}
			System.out.println(out);
		}
	}
}
