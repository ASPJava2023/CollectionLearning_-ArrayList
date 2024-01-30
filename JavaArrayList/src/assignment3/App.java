package assignment3;

import java.util.ArrayList;

/*ArrayList Basic Methods:

Explain and demonstrate the usage of 
add, remove, get, and size methods of ArrayList.
*/
public class App {

	public static void main(String[] args) {
		// crating integers ArrayList
		ArrayList al = new ArrayList();
			al.add(10);// Adding values 
			al.add("Ram");
			al.add("Sita");
			al.add(null);
			al.add("Ram");
			al.add(109);
		System.out.println("Check the size of ArrayList it is "+al.size());//size methods of ArrayList.	
		System.out.println(al);// printing the contents
		al.remove("Ram");
		System.out.println(al);// Re-printing the contents
		System.out.println(al.get(3));// Get method
	}
}
