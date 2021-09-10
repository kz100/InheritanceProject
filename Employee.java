
public class Employee extends Person {
	//instance variables
	private int employeeId;
	
	//default constructor
	public Employee() {
		super(); //call the default constructor of the parent class (Person)
		employeeId = 0;
	}
	
	public Employee(String newName) {
		super(newName);
		employeeId = 0;
	}
	
	public Employee(String newName, int newEmployeeId) {
		super(newName);
		setEmployeeId(newEmployeeId);
	}
	
	public Employee(int newEmployeeId) {
		super();
		setEmployeeId(newEmployeeId);
	}
	
	//non-static methods
	public void setEmployeeId(int newEmployeeId) {
		if(newEmployeeId > 0) {
			employeeId = newEmployeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	//override the toString method in the Employee class returning the name and the employee id
	public String toString() {
		return super.toString() + "Employee Id: " + employeeId;
	}
	
	//return true if name and employee id are equal
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Employee) {
			Employee otherEmployee = (Employee) otherObject;
			if(super.equals(otherObject) &&
					this.employeeId == otherEmployee.employeeId) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
	
}
