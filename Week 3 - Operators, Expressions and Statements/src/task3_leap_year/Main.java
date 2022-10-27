package task3_leap_year;

// Google the definition of a leap year. Write a boolean expression that returns true if the integer variable “year”
// is a leap year.

public class Main {
	public static void main(String[] args) {
		// The list of years to test
		int[] years = {2021, 2010, 1832, 1966, 2003, 1977, 1980};

		// Loop through all the years
		for (int i = 0; i < years.length; i++) {
			// The calculation for true or false
			boolean isLeapYear = ((years[i] % 4 == 0) && (years[i] % 100 != 0) || (years[i] % 400 == 0));
			// This is the string manipulation for true or false
			String str = isLeapYear ? "is" : "is not";
			// Output
			System.out.println("The year " + years[i] + " " + str + " a leap year.");
		}
	}
}
