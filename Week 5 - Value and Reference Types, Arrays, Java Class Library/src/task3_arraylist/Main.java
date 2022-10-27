package task3_arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 1. declare an array list named “aList”
		ArrayList<Integer> array = new ArrayList<>();

		// 2. add numbers: 20, 10, 9
		array.add(20);
		array.add(10);
		array.add(9);

		// 3. insert the value 33 between 20 and 10
		array.add(1, 33);
		System.out.println("> added 33 between 20 and 10");

		// 4. print all the elements in the aList
		System.out.println("Original Array: " + array);

		// 5. delete the last element in aList
		array.remove(array.size() - 1);
		System.out.println("> removed integer 9 from array");

		// 6. print “true” if the “aList” contains 9; false otherwise
		System.out.println("New Array: " + array);
		System.out.println("Does array contain 9?: " + array.contains(9));
	}
}
