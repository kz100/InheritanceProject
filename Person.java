
public class Person extends Object {
	//instance variables
	private String name;
	
	//default constructor
	public Person() {
		super(); //calls the default constructor of the parent class (object)
		name = "";
	}
	
	//overloaded constructor
	public Person(String newName) {
		super();
		name = newName;
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	//override the toString method from the Object class by replacing the method
	//that is inherited from the Object class with a new version of that method
	//which has the same method heading as the method in the Object class, but has a different implementation
	public String toString() {
		return "Name: " + name;
	}
	
	//override the equals method from the Object class by replacing the method
	//that is inherited from the Object class with a new version of that method
	//which has the same method heading as the method in the Object class, but has a different implementation
	//this version will compare the name instance variables instead of the comparing the references
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Person) {
			Person otherPerson = (Person) otherObject;
			if(this.name.equals(otherPerson.name)) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
}

