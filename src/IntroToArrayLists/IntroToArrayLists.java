package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> People = new ArrayList<String>();
		// 2. Add five Strings to your list
		People.add("Coach");
		People.add("Jack");
		People.add("Nancy");
		People.add("Roberto");
		People.add("Denis");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < People.size(); i++) {
			System.out.println(People.get(i));
		}
		System.out.println("");
		// 4. Print all the Strings using a for-each loop
		for (String s : People) {
			System.out.println(s);
		}
		System.out.println("");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < People.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(People.get(i));
			}
		}
		System.out.println("");
		// 6. Print all the Strings in reverse order.
		for (int i = People.size() - 1; i >= 0; i--) {
			System.out.println(People.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for (String s : People) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
