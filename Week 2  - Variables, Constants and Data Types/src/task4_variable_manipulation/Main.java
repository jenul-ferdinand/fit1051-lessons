package task4_variable_manipulation;

public class Main {
	public static void main(String[] args) {
		// Without using variables
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(1 + 2 + 3);

		// Using 3 independent variables (one for each number) and another variable for their sum
		int x1 = 1;
		int x2 = 2;
		int x3 = 3;
		int sum = x1 + x2 + x3;

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(sum);

		// Reusing one variable for the numbers and one additional variable for their sum
		int var = 1;
		int sum2 = var + var*2 + var*3;

		System.out.println(var);
		System.out.println(var*2);
		System.out.println(var*3);
		System.out.println(sum2);

		// The best method to do this is without using variables for the numbers, since they are not complex.
		// Yes you can use one variable.
	}
}
