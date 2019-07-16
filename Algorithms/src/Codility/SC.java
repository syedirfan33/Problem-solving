package Codility;

public class SC {

	public static void main(String[] args) {
		try {
			System.out.println(diff(args));
		}catch(Exception e) {
			System.out.println("coming");
		}
		diff(args);
		new Thread("High");

	}

	static int diff(String[] args) {
		return Integer.parseInt(args[0]);
	}
}
