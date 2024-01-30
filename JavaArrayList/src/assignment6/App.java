package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

/*ArrayList Searching:
Implement a Java program that searches for a specific element in an ArrayList. 
Print whether the element is found or not.
 *
*/
public class App {

	public static void main(String[] args) {
		System.out.println("Enter specific element ");
		Scanner sc = new Scanner(System.in);
		String specificElement = sc.next();
		// crating String ArrayList
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");// Adding values
		al.add("Mohan");
		al.add("Jhon");
		al.add("Ankit");
		al.add("Amar");

		if (al.contains(specificElement)) {
			System.out.println("The Given element " + specificElement + " Present on index " + al.indexOf(specificElement));
		} else {
			System.out.println("The Given element" + specificElement + " Not found in array");
			System.out.println("contents list " + al);// printing the contents before sorting
		}
	}
}