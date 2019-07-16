package Codility;

public class Test1 {

	public static void main(String[] args) {
		String bin = Integer.toBinaryString(6);
		
		int maxCount = 0;
		int count = 0;
		
		for(int i=0;i<bin.length();i++) {
			if(bin.charAt(i) == '1') {
				if(maxCount<count)  maxCount = count;
				count = 0;
			}if(bin.charAt(i) == '0') count+=1;
			
		}
		
		System.out.println(maxCount);
	}

	
}
