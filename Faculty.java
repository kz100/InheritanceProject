
public class Faculty extends Employee {
	private static String newEmployeeId;
	//instance variables
	//create department instance variable that is private
	private String department;
	
	//default constructor
	//call constructor of the parent class
	//setDepartment to blank
	public Faculty() {
		super(); //call the default constructor of the parent (Employee)
		department = "";
	}
	
	public Faculty(String newName) {
		super(newName);
		department = "";
	}
	
	public Faculty(String newName, int newEmployeeId) {
		super(newName, newEmployeeId);
		department = "";
	}
	
	public Faculty(String newName, int newEmployeeId, String newDepartment) {
		super(newName, newEmployeeId);
		setDepartment(newDepartment);
	}
	
	public Faculty(int newEmployeeId) {
		super(newEmployeeId);
		department = "";
	}
	
	public Faculty(int newEmployyId, String newDepartment) {
		super(newEmployeeId);
		setDepartment(newDepartment);
	}
	
	public Faculty(String newName, String newDepartment) {
		super(newName);
		setDepartment(newDepartment);
	}
	
	//setDepartment
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	
	//getDepartment
	public String getDepartment() {
		return department;
	}
	
	//override the toString method from Employee to return name, employeeId, and department
	public String toString() {
		return super.toString() + " Department: " + department;
	}
	
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Faculty) {
			Faculty otherFaculty = (Faculty) otherObject;
			if(super.equals(otherObject) &&
					this.department.equals(otherFaculty.department)) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
}
