package task2_array_manipulations;

public class Main {
	public static void main(String[] args) {
		// Array initialisation
		int[] array = {1, 9, 2, 34};

		// write a piece of code that prints the content of the array in backward order (i.e. reverse)
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.println("Index " + j + ": " + array[j]);
		}

		// write a piece of code that prints the last element of the array. Prove that it works regardless of array size.
		System.out.println(array[array.length - 1]);

		// write a piece of code that shows ArrayOutOfBoundExceptionError
		for (int i = 0; i <= array.length; i++) {
			System.out.println("Index " + i + ": " + array[i]);
		}
	}
}
