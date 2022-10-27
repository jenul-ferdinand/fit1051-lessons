package task1_method_coding1;

// Remember what we did in Week 3 Applied on quadratic equation? Using the same information below, code it as a
// private method and test it in your main class. You may declare a, b, and c as local variable and initialised them
// within the method.

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		double[] arr;
		arr = main.getRoots(1,5,4);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

	//Code your method here
	private double[] getRoots(double a, double b, double c) {
		double[] result = {0, 0};
		double discriminant = b*2 - 4*a*c;
		//if (discriminant >= 0) {
		result[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
		result[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
		//}

		return result;
	}
}
