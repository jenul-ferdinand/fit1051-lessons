package task1_boolean_expression;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year;
		boolean yearTest = true;

		System.out.print("Enter Year:");
		year = scanner.nextInt();

		// yearTest = year != 2021 || year != 2022; // This will always be true so it is wrong.

		yearTest = year == 2021 || year == 2022; // This is what was supposed to be written.

		System.out.println(yearTest);
	}
}
