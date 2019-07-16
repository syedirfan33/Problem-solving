package Codility;

public class Array {

	public static void main(String[] args) {
		int[] intArr = solution(1);
		 for(int i=0;i<2;i++) {
			 System.out.println(intArr[i] + " ");
		 }
	}
	
	 public static int[] solution(int N) {
		 int[] intArr = new int[N];
		 if(N==1) {
			 intArr[0] = 0;
		 }else {
			 int sum = 0;
			 for(int i=0;i<N-1;i++) {
				 intArr[i] = i + 1;
				 sum += intArr[i];
			 }
			 intArr[N - 1] = -(sum);
		 }
		return intArr;	 
	 }
	     

}
