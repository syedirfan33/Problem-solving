package Codility;

import java.util.Optional;

public class NullPointer {

	public static void main(String[] args) {
		Boolean b = null;
		System.out.println(Optional.ofNullable(isDenied()).orElse(false));		

	}

	public static Boolean isDenied() {
		return null;
	}
}
