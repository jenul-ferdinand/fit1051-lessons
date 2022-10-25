package task2_remainder_operator;

// Using the remainder operator (%) code and test a boolean expression that returns true if an integer variable
// “n” is not an even number and greater than 15.

public class Main {
	public static void main(String[] args) {
		// List of numbers to test
		int[] numbers = {0, 3, 5, 34, 10321323};

		// Loop through the numbers list
		for (int i = 0; i < numbers.length; i++) {
			// Check if number is even.
			boolean even = numbers[i] % 2 == 0; // If there is no remainder, that means it is even.

			// Output
			System.out.println("is the number " + numbers[i] + " even?: " + even);
		}
	}
}
