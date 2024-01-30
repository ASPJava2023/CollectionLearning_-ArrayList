package assignment5;

import java.util.ArrayList;

/*ArrayList Sorting:

Create an ArrayList of strings and sort it in ascending order. 
Print the sorted list.
 *
*/
public class App {

	public static void main(String[] args) {
		// crating String ArrayList
		ArrayList<String> al = new ArrayList<>();
			al.add("Ram");// Adding values
			al.add("Mohan");
			al.add("Jhon");
			al.add("Ankit");
			al.add("Amar");
		System.out.println("contents before sorting "+al);// printing the contents before sorting
		al.sort(null);
		System.out.println("contents after sorting "+al);// printing the contents after sorting
		}
	}
