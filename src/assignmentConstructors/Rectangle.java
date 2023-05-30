package assignmentConstructors;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		length = 0.0;
		width = 0.0;
		System.out.println("Area of a rectangle is " + calculateArea());
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("Area of a rectangle is " + calculateArea());
	}

	public double calculateArea() {
		double area = length * width;
		return area;
	}

	public static void main(String[] args) {

		Rectangle rt = new Rectangle();
		Rectangle rt1 = new Rectangle(5.2, 4.3);
	}

}

/*
 * What is the purpose of a default constructor in Java?
 * -- Default constructor allow us to initialize the instance variables.
 * 
 * How can you differentiate between a default constructor and a constructor
 * that takes in parameters? 
 * -- using method signature, if we pass any parameter it is parameterized constructor 
 * or no parameter constructor
 * 
 * What is the access level of a constructor in Java? 
 * --constructor will be visible only in its package.
 * 
 * within the class Can a constructor be private? If so, why would you want to make a constructor
 * private?
 * --Java allows us to declare a constructor as private. We can declare
 * a constructor private by using the private access specifier. Note that if a
 * constructor is declared private, we are not able to create an object of the
 * class. Instead, we can use this private constructor in Singleton Design
 * Pattern.
 * 
 * It does not allow a class to be sub-classed. It does not allow to create an
 * object outside the class. If a class has a private constructor and when we
 * try to extend the class, a compile-time error occurs. We cannot access a
 * private constructor from any other class. If all the constant methods are
 * there in our class, we can use a private constructor. If all the methods are
 * static then we can use a private constructor. We can use a public function to
 * call the private constructor if an object is not initialized. We can return
 * only the instance of that object if an object is already initialized.
 * 
 * Can a constructor call a method from another class? 
 * --No, you cannot call a constructor from a method.
 * The only place from which you can invoke
 * constructors using “this ()” or, “super ()” is the first line of another
 * constructor. If you try to invoke constructors explicitly elsewhere, a
 * compile time error will be generated.
 * 
 */