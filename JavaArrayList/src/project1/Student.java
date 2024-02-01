package project1;
/*Requirements:
Student Class:
Create a Student class with attributes such as id, name, age, and grade.
Include appropriate constructors and getter/setter methods.
 */

public class Student {
private int id;
private String name;
private double age;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, double age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}

}
