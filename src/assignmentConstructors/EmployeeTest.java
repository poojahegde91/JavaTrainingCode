package assignmentConstructors;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(23652, "Pooja", 10.75);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		e1.setSalary(10.75+(10.75*0.10));
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}

}
