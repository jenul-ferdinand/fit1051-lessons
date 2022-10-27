package task4_variable_lifetime;

// Code a calling and called method that demonstrates that a called method cannot remember how many times lit has been
// called if it’s limited to only using its formal parameters and local variables. You will need to use a class level
// and a method level variable to do this.

public class Main {
	private static int number = 0;

	public static void main(String[] args) {

		// Create an instance of this class
		Main main = new Main();

		// Call method here
		main.callingMethod(number);
	}

	public int calledMethod(int n) {
		n++;

		return n;
	}

	public int callingMethod(int n) {
		int num = 0;

		calledMethod(num);

		n++;

		return n;
	}
}
