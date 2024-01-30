package assignment4;

import java.util.ArrayList;

/*ArrayList Iteration:

Write a program that uses an enhanced for loop 
to iterate over an ArrayList of strings and prints each element.
*/
public class App {

	public static void main(String[] args) {
		// crating integers ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i <=10; i++) {
			al.add(100+i);// Adding values
		}
		System.out.println(al);// printing the contents using for Loop
		for (Integer it : al) {
			System.out.println(it);
		}
		
		
	}
}
