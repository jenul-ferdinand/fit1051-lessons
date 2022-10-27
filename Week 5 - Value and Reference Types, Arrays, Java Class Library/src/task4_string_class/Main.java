package task4_string_class;

// Write code that converts a word with letters in random upper and lower case to the same word with the first letter
// upper case and the other letters lower case.

// Test your code by performing the conversion for several different input words (Hint: we don’t expect the string to
// consist of many words or many sentences – just one word will do!)

public class Main {
	public static void main(String[] args) {
		originalString = "CaTAStroPhE";
	    capString = originalString.substring(0, 1).toUpperCase() + originalString.substring(1);

		System.out.println(capString);
	}
}
