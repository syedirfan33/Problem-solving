package InterviewBit;

import java.util.ArrayList;

public class ArrMoveGrid {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(-7);A.add(-13);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);B.add(-5);
		
		System.out.println(coverPoints(A,B));
	}
	
	public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		int x, y, total_steps = 0;
		
		for(int i=0;i<A.size()-1;i++) {
			int curr_x = A.get(i+1) - A.get(i);
			x = curr_x < 0 ? curr_x * (-1) : curr_x; 
			int curr_y = B.get(i+1) - B.get(i);
			y = curr_y < 0 ? curr_y * (-1) : curr_y;
			
			total_steps = total_steps+ (x >= y ? x :y);
		}
		
		return total_steps;
    }
}
