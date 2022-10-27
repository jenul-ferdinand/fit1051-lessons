package task1_side_effects;

// Code a calling and a called method that demonstrates that actual parameters that are variables of value types do not
// have side effects; but those of reference types can have such effects. Include appropriate display instructions to
// prove the point.

public class Main {
	// Main method
	public static void main(String[] args) {
		// Create an instance of the 'Main' class
		Main main = new Main();

		// Values to add
		int value1 = 10;
		int value2 = 5;

		// Call the method
		main.add(value1, value2);

		// The values did not get effected, so there were no side effects.
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
	}

	// Addition method
	public int add(int a, int b) {
		// Calculate the total value
		int total = a + b;

		// Print the total value
		System.out.println(total);

		// Return the total value
		return total;
	}
}
