package javasessions;

public class StaticNonStaticMethods {

	public static void st1() {
		System.out.println("Static method 1");
	}

	public static void st2() {
		System.out.println("Static method 2");
		//calling non static method in static class
		StaticNonStaticMethods obj1 = new StaticNonStaticMethods();
		obj1.nst2();
	}

	public static void st3() {
		System.out.println("Static method 3");
	}

	public void nst1() {
		System.out.println("Non Static method 1");
		//calling static method in non static method
		st1();
	}

	public void nst2() {
		System.out.println("Non Static method 2");
		//calling non static method in non static method
		nst1();
	}

	public void nst3() {
		System.out.println("Non Static method 3");
		//calling static method in non static method
		StaticNonStaticMethods.st3();
	}

	public static void main(String[] args) {
		// call static method in static method
		st1();
		StaticNonStaticMethods.st2();
		st3();

		//calling non static method in static class
		StaticNonStaticMethods obj = new StaticNonStaticMethods();
		obj.nst1();
	}

}
