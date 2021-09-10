
public class Demo {
	public static void main(String[] args) {
		Person paul = new Person();
		paul.setName("Paul");
		System.out.println(paul.getName());
		
		Employee peter = new Employee();
		peter.setName("Peter");
		peter.setEmployeeId(1);
		System.out.println(peter.getName());
		System.out.println(peter.getEmployeeId());
		
		//peter = paul;
		paul = peter;
		paul.setName("Paul");
		System.out.println(peter.getName());
		//paul.setEmployeeId(2);
		
		Faculty patrick = new Faculty();
		patrick.setName("Patrick");
		patrick.setEmployeeId(3);
		patrick.setDepartment("CSC");
		System.out.println(patrick.getName());
		System.out.println(patrick.getEmployeeId());
		System.out.println(patrick.getDepartment());
		
		paul = patrick;
		//peter = patrick;
		//patrick = peter
	}
}
