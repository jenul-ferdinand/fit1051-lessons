package task2_data_types;

// 1. Explain why statement @ line7 prints 0.0. You may write your explanation as inline comment
// 2. Update the code such that it prints 0.5 (with explanation).

public class Main {
	public static void main(String[] args) {
		int i1 = 1;
		int i2 = 2;
		double d3;

		d3 = i1 / i2;
		System.out.println("Integer Division: (i1 / i2) = " + d3);

		// i1 divided by i2 theoretically should be equal to 0.5
		// but since we are dividing two integers the decimal is
		// rounded down.

		double f1 = 1, f2 = 2;
		double f3 = f1 / f2;

		System.out.println("Proper Division: (f1 / f2) = " + f3);
		System.out.println("\ni1 / i2 theoretically should equal to 0.5, but since we are dividing two integers the " +
				"decimal is rounded down.");
		System.out.println("This is why f1 / f2 is equal to 0.5, this is because f1 and f2 were initialised at double");
	}
}