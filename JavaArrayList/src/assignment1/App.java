package assignment1;

import java.util.ArrayList;

/*Basic ArrayList Operations:

Write a Java program that demonstrates the basic operations of 
ArrayList, including 
adding elements, removing elements, and printing the contents.
*/
public class App {

	public static void main(String[] args) {
	//crating ArrayList
	ArrayList al = new ArrayList();
	al.add(101);//adding elements 
	al.add(102);
	al.add("Ram");
	al.add(null);
	al.add("sham");
	al.add(101.2);
	
	System.out.println(al);//printing the contents
	al.remove(1);//removing elements
	System.out.println(al);//Re-printing the elements of ArrayList
	}
}
