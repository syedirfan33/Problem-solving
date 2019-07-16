package Codility;

public class Code1 {

	public static void main(String[] args) {
		String n = Integer.toBinaryString(4);
		int c = 0;
		int mc = 0;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i) == '1') {
				if(mc<c) mc = c;
				c = 0;		
			}else {
				c+=1;
			}
		}
		System.out.println(mc);

	}

}
