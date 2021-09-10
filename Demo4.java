import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Person [] csc202Array = new Person[26];
		int studentIndex = 1;
		int option;
		
		do {
			System.out.println("Press 1 to assign a new Professor to this class");
			System.out.println("Press 2 to add a new Student to this class");
			System.out.println("Press 3 to see everyone in the class including the Professor");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("What is the name of the new Professor?");
				String newName = keyboard.nextLine();
				System.out.println("What is the employee id of the new Professor?");
				int newEmployeeId = keyboard.nextInt();
				keyboard.nextLine(); //go to the next line
				System.out.println("What is the department of the new Professor?");
				String newDepartment = keyboard.nextLine();
				Faculty currentFaculty = new Faculty(newName,newEmployeeId,newDepartment);
				csc202Array[0] = currentFaculty;
			}
			else if(option == 2) {
				System.out.println("What is the name of new Student?");
				String newName = keyboard.nextLine();
				System.out.println("What is the student id of the new Student?");
				int newStudentId = keyboard.nextInt();
				Student currentStudent = new Student(newName,newStudentId);
				
				if(studentIndex < csc202Array.length) {
					//check for duplicates is with the equals
					boolean alreadyRegistered = false;
					int index = 1;
					while(!alreadyRegistered && index < studentIndex) {
						if(csc202Array[index].equals(currentStudent)) {
							alreadyRegistered = true;
						}
						else {
							index++;
						}
					}
					
					if(!alreadyRegistered) {
						csc202Array[studentIndex] = currentStudent;
						studentIndex++;
					}
					else {
						System.out.println("This student already registered for this class!");
					}
				}
				else {
					System.out.println("The class is full! No more student can be added!");
				}
			}
			else if(option == 3) {
				if(csc202Array[0] != null) {
					System.out.println(csc202Array[0].toString());
				}
				for(int index = 1; index < studentIndex; index++) {
					System.out.println(csc202Array[index].toString());
				}
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);
	}
}