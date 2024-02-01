package project1;
/*Student Database:
Use an ArrayList to store instances of the Student class. 
This ArrayList will act as your student database.
 */

import java.util.ArrayList;

public class StudentManagementSystem {

	private ArrayList<Student> studentDB;

	public StudentManagementSystem() {

		this.studentDB = new ArrayList<Student>();
	}

	// Adding Methods
//Add a new student to the system.
	public void addStudent(Student student) {
		studentDB.add(student);
	}

//displayAllStudents
	public void displayAllStudents() {
		System.out.println("List of all students are :");
		for (Student student : studentDB) {
			System.out.println("=====================");
			System.out.println("Student Id :" + student.getId());
			System.out.println("Student Name :" + student.getName());
			System.out.println("Student Age :" + student.getAge());
			System.out.println("=====================");
		}
	}

//searchStudentById
	public Student searchStudentById(int Id) {
		for (Student student : studentDB) {
			if (Id == student.getId()) {
				return student;
			} else {
				System.out.println("Enter Right Id");
				return null;
			}
		}
		return null;
	}

//updateStudentDetails
	public void updateStudentDetails(int Id, Student newstudent) {
		if (searchStudentById(Id) != null) {
			Student student = searchStudentById(Id);
			int indext = studentDB.indexOf(student);
			studentDB.set(indext, newstudent);
			return;
		}
		System.out.println("Enter Right Id");
	}

	public void deleteStudentById(int Id) {
		for (Student student : studentDB) {
			if (student.getId() == Id) {
				studentDB.remove(student);
				System.out.println(" The given student removed !");
				return;
			}
			System.out.println("Enter Right Id");
		}
	}
}
