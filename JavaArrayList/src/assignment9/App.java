package assignment9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*ArrayList Challenges:
Implement a program that removes all duplicates from an ArrayList of strings.
Print the modified ArrayList.
 * 
*/
public class App {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");
		al.add("Sham");
		al.add("Sita");
		al.add("John");
		al.add("Sham");
		al.add("Sham");
		al.add("Sham");
		
		System.out.println("All values :"+al);
		HashSet<String> uh = new HashSet<>();
		uh.addAll(al);
		al.clear();
		System.out.println("modified Hashset"+uh);
		al.addAll(uh);
		System.out.println("modified without duplicate ArrayList"+al);
		al.sort(null);
		System.out.println("Sorted Array Listwithout duplicate ArrayList"+al);
	}
}