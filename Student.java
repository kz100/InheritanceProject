
public class Student extends Person {
	//instance variables
	//student id which should be a whole number
	private int studentId;
	
	//default constructor
	public Student() {
		super();
		studentId = 0;
	}
	//constructor that takes a name
	public Student(String newName) {
		super(newName);
		studentId = 0;
	}
	//constructor that takes name and student id
	public Student(String newName, int newStudentId) {
		super(newName);
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
		else {
			studentId = 0;
		}
	}
	
	//constructor that takes student id
	public Student(int newStudentId) {
		super();
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
		else {
			studentId = 0;
		}
	}
	
	//setStudentId (studentId > 0)
	public void setStudentId(int newStudentId) {
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	//getStudentId
	public int getStudentId() {
		return studentId;
	}
	
	//override toString from Person class to return name and studentId
	public String toString() {
		return super.toString() + " StudentId: " + studentId;
	}
	
	//override equals method from Person class to compare name and studentId
	//return true only if name and studentId are equal
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Student) {
			Student otherStudent = (Student) otherObject;
			if(super.equals(otherObject) &&
					this.studentId == otherStudent.studentId) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
}