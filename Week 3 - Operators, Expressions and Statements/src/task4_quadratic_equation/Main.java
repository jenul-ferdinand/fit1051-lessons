package task4_quadratic_equation;

// Write code to find the roots of the quadratic equation ax2 + bx + c = 0.

public class Main {
	public static void main(String[] args) {
		// Values
		int a = 1;
		int b = 5;
		int c = 4;

		// Calculation
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		double posFormula = (-b + Math.sqrt(discriminant)) / 2 * a;
		double negFormula = (-b - Math.sqrt(discriminant)) / 2 * a;

		// Output
		System.out.println(posFormula);
		System.out.println(negFormula);
	}
}
