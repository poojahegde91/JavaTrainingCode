package constructorConcepts;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee()
	{
		System.out.println("Default constructor");
	}
	public Employee(int i)
	{
		System.out.println("1 Parameter constructor " + i);
	}
	
	public Employee(int j, String s)
	{
		System.out.println("2 Parameter constructor " + j + " " + s);
	}

	public static void main(String[] args) {
	
		Employee obj = new Employee();
		obj.name = "Pooja";
		obj.age = 25;
		obj.salary = 42.22;
		
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20, "Poo");
		
		

	}

}
