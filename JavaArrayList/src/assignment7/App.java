package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ArrayList with User Input:
Write a Java program that takes user input to add elements 
to an ArrayList dynamically until the user decides to stop. 
Print the final ArrayList.
*/
public class App {

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<>();
		Scanner Sc = new Scanner(System.in);
		boolean wish = true;
		while(wish) {
		
		System.out.println("Enter the Student Name :");
		String sName = Sc.nextLine();
		Sc.nextLine();
		System.out.println("Enter the Student Age :");
		int sAge =Sc.nextInt();
		slist.add(new Student(sName,sAge));
		System.out.println("Do you want to add more students ?(Yes/No):");
		String choice = Sc.next();
		if(choice.equalsIgnoreCase("Yes") ||choice.equalsIgnoreCase("Y")) {
			}
		else {
			wish = false;	
		}
	}
		System.out.println("The details of students are :-");
		for (Student student : slist) {
			System.out.println("The name of student is "+student.getName());
			System.out.println("The Age of student is "+student.getAge());
			System.out.println("================================");
		    Sc.close();
		}
	}
	
}