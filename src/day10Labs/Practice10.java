package day10Labs;

public class Practice10 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setFirstName("John");
		
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee("Jason", "Scott", 92000);
		
		System.out.println(e2.getFirstName());

	}

}
