package project1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InPut inPut = new InPut();
		StudentManagementSystem sms = new StudentManagementSystem();

		while (true) {
			int choice = 1;
			inPut.menu();
			choice = inPut.getchoice();
			switch (choice) {
			case 1: {
				inPut.menu();
				choice = inPut.getchoice();
				break;
			}
			case 2: {
				Student student = inPut.getStudentdata();
				sms.addStudent(student);
				// sms.displayAllStudents();
				break;
			}
			case 3: {
				sms.displayAllStudents();
				break;
			}
			case 4: {
				int i = inPut.getStudentId();
				Student student = sms.searchStudentById(i);
				if (student != null) {
					System.out.println(student.toString());
				}
				break;
			}
			case 5: {
				int i = inPut.getStudentId();
				sms.searchStudentById(i);
				Student student = inPut.getStudentdata();
				sms.updateStudentDetails(i, student);
				break;
			}
			case 6: {
				int i = inPut.getStudentId();
				sms.deleteStudentById(i);
				break;
			}
			case 7: {
				System.out.println("Thanks ");
				System.exit(0);
			}
			}
		}
	}
}