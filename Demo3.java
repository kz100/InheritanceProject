
public class Demo3 {
	public static void main(String[] args) {
		Person peter = new Person("Peter");
		System.out.println(peter.toString());
		
		Employee paul = new Employee("Paul",1);
		System.out.println(paul.toString());
		
		Faculty mary = new Faculty("Mary",2,"MUS");
		System.out.println(mary.toString());
		
		int x = 5;
		int y = 6;
		if(x == y) {
			System.out.println("X and Y have the same value");
		}
		else {
			System.out.println("X and Y don't have the same value");
		}
		
		Person petersTwin = new Person("Peter");
		//peter = petersTwin;
		if(peter.equals(petersTwin)) {
			System.out.println("They have the same name");
		}
		else {
			System.out.println("They don't have the same name");
		}
		
		Employee emily1 = new Employee("Emily",1);
		Employee emily2 = new Employee("Emily",2);
		
		if(emily1.equals(emily2)) {
			System.out.println("They are the same person");
		}
		else {
			System.out.println("They are not the same person");
		}
	}

}
