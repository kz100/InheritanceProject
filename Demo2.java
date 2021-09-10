import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Person currentPerson = null;
		Employee currentEmployee = null;
		Faculty currentFaculty = null;
		
		int option;
		
		do {
			System.out.println("Press 1 to track a new Person");
			System.out.println("Press 2 to track a new Employee");
			System.out.println("Press 3 to track a new Faculty");
			System.out.println("Press 4 to view all information");
			System.out.println("Press 5 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				//System.out.println("What is the name of the new?");
				
				//String newName = keyboard.nextLine();
				//currentPerson = new Person(newName);
				currentPerson = new Person();
				enterName(currentPerson);
			}
			else if(option == 2) {
				//System.out.println("What is the name of the new Employee?");
				//String newName = keyboard.nextLine();
				//System.out.println("What is the employee id of the new Employee?");
				//int newEmployeeId = keyboard.nextInt();
				//currentEmployee = new Employee(newName,newEmployeeId);
				
				currentEmployee = new Employee();
				enterName(currentEmployee);
				enterEmployeeId(currentEmployee);
			}
			else if(option == 3) {
				//System.out.println("What is the name of the new Faculty?");
				//String newName = keyboard.nextLine();
				//System.out.println("What is the employee id of the new Faculty?");
				//int newEmployeeId = keyboard.nextInt();
				//keyboard.nextLine(); //go to the next line
				//System.out.println("What is the department of the new Faculty?");
				//String newDepartment = keyboard.nextLine();
				//currentFaculty = newFaculty(newName,newEmployeeId,newDepartment);
				
				currentFaculty = new Faculty();
				enterName(currentFaculty);
				enterEmployeeId(currentFaculty);
				enterDepartment(currentFaculty);
			}
			else if(option == 4) {
				if(currentPerson != null) {
					System.out.println("Person's Name: " + currentPerson.getName());
				}
				
				if(currentEmployee != null) {
					System.out.println("Employee's Name: " + currentEmployee.getName());
					System.out.println("Employee's Id: " + currentEmployee.getEmployeeId());
				}
				
				if(currentFaculty != null) {
					System.out.println("Faculty's Name: " + currentFaculty.getName());
					System.out.println("Faculty's Id: " + currentFaculty.getEmployeeId());
					System.out.println("Faculty's Department: " + currentFaculty.getDepartment());
				}
			}
			else if(option == 5) {
				System.out.println("Thank you for using our program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option !=5);
	}
	
	public static void enterName(Person p) {
		Scanner keyboard = new Scanner(System.in);
		if(p != null) {
			System.out.println("Enter the name");
			String newName = keyboard.nextLine();
			p.setName(newName);
		}
	}
	
	public static void enterEmployeeId(Employee e) {
		Scanner keyboard = new Scanner(System.in);
		if(e != null) {
			System.out.println("Enter the employee id");
			int newEmployeeId = keyboard.nextInt();
			e.setEmployeeId(newEmployeeId);
		}
	}
	
	public static void enterDepartment(Faculty f) {
		Scanner keyboard = new Scanner(System.in);
		if(f != null) {
			System.out.println("Enter the department");
			String newDepartment = keyboard.nextLine();
			f.setDepartment(newDepartment);
		}
	}
}


