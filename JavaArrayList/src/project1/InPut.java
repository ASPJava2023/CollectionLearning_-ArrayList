package project1;

import java.util.Scanner;

public class InPut {
	Scanner sc = new Scanner(System.in);

	public Student getStudentdata() {
		System.out.println("Enter student details");
		System.out.println("Enter the Id of Student");
		int Id = sc.nextInt();
		System.out.println("Enter the Name of Student");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter the Age of Student");
		int age = sc.nextInt();
		Student student = new Student(Id,name,age);
		return student;
	}

	public int getStudentId() {
		System.out.println("Enter the Id of Student");
		int Id = sc.nextInt();
		return Id;
	}

	public int getchoice() {
		System.out.println("Select your choice ");
		int choice = sc.nextInt();
		if ((choice <= 7)) {
			return choice;
		}
		return 1;
	}

	public void menu() {
		System.out.println("Welcome to student Management Application");
		System.out.println("Enter Number from 1-7 to perform given operations");
		System.out.println(" 1 - To Load Main menu");
		System.out.println(" 2 - Add a new student to the system");
		System.out.println(" 3 - View the list of all students.");
		System.out.println(" 4 - Search for a student by ID.");
		System.out.println(" 5 - Update student details.");
		System.out.println(" 6 - Delete a student from the system.");
		System.out.println(" 7 - Exit application");
	}
}
