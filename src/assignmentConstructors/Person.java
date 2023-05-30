package assignmentConstructors;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;

		System.out.println(name + " " + age + " " + gender + " " + height);
		Person p3 = new Person("Vivek");
	}

	public Person(String name) {
		this.name = name;

		System.out.println(name);

		testmethod();
	}

	public void testmethod() {
		System.out.println("testmethod");
	}

	public static void main(String[] args) {

		Person p1 = new Person("Pooja", 25, 'F', 5.5);

		Person p2 = new Person("Vivek");

	}

}

/*
 * What is the purpose of a constructor in Java? -- Constructor purpose is to
 * restrict the unnecessary object creation.
 * 
 * How does a constructor differ from a regular method in Java? -- constructor
 * cannot have any return type or void and it cannot have any business logic --
 * Methods can have any return type or void and it will have business logic
 * 
 * Can a Java class have multiple constructors? If so, how are they
 * differentiated? --Yes we can have multiple constructors and they are
 * differentiated with different type of parameters(method overloading)
 * 
 * What happens if a constructor is not defined in a Java class? -- Default
 * constructor which is hidden will be called by JVM at the run time
 * 
 * Can a constructor call other methods or constructors within the same class?
 * -- yes its allowed
 * 
 */
