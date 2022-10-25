package task3_leap_year;

// Google the definition of a leap year. Write a boolean expression that returns true if the integer variable “year”
// is a leap year.

public class Main {
	public static void main(String[] args) {
		int number = 2021;

		boolean leapYear = (number % 4 == 0 && number % 100 != 0);
	}
}
