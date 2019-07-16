package Codility;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] arr1 = {3,8,9,7,6};
	int[] arr = solution(arr1 , 3);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

	public static int[] solution(int[] A, int K) {
		int num = A.length;
		int[] res = new int[num];
		for(int i=0;i<num;i++) {
			int val = i+K;
			if(val>=num) val = val%num;
			res[val] = A[i];
		}
		return res;
	}
}
