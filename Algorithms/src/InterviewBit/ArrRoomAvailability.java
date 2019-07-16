package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrRoomAvailability {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(10);A.add(2);A.add(3);A.add(4);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(10);B.add(2);B.add(6);B.add(14);
		
		System.out.println(isAvailable(A,B,4));
	}

	public static boolean isAvailable(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
		Collections.sort(arrive);
		Collections.sort(depart);
		System.out.println(Arrays.toString(depart.toArray()));
		System.out.println(Arrays.toString(arrive.toArray()));

		k--;
		for(int i=1;i<arrive.size();i++) {
			if(depart.get(i-1)>arrive.get(i)) k--;
			if(depart.get(i-1)<arrive.get(i)) k++;
			if(k<=0) return false;
		}
		System.out.println(k);
		if(k>=0) return true;
		return false;
	}
}
