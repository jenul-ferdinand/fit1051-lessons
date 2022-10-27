package task2_method_coding2;

public class Main {
	public static void main(String[] args) {

		// Create instance of this class to call methods
		Main main = new Main();

		// Testing method
		System.out.println(main.coneVolume(12, 6));
	}

	// Cone Volume
	private double coneVolume(double height, double radius) {
		return 0.33 * (Math.PI * Math.pow(radius, 2) * height);
	}
}
