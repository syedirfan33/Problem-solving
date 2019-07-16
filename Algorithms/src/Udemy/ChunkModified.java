package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkModified {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		int size = 3;
		List<ArrayList<Integer>> out = new ArrayList<>();
		out.add(new ArrayList<>());
		for(int i=0;i<input.length;i++) {
			ArrayList<Integer> last = out.get(out.size()-1);
			if(last==null || last.size()==size) {
				ArrayList<Integer> item = new ArrayList<>();
				item.add(input[i]);
				out.add(item);
			}else {
				last.add(input[i]);
			}
		}
		System.out.println(Arrays.deepToString(out.toArray()));
			
	}

}
