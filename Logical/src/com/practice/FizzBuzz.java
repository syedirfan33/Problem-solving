public class FizzBuzz {

	/**
	 * FILL IN THE CODE such that it will print number for 1 to N BUT if the number
	 * is multiple of 3, print "Fizz" instead BUT if the number is multiple of 5,
	 * print "Buzz" instead BUT if it's multiple of 3 and 5, print "FizzBuzz"
	 * instead
	 * 
	 * @param n
	 */
	public void fizzBuz(int n) {
		if (n % 3 == 0) {
			if (n % 5 == 0) {
				System.out.println("FizzBuzz"); 
			} else {
				System.out.println("Fizz"); 
			}
		} else if (n % 5 == 0) {
			System.out.println("Buzz"); 
		}

	}

	public static void main(String[] args) {
		FizzBuzz app = new FizzBuzz();
		app.fizzBuz(10);
	}
}
