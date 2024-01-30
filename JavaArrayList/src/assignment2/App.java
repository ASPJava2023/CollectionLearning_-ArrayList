package assignment2;

import java.util.ArrayList;

/*ArrayList Initialization:

Create an ArrayList of integers and populate it with values from 1 to 10. 
Print the elements of the ArrayList.
*/
public class App {

	public static void main(String[] args) {
		// crating integers ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(i + 1);// Adding values from 1 to 10.
		}
		System.out.println(al);// printing the contents
	}
}
